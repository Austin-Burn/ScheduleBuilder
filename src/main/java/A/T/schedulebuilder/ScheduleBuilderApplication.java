package A.T.schedulebuilder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class ScheduleBuilderApplication {
 
    public static void main(String[] args){
        SpringApplication.run(ScheduleBuilderApplication.class, args);
    }

}
