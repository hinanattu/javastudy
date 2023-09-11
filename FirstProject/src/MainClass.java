/*
 * 인식이 안되는 주석
 * 여러줄 주석
 * 
 * 1. 프로젝트명 생성
 * 2. src => java파일 생성
 * 	  java : 단위가 클래스
 * 	  클래스 생성
 * 		> 1. 클래스는 대문자로 시작한다.
 * 
 * 		> 2. 단어가 2개이상일 경우 
 * 			 시작하는 첫자는 대문자
 * 			 => _ 사용 / 예) Main_Class, File_Name
 *  
 * 		> 3. 자바에서 숫자표현
 * 					  => 8진법
 * 						 011(0으로 시작)
 * 						-
 * 					  => 10진법
 * 					  => 16진법
 * 						 0xFF(0x로 시작)
 * 		  		    문자표현 : '한개의 문자만 사용이 가능'
 * 							 'AB' (X) => 'A', 'B', '홍'
 * 		 			문자열 표현 : "여러개의 문자열 사용이 가능"
 * 
 * 		 > 4. 문장이 종료가 되면 ; -> 세미콜론은 명령수행을 뜻함.
 * 			  ------------명령 => 순서 (알고리즘)
 * 
 * 		 > 5. 들여쓰기
 * 		 > 6. 자바 실행 *중요!*
 * 			 --------
 * 								컴퓨터 인식(2진파일) 컴파일
 * 									 0,1								   실행
 * 			 MainClass.java   ====================> MainClass.class ================>
 * 				 원시소스					javac			byteCode		  java
 * 			 (개발자만 알아보는 소스)										 ㄴ인터프리터   
 * 
 * 			 컴파일할때 빨간색으로 밑줄쳐져있는 부분이 있으면 컴파일이 되지않음. 그냥 아무런 주석처리 없을 때 컴파일을 해야한다.
 * 
 * 		> 7. 프로그램 실행
 * 		---------------
 * 		컴파일 : 컴퓨터 인식언어로 변경
 * 				java / c, c++
 * 		인터프리터 : 한줄씩 번역 => HTML
 * 		----------------------------
 * 			자바 : 컴파일+인터프리터 두가지 전부 다 함
 * 				  장점 : 보안이 뛰어남.
 * 
 * 
 * 			--@자바의 역사@--
 * 			  : 게임에 사용되는 언어 (세븐스타) = 임베디드 => 모바일
 * 			   => 그린 프로젝트 : 모든 기계를 리모콘한개로 제어
 * 			   => 1차부도 => 네스케이프(브라우저 업체) => 웹 => 개별업체 (썬마이크로시스템)
 * 			   => 자바 언어 사용
 *   		   => 제임스고슬린 + 아서벤 의 (Ja + Va => Java)
 *   		   => 1995 : 자바탄생(5/23) 
 *   			  1996 : 한국상륙
 *   			  2000 : JSP
 *   			MS <=> 연합군 (오라클, 썬)
 *   						-----------
 *   		   => MS (데이터베이스 : MS-SQL, Windows)
 *   			  SUN (솔라리스) => 인수 => MySQL => 부도2차 => 오라클인수 => Java 유료화됨.
 *   			
 *   			-------------
 *   			=> Java의 제작 (제임스 고스링) 연봉이안맞아서 구글로 이직(Go)언어 구축
 *   			=> 모바일(유료화 => 안드로이드 (자바=>Korlin)
 *   				***스프링 (오픈소스) => 준비(자바,코틀린)
 *   
 *   		자바 공부
 *   		 -@필수@-
 *   			1) 변수 (한개의 데이터 저장)
 *   			  데이터형( 정수,실수,문자...)
 *   			2) 가공 : 연산자, 제어문
 *   			3) 배열 : 데이터를 모아서 관리 - 같은 것만 모은다.
 *   			4) 클래스 : 다른 데이터를 모아서 관리 - 다른 것도 아서 관리한다.
 *   			5) 클래스 : 재사용, 보안, 수정, 추가 ===> 객체지향프로그램
 *   			6) 예외처리
 *   			7) 라이브러리
 *   			=====> IO(파일 입출력), 오라클 연결
 *  
 */

//한줄주석
/* 
 * 여러줄 주석
 * */

//class 첫 문자는 대문자
//sysout + ctrl + 스페이스 는 System.out.println();
//main + ctrl + 스페이스 는 main 클래스를 만들어줌.
//ctrl+f11 = 실행




public class MainClass {	
	// 프로그램의 시작점 => main은 반드시 한개 이상 필요하다.
	public static void main(String[] args) {
		System.out.println("hello java!");
	}

}
