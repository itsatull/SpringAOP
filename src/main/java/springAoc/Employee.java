package springAoc;

import org.springframework.stereotype.Component;

@Component
public class Employee {
    public String study(String value){
        System.out.println("i am Employee and i am studying");
        return "yes";
    }
    public void studyAnything(){
        System.out.println("i am Employee and i am studying");
    }
    public String studyDjango(){
        System.out.println("i am Employee and i am studying");
        return "yes";
    }
}
