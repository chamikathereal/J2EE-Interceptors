package lk.jiat.web.interceptor.ejb;

import jakarta.ejb.Schedule;
import jakarta.ejb.Stateless;
import jakarta.ejb.Timeout;
import lk.jiat.web.interceptor.annotation.TimeOutLogger;

@Stateless
@TimeOutLogger
public class TimerSessionBean {
    @Schedule(hour = "*", minute = "*", second = "*/10", persistent = false)
    @Timeout
    public void doTask() {
        System.out.println("TimerSessionBean - doTask....");
    }
}
