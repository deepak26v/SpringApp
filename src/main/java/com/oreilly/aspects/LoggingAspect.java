package com.oreilly.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import java.util.logging.Logger;

@Aspect
@Component
public class LoggingAspect {
    private Logger logger = Logger.getLogger(getClass().getName());

    //This is the pointcut definition
    @Before("execution(void com.oreilly..*.set*(*))")
    public void callSetter(JoinPoint joinPoint) {
        String signature = joinPoint.getSignature().getName();
        logger.info("setter called by pointcut @ " + signature);
    }
}
