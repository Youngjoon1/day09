package this_;

public class TestClass02 {

	private int num; //정보은닉(다른클래스에서 접근불가)
	public void test(int n) {
		num = n;
	}
	public int test2() {
		return num;
	}
}
