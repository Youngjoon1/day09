package this_;

public class TestClass01 {
	public int num = 12345;
	public void test() {
		int num = 789789;
		System.out.println("this : " + this);
		System.out.println("test : " + num);
		System.out.println("test this : " + this.num);
	}
}
