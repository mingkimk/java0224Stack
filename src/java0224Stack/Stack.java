package java0224Stack;

public class Stack {

	private String[] myStack = new String[10];
	private int pointer = -1;

	// 스택은 연산 2가지,push, pop
	public void push(String p) { // -1인 상태에서 푸스 하면 0이 된다.
//pointer 가 하나  증가 한후 String p를 입력 한다.
		pointer++; // 스택에는 최상위 를 가르키고 있는 포인터가 있다/ last in first out
		if (pointer == 10) {
			System.out.println("Stack full");
		} else {
			myStack[pointer] = p;
		}

	}

	public String pop() {
		String getData=null;
		if(pointer==-1) {
			getData= "Stack empty";
		}else { 
			getData = myStack[pointer];
			myStack[pointer] = null;
			pointer--;

		}
		return getData;
	}

}
