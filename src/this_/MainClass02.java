package this_;

public class MainClass02 {

	public static void main(String[] args) {
		
		TestClass02 t = new TestClass02();
		int n = 12345;
		t.test(n);
		int re = t.test2();
		System.out.println("결과 : " + re);
	}

}
