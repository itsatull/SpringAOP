package springAoc;

import org.springframework.stereotype.Component;

@Component("student")
public class Student {

    public String study(){
        //new Human().wakeup();-->we can implement this thing using aop
        System.out.println("i am in school and studying right now");
        return "yes";
    }
    public void studySomething(){
        System.out.println("i am Employee and i am studying");
    }
    public int studyMaths(){
        System.out.println("i am Employee and i am studying");
        return 0;
    }
}
