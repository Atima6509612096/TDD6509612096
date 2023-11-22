package core;

import java.util.ArrayList;

public class Stack implements IStack {
	private ArrayList<Object> num;
	private int top;
	
	public Stack() {
		num = new ArrayList<Object>();
	}

	@Override
	public boolean isEmpty() {
		if(num.size() == 0)
			return true ;
		else
			return false;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void push(int elm) {
		num.add(elm);
		top = elm;
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isFull() {
		if(num.size() == 1)
			return true ;
		else
		return false;
	}

	@Override
	public int Top() {
		return top;
	}

}
