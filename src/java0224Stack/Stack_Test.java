package java0224Stack;

import java.util.StringTokenizer;

public class Stack_Test { //Arraylist 활용해서 만들어보기
// 스택이란 무엇인가,  어떻게 접근 할것인가
	//pointer,pop,push,lifo 
	private String calEX="3*(12+15)-6/2";
	Stack_Test() {
		StringTokenizer st= new StringTokenizer(calEX,"+-*/()",true);
		while(st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}
		
		
		
		
		
		
//		Stack s = new Stack();
//		System.out.println(s.pop());
//		s.push("A");
//		System.out.println(s.pop());
//		s.push("a");
//		s.push("b");
//		s.push("c");
//		s.push("d");
//	
//		System.out.println(s.pop());
//		System.out.println(s.pop());
//		System.out.println(s.pop());
//		System.out.println(s.pop());
//		System.out.println(s.pop());
//		

	}

}
