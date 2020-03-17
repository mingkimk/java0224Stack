package java0224Stack;

public class Stack {

	private String[] myStack = new String[10];
	private int pointer = -1;

	// ������ ���� 2����,push, pop
	public void push(String p) { // -1�� ���¿��� Ǫ�� �ϸ� 0�� �ȴ�.
//pointer �� �ϳ�  ���� ���� String p�� �Է� �Ѵ�.
		pointer++; // ���ÿ��� �ֻ��� �� ����Ű�� �ִ� �����Ͱ� �ִ�/ last in first out
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
