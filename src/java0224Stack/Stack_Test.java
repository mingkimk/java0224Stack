package java0224Stack;

import java.util.StringTokenizer;

public class Stack_Test { //Arraylist Ȱ���ؼ� ������
// �����̶� �����ΰ�,  ��� ���� �Ұ��ΰ�
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
