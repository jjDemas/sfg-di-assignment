package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Component;

@Component
public class SingletonBean {

    public SingletonBean() {
        System.out.println("In Singleton: Creating a Singleton Bean");
    }

    public String getMyScope(){
        return "I'm a Singleton";
    }
}
