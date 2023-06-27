package com.example.aop.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect // 이 클래스가 관점이라는 것을 드러내는 어노테이션
@Component // bean 객체로 등록
public class LoggingAspect {

        //컨트롤러 클래스
        // @Before : Advice , 실제로 실행될 코드를 나타냄
        // @Before.value : Pointcut Designator. 어느 조인트 포인트에서 실행될지를 나타냄
        //@Before("this(com.example.aop.controller.UserController)")
        //@Before("within(com.example.aop.controller.UserController)")
        @Before("@annotation(com.example.aop.aspect.LogArguments)")
        // within : 클래스 or 패키지 지정
        // this : 클래스 인스턴스 지정
        // @annotation : 어노테이션 지정
        public void logParameters(JoinPoint joinPoint){
                //log.info(joinPoint.toString());
                Signature methodSignature = joinPoint.getSignature();

                //메소드 이름 로그
                log.info(methodSignature.getName());

                //메소드 인자 확
                Object[] arguments = joinPoint.getArgs();

                //no args
                if(arguments.length == 0 ){
                        log.info("no args");
                }

                for (Object argument : arguments){
                        log.info("argument: [{}]", argument);
                }

        }


        @Around("@annotation(com.example.aop.aspect.LogExecutionTime)")
        public Object logExecutionTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
                long startTime = System.currentTimeMillis();


                // 프로시딩조인포인트.Proceed() : 조인포인트에 해당하는 메소드를 진행
                Object proceed = proceedingJoinPoint.proceed();

                long endTime = System.currentTimeMillis();

                log.info("{} executed in : {}ms",proceedingJoinPoint.getSignature(),endTime-startTime);

                return proceed;
        }


}
