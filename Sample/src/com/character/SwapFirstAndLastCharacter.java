package com.character;

public final class SwapFirstAndLastCharacter {
	
	private static String swapByManoj(String s1) {

		char[] ch=s1.toCharArray();
		int f=0;
		for (int i = 0; i < ch.length; i++) {
			if((i==0 && ch[i] !=' ') || (ch[i] !=' ' && ch[i-1]==' ')){
				f=i;
			}else {
				if((i==ch.length-1 && ch[i] !=' ') || (ch[i] !=' ' && ch[i+1]==' ')) {
					char temp=ch[f];
					ch[f]=ch[i];
					ch[i]=temp;
				}
			}
		}
		ch.toString(); 
		return new String(ch);
	}

	
	private static void swapFirstAndlastCharacters() {
		String s1= "hello world";
		String[] ss=s1.split(" ");
		for(int i=0; i<ss.length; i++) {
//		if(ss[i].length()<=1) {
////			return s1;
//			System.out.println(s1);
//		}
	
		char[] cArray=ss[i].toCharArray();

		// swap the first and last character
		char temp=cArray[0];
		cArray[0]=cArray[cArray.length-1];
		cArray[cArray.length-1]=temp;

		// return the character array back into string
//		return new String(cArray);
		System.out.println(cArray);
	}
}
	//==================================================================================================
	private static String  swapWordsHavingTwoWords(String s1) {
		if(s1.length() == 0) {
			return s1;
		}

		String[] words = s1.split(" ");

		//Process each words separately
		for(int i=0; i<words.length; i++) {
			if(words[i].length()>1) {
				char[] cArray = words[i].toCharArray();


				// Swap the notified word in the array
				char temp = cArray[0];
				cArray[0] = cArray[cArray.length - 1];
				cArray[cArray.length - 1] = temp;

				words[i] = new String(cArray);  // java.lang.String.String(char[] value)
			}
		}
		// Join the modified words back into a single string
		return String.join("-", words);   //String java.lang.String.join(CharSequence delimiter, CharSequence... elements)
	}
	//==================================================================================================

	private static void arraySample() {
		int[] arr= {1, 2, 2, 3, 3, 4, 4, 5, 5};
//		int[] arr1=new int[arr.length-1];
		for(int i=0; i<arr.length; i++) {
			
			for (int j = i+1; j < arr.length; j++) 
			{
				if(arr[i] != arr[j])
				{
					if(arr[i] != 0) 
					{
					System.out.println(arr[i]);
					}
					arr[j]=0;
					break;
				
			}
		}
	}
}
	
	public static void main(String[] args) {
//		Scanner ip = new Scanner(System.in);
//		System.out.println("Enter the String");
//		String s=ip.nextLine();

		arraySample();
//		swapFirstAndlastCharacters();
		
//		String result=swapFirstAndlastCharacters(s);
//		System.out.println(result);

//		String result1=swapWordsHavingTwoWords(s);
//		System.out.println(result1);
	}

}
