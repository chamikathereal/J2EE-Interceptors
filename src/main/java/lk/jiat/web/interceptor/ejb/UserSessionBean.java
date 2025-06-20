package lk.jiat.web.interceptor.ejb;

import jakarta.ejb.Stateless;
import jakarta.interceptor.Interceptors;
import lk.jiat.web.interceptor.annotation.Login;
import lk.jiat.web.interceptor.interceptor.AInterceptor;
import lk.jiat.web.interceptor.interceptor.TestInterceptor;

@Stateless
//@Interceptors({TestInterceptor.class, AInterceptor.class})
@Login
public class UserSessionBean {

    public String doAction(String name, int age){
        System.out.println("UserSessionBean - doAction start");
        System.out.println("UserSessionBean - doAction : " + name + ", " + age);
        //out put - [[UserSessionBean - doAction : A, 50]]
        System.out.println("UserSessionBean - doAction end");

        return "success";
    }

}
