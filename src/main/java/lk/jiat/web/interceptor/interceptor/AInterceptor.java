package lk.jiat.web.interceptor.interceptor;

import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.InvocationContext;

import java.util.Map;

public class AInterceptor {
    @AroundInvoke
    public Object intercept(InvocationContext ic) throws Exception {
        System.out.println("AInterceptor - intercept...");

        Map<String, Object> contextData = ic.getContextData();
        System.out.println("AInterceptor - contextData : " + contextData);
        //out put - [[AInterceptor - contextData : {name=Chamika}]]

        ic.proceed();
        return null;
    }
}
