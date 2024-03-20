package com.bs18;

import java.util.Scanner;

class DataTypes{

}
class Int1 extends DataTypes{

}
class String11 extends DataTypes{

}
class Boolean1 extends DataTypes{

}


class ReturnType{

	public DataTypes returnDatatypes(int choice) {
		if(choice == 1) {
			Int1 i1= new Int1();
			return i1;
		}
		else if(choice == 2) {
			String11 s1= new String11();
			return s1;
		}
		else if(choice == 3) {
			Boolean1 b1= new Boolean1();
			return b1;
		}
		else {
			return null;
		}
	}

}
public class FactoryDesignPattern {

	public static void main(String[] args) {
		
		
				int a = 20, b = 10, c = 0, d = 20, e = 40, f = 30;

				// precedence rules for arithmetic operators.
				// (* = / = %) > (+ = -)
				// prints a+(b/d)
//				System.out.println("a+b/d = " + (a + b / d));

				// if same precedence then associative
				// rules are followed.
				// e/f -> b*d -> a+(b*d) -> a+(b*d)-(e/f)
				System.out.println("a+b*d-e/f = "
								+ (a + b * d - e / f));

		
		Scanner ip = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter the DataTyes | Int for 1| String for 2| Boolean for 3");
			int choice=ip.nextInt();
			if(choice == -1) {
				System.out.println("Programm Exited!!!");
				break;
			}
			else {
				ReturnType rt = new ReturnType();

				DataTypes returnDatatypes = rt.returnDatatypes(choice);

				if(returnDatatypes instanceof Int1) {
					System.out.println("Int dataType is Returned");
				}
				else if(returnDatatypes instanceof String11 ) {
					System.out.println("String dataType is Returned");
				}
				else if(returnDatatypes instanceof Boolean1) {
					System.out.println("Boolean DataType is returned");
				}else {

					System.out.println("invalid Data type");
				}

			}

		}
		ip.close();

	}
}












