package lk.jiat.web.interceptor.interceptor;

import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;
import lk.jiat.web.interceptor.annotation.Login;

import java.util.Map;
@Interceptor
@Login
@Priority(2)
public class AInterceptor {
    @AroundInvoke
    public Object intercept(InvocationContext ic) throws Exception {
        System.out.println("AInterceptor - intercept start");

        //Map<String, Object> contextData = ic.getContextData();
        //System.out.println("AInterceptor - contextData : " + contextData);
        //out put - [[AInterceptor - contextData : {name=Chamika}]]

        Object proceed = ic.proceed();
        System.out.println("AInterceptor - intercept proceed: " + proceed);

        System.out.println("AInterceptor - intercept end");
        return proceed;
    }
}
