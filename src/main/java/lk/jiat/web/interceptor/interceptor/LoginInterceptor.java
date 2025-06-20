package lk.jiat.web.interceptor.interceptor;

import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;
import lk.jiat.web.interceptor.annotation.Login;

@Interceptor
@Login
@Priority(1)
public class LoginInterceptor {

    @AroundInvoke
    public Object intercept(InvocationContext ic) throws Exception {

        System.out.println("LoginInterceptor - intercept start");

        Object proceed = ic.proceed();
        System.out.println("LoginInterceptor - intercept proceed: " + proceed);

        System.out.println("LoginInterceptor - intercept end");
        return proceed;
    }

}
