package org.ict.di;

public class JavaMain {
	public static void main(String[] args) {
		Singer s1 = new Singer();
		
		Stage st1 = new Stage(s1);
		
		Broadcast b1 = new Broadcast(st1);
		st1.perform();
		s1.sing();
		b1.board();
		
		
	}
}
