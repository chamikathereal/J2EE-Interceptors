package lk.jiat.web.interceptor.ejb;

import jakarta.ejb.Stateless;
import jakarta.interceptor.Interceptors;
import lk.jiat.web.interceptor.interceptor.TestInterceptor;

@Stateless
@Interceptors(TestInterceptor.class)
public class UserSessionBean {
    public void doAction(){
        System.out.println("UserSessionBean - doAction....");
    }

}
