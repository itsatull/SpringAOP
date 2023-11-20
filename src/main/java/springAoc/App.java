package springAoc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Student student = (Student) context.getBean(Student.class);
//      (join point)-before
        student.study();
//      (join point)-after
        Employee employee = context.getBean(Employee.class);
//      (join point)-before
        employee.study("yes");
//      (join point)-after
    }
}
