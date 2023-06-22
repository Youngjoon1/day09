package variable;

import java.util.Scanner;


public class TestClass08 {

		public String name, grade;
		public int kor, eng, math, sum;
		public double avg;
		
		public void PRINT() {
			Scanner sc = new Scanner(System.in);
			System.out.print("이름 : ");
			name = sc.next();
			System.out.print("국어 점수 : ");
			kor = sc.nextInt();
			System.out.print("영어 점수 : ");
			eng = sc.nextInt();
			System.out.print("수학 점수 : ");
			math = sc.nextInt();
			
		}
		
		public void SUM1() {
			sum = kor + eng + math;
		}
		public void SUM2() {
			avg = (kor + eng + math) / 3;
		}
		public void Grade() {
			grade = (avg > 90) ? "A" : "B" ;
			
				
			}
		
		
		

	
		//	클래스 파일은 2개 만들어 진행하세요
		//	MainClass - 호출하는 역할
		//	Testclass - 연산, 입, 출력 하는 역할
		/*
		 입력, 연산, 출력 기능을 만들어 주세요
		 입력 : 이름, 국, 영, 수
		 연산 : 합을 구하는 기능, 평균을 구하는 기능, 등급 구하는 기능
		 출력 : 이름, 국, 영, 수, 합, 평균, 등급
		 등급 : 평균이 90이상 A, 80이상 B 나머진 C
		 */
		
	
	
	
	

	

}
	 
	
	

