package variable;

class TestClass06
{
	public static int su;
	public static void test() {
		su = 100;
	}
	
}



public class MainClass06 
{
	
//	public static int num;
//	public static void test() {
//		num = 100;
//	}
	
	public static int num;
	public static void main(String[] args) {
		num = 100;
		TestClass06 t = new TestClass06();
//		TestClass06 m = new TestClass06();
//		m.num = 100;
	}

}
