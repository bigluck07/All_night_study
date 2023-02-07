package com.example.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component  // <bean id="myAspect" class="org.xyz.NotVeryUsefulAspect"> 대신
public class TargetBeforeAdviceAspect {

	//부가기능 구현
	//가. advice  정보: 삽입시점(메서드전,후,..)
    @Before("anyOldTransfer()")
    public void doAccessCheck() {
        System.out.println("TargetBeforeAdviceAspect.BeforeAdvice >>>>>>>>>");
    }
    @After("anyOldTransfer()")
    public void doAccessCheck2() {
        System.out.println("TargetBeforeAdviceAspect.AfterAdvice >>>>>>>>>");
    }
	//나. 어떤 메서드 호출시 삽입 => pointcut
	@Pointcut("execution(* sayEcho*(..))") // the pointcut expression
	private void anyOldTransfer() {}
	
	
	
}





