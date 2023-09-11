package chapter01_Project;
 
/* 
 * 2page
 * 자바 언어의 특징
 * ------------
 * 1) 실행방법
 *		= 컴파일 방식 => 2진 파일로 변경 (컴퓨터가 인식하는 언어)
 *					  C/C++.., Java
 *					  기계어
 *		   *** 자바의 특징
 *			   컴파일
 *				C/C++ => 컴파일을 하게되면, 운영체제마다 다른 컴파일을 한다.
 *					  => 컴파일 된 내용이 다르다.
 *				Java => 운영체제마다 동일
 *					 => 컴파일된 파일 이름 : 바이너리코드
 *										-----------
 *										 One Write
 *		= 인터프리터 방식 => 한줄씩 번역해서 실행
 *		  HTML, CSS
 *		= 보안이 뛰어나다 => 두번을 검색하기때문에 (소스 검증) => 근데 뚫림.. 그래서 인증시스템으로 변경함.
 *
 *			자바 소스
 *			   ㅣ
 *			  JVM
 *			   ㅣ => 파일(.dll)
 *		  -------------------
 *		 ㅣ       ㅣ         ㅣ
 * 		리눅스    윈도우 	   MAC
 * 
 * 	  = 실행과정
 * 				기계어 변경(javac)  			한줄씩 번역(java)
 * 	  A.java ================ A.class ===============>
 * 	  프로그래머 코딩	 ㅣ		 바이너리코드		ㅣ
 * 					컴파일				 인터프리터
 * 
 * 	  편집기 => 이클립스, 인텔리제이(파이참)
 *		--- 선택하는이유 ? 어시스트가좋음(사용법이 좋음) 
 * 
 * 		이클립스 : javac+javac => ctrl+f11
 * 
 * 		다운로드 : eclipse.org => J2EE		
 * ------------------------------------------------------
 * 6page 개발환경구축
 * 
 * 	jdk17이상 버전은 한글제어에 문제가있음.
 * 	--> 스프링은 14버전까지만 사용가능. STS3(FrameWork+boot) 사용.
 * 	--> 이클립스는 최신버전상관없음. 
 * 
 * 	jdk 환경설정
 * ------------
 * path : c:\jdk-17.0.2\bin
 * classpath : .;\jdk-17.0.2\lib
 * 	
 * 
 * 	11page 이클립스 파일생성
 * 	=> 프로젝트 폴더 만들기 => src => 자바파일 생성 => class파일 생성
 * -------------	
 * *주의점* 
 * 	파일명과 클래스명이 반드시 동일해야 사용가능.
 * 	대소문자를 구분한다.
 * --------------
 * 
 * *자바클래스 기본구조*
 * 	첫자를 대문자, 새로운 단어 결합 첫자를 대문자로 쓴다. - 헝가리언식 표현법
 * 	변수, 메소드는 소문자로한다.
 * 	상수는 전체를 대문자로 한다.
 * 	{} 블록 열고닫기 일치.
 * 	명령어 종료시 ;
 * 	모든 자바파일은 main이 있어야 실행이 가능하다.
 * 	public static void main(String[] args){} 중에 하나라도빠지면 인식을못하고 오류남
 * 
 * 	// 한줄주석
 *  ctrl+shift+/ 주석
 *  ctrl+shift+\ 주석해제
 * 
 * 	화면출력시
 * 	sysout + ctrl + space
 * 
 *  자바의 구성도
 *   class A	====> 클래스 시작 
 *   { 
		 public static void main(String[] args) ====> 메인 시작
		 {
		 		System.out.println("Hello world!"); ====> 화면 출력
		 }	 ====> 메인 종료
	 }	====> 클래스 종료
 * 
 * 
 * 
 * 
 * */


public class 자바언어_실행방법 {
	 	public static void main(String[] args) {
	 		System.out.println("Hello Java!");
	 		System.out.println("Hello Java!");
	 		System.out.println("Hello Java!");
	 		System.out.println("Hello Java!");
	}

}
