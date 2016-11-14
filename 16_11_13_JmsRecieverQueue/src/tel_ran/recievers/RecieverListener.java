package tel_ran.recievers;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import tel_ran.common.Point;

@Component
public class RecieverListener {
	
	static final String NAME = "Reciever3";
	
//	@JmsListener(destination = "tel_ran")
//	public void readTextMessage(String message){
//		System.out.println(NAME + " " + message);
//	}
	
	@JmsListener(destination = "tel_ran")
	public void readPoint(Point point){
		System.out.println(point);
	}
}
