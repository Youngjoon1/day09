package this_;

public class TestClass03 {
	//캡슐화
	private int num, age;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setNum(int n) {
		num = n;
	}
	public int getNum() {
		return num;
	}
	public void display() {
		System.out.println("출력 담당");
	}
	
}
