package jsp.grooming4pm;

import java.util.ArrayList;
import java.util.List;

public class SumOF4ele {
	public static void main(String[] args)
	{

//		int a[]= {1,0,-1,0,-2,2};
		int[] a= {2,2,2,2,2};
		int tar=8;

		List<List<Integer>> rs=get4sum(a,tar);
		System.out.println(rs);

	}

	private static List<List<Integer>> get4sum(int[] a, int tar) 
	{
		List<List<Integer>> f=new ArrayList<>();

		for (int i = 0; i < a.length; i++)
		{
			for (int j = i+1; j < a.length; j++)
			{
				for (int k = j+1; k < a.length; k++)
				{
					ArrayList<Integer> t=new ArrayList<>();
					for (int m = k+1; m < a.length; m++) 
					{

						if(a[i]+a[j]+a[k]+a[m]==tar)
						{
							t.add(a[i]);t.add(a[j]);t.add(a[k]);t.add(a[m]);
						}
					}
					if(!f.contains(t))
						f.add(t);

				}

			}

		}
		return f;
	}
}
