package springAoc;

import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
@Component
@Aspect
//this calss is an aspect
@EnableAspectJAutoProxy
public class Human {
    //@Before is an advice
    //@Before(value = "execution(public void study())")
    //public void study()--ye method jis bhi class me hoga call ho jaaiga that is aproblem
    //solution.
//    @Before(value = "execution(public void springAoc.Student.study())")
//    public void wakeup(){
//        System.out.println("good morning");
//    }
////     kis bhi class me ager function ka prefix name study hai usko run karana hai to use * after study
//    @After(value = "execution(public void study*())")
//    public void sleep(){
//        System.out.println("good night i am going to sleep");
//    }
//    //if study return type is different in different class then we use * to get all irrespective of return type
//    @After("mypointCut()")
//    public void eat(){
//        System.out.println("I am eating");
//    }
//    @Pointcut("execution(public * study*())")
//    public void mypointCut(){
//    }
    @AfterReturning(pointcut = "execution( * study*(..))",returning = "value")
    public void wakeup(String value){

    }
}
