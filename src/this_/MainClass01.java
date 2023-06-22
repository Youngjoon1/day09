package this_;



public class MainClass01 {

	public static void main(String[] args) {

		/*
		 * this
		 * - 메소드의 0번째 매개변수로 자동으로 만들어진다.
		 * - 클래스 자기자신의 정보를 가지고 있는 변수
		 * 
		 */
		TestClass01 t = new TestClass01();
		System.out.println("t : " + t);
		System.out.println("main : " + t.num);
		t.test();
		
	}

}
