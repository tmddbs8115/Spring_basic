package org.ict.di;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Springmain {
	public static void main(String[] args) {
		GenericXmlApplicationContext context = 
				new GenericXmlApplicationContext("file:src/main/webapp/WEB-INF/spring/root-context.xml");
	
		
		
		//
		//클래스명의 맨 앞글자를 소문자로 바구고(소문자면 그대로)
		//두 번째 파라미터는 클래스명.class를 적습니다.
		
		Broadcast broadcast = context.getBean("broadcast", Broadcast.class);
		
		broadcast.board();
		context.close();
	}
}
