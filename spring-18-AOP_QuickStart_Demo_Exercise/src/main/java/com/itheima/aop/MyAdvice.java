package com.itheima.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author Mendy
 * @create 2023-06-24 16:35
 */

@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(void com.itheima.dao.BookDao.update())")
    private  void pt(){

    }



    @Before("pt()")
    public void method(){
        System.out.println(System.currentTimeMillis());

    }


}
