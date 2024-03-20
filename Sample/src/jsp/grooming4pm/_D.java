package jsp.grooming4pm;

class _C {

	static int a =10;

	private void sample1() {

		System.out.println("method printing 2");
	}

}

public class _D extends _C{

	private  void method_D() {

		int d=10;
		
		System.out.println(2);
		
		System.out.println(a);
	}

	public static void main(String[] args) {

		_D d = new _D();
		d.method_D();

	}

}
