package lk.jiat.web.interceptor.interceptor;

import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.InvocationContext;

public class TestInterceptor {
    @AroundInvoke
    public Object intercept(InvocationContext ic) throws Exception {
        System.out.println("TestInterceptor - intercept...");
        //System.out.println("TestInterceptor Name: " + ic.getMethod().getName());
        ic.proceed();
        return null;
    }
}
