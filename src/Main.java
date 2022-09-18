public class Main extends MyClass implements MyInterface1, MyInterface2 {
	public static void main(String[] args) {
		System.out.println("Hello testing_2!");
		new Main().yourAge();
		System.out.println(ss);
		System.out.println(MyInterface3.s + MyInterface2.ss);

	}

	@Override
	void bye() {
		System.out.println("Bye!");
	}

	@Override
	public void yourName() {
		System.out.println("Vladimir");
	}

	@Override
	public void yourAge() {
		MyInterface1.super.yourAge();
	}

}

abstract class MyClass {
	String sss;
	int iii;

	void hello() {
		System.out.println("Hello!");
	}

	abstract void bye();
}

interface MyInterface1 {
	final static String s = "qwerty";
	int i = 5;

	void yourName();

	default void yourAge() {
		System.out.println(32);
	}
}

interface MyInterface2 {
	final static String ss = "qwerty";
	int ii = 34;

	void yourName();

	default void yourAge2() {
		System.out.println(32);
	}
}

interface MyInterface3 extends MyInterface1, MyInterface2 {
	//TODO тут нужно понять, что может MyInterface3 и как он себя ведет
}