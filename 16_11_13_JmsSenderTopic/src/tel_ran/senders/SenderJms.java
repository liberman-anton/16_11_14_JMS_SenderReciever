package tel_ran.senders;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jms.core.JmsTemplate;

import tel_ran.common.Point;

@SpringBootApplication
public class SenderJms {

	public static void main(String[] args) {
		try (ConfigurableApplicationContext ctx = SpringApplication.run(SenderJms.class, args);) {
			JmsTemplate jmsTemplate = ctx.getBean(JmsTemplate.class);
			jmsTemplate.setPubSubDomain(true);// <--- for topic
			/*for (int i = 0; i < 1000; i++) {
				String message = "Hello " + i;
				jmsTemplate.send("tel_ran_group", session -> session.createTextMessage(message));
			}*/
			jmsTemplate.setPubSubDomain(false); // <------- for queue
			jmsTemplate.send("tel_ran", 
					session -> session.createObjectMessage(new Point(2, 3)));
		}
	}

}
