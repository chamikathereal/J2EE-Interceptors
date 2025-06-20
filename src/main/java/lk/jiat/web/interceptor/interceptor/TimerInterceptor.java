package lk.jiat.web.interceptor.interceptor;

import jakarta.annotation.Priority;
import jakarta.interceptor.AroundTimeout;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;
import lk.jiat.web.interceptor.annotation.TimeOutLogger;

@TimeOutLogger
@Interceptor
@Priority(1)
public class TimerInterceptor {

    @AroundTimeout
    public Object aroundTimeout(InvocationContext ic) throws Exception {

        System.out.println("TimerInterceptor - aroundTimeout....");

        return ic.proceed();

    }

}
