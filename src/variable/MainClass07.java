package variable;

class TestClass07
{
	public static final String KOREA = "대한민국";
	
}
class T01
{
	public void test() {
		System.out.println(TestClass07.KOREA);
	}

	
}
	
class T02
{
	
}

class T03
{
	
}


public class MainClass07 {

	public static void main(String[] args) {
		TestClass07 t = new TestClass07();
//		t.KOREA = "미국";
		System.out.println(t.KOREA);
		
		
		
	}

}
