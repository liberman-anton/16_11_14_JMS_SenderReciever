package tel_ran.senders;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jms.core.JmsTemplate;

@SpringBootApplication
public class SenderJms {

	public static void main(String[] args) {
		try (ConfigurableApplicationContext ctx = SpringApplication.run(SenderJms.class, args);) {
			JmsTemplate jmsTemplate = ctx.getBean(JmsTemplate.class);
			for (int i = 0; i < 2000; i++) {
				String message = "Hello " + i;
				jmsTemplate.send("tel_ran", session -> session.createTextMessage(message));
			}
		}
	}

}
