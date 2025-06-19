package lk.jiat.web.interceptor.ejb;

import jakarta.ejb.Stateless;
import jakarta.interceptor.Interceptors;
import lk.jiat.web.interceptor.interceptor.AInterceptor;
import lk.jiat.web.interceptor.interceptor.TestInterceptor;

@Stateless
@Interceptors({TestInterceptor.class, AInterceptor.class})
public class UserSessionBean {

    public void doAction(String name, int age){
        System.out.println("UserSessionBean - doAction : " + name + ", " + age);
        //out put - [[UserSessionBean - doAction : A, 50]]
    }

}
