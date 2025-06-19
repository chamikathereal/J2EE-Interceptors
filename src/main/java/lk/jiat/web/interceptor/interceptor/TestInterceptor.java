package lk.jiat.web.interceptor.interceptor;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.interceptor.AroundConstruct;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.InvocationContext;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;

public class TestInterceptor {

    @AroundConstruct
    public void aroundConstruct(InvocationContext ic) {
        System.out.println("TestInterceptor - aroundConstruct : " + ic.getConstructor());
        //out put - [[TestInterceptor - aroundConstruct : public lk.jiat.web.interceptor.ejb.UserSessionBean()]]
    }

    @PostConstruct
    public void init(InvocationContext ic){

        Constructor<?> constructor = ic.getConstructor();
        System.out.println("TestInterceptor PostConstruct - constructor : " + constructor);
        //out put - [[TestInterceptor PostConstruct - constructor : null]]

        System.out.println("TestInterceptor - init....");
    }

    @AroundInvoke
    public Object intercept(InvocationContext ic) throws Exception {
        System.out.println("TestInterceptor - intercept...");
        //System.out.println("TestInterceptor Name: " + ic.getMethod().getName());
        //out put - [[TestInterceptor Name: doAction]]

        //Method method = ic.getMethod();
        //System.out.println("TestInterceptor - method..." + method);
        //out put - [[TestInterceptor - method...public void lk.jiat.web.interceptor.ejb.UserSessionBean.doAction(java.lang.String,int)]]

        //Object[] parameters = ic.getParameters();
        //Arrays.stream(parameters).forEach(parameter -> {
            //System.out.println("TestInterceptor - parameter: " + parameter);
            //out put - [[TestInterceptor - parameter: Amal]]
            //out put - [[TestInterceptor - parameter: 22]]
        //});

        //ic.setParameters(new Object[]{"A", 50});

        //Object target = ic.getTarget();
        //System.out.println("TestInterceptor - target..." + target);
        //out put - [[TestInterceptor - target...lk.jiat.web.interceptor.ejb.UserSessionBean@49d601c3]]

        //Map<String, Object> contextData = ic.getContextData();
        //contextData.put("name","Chamika");
        //System.out.println("TestInterceptor - contextData : " + contextData);
        //out put - [[TestInterceptor - contextData : {name=Chamika}]]

        //Constructor<?> constructor = ic.getConstructor();
        //System.out.println("TestInterceptor - constructor : " + constructor);
        //out put - [[TestInterceptor - constructor : null]]

        ic.proceed();
        return null;
    }

    @PreDestroy
    public void destroy(InvocationContext ic){
        System.out.println("TestInterceptor - destroy...");
    }
}
