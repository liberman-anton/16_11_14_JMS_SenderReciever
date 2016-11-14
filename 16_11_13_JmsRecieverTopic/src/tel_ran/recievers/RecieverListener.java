package tel_ran.recievers;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class RecieverListener {
	
	static final String NAME = "Reciever1";
	
	@JmsListener(destination = "tel_ran_group")
	public void readTextMessage(String message){
		System.out.println(NAME + " " + message);
	}
}
