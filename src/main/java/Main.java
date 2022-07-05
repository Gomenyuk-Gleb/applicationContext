import com.bean.People;
import com.context.SimpleApplicationContext;
import com.bean.Student;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        SimpleApplicationContext simpleApplicationContext = new SimpleApplicationContext("com");
        Student bean = simpleApplicationContext.getBean(Student.class);
        Object test = simpleApplicationContext.getBean("test", Student.class);
        System.out.println(test.toString());

        Map<String, Object> allBeans = simpleApplicationContext.getAllBeans(People.class);

    }
}
