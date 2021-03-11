package org.ict.di;

import org.springframework.beans.factory.annotation.Autowired;

public class Broadcast {

	@Autowired
	private Stage stage;
	
	public Broadcast(Stage stage) {
		this.stage = stage;
	}
	
	public void board() {
		System.out.print("방송 송출용");
		stage.perform();
	}
	
}
