package com.example.gateway.config.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.time.Instant;
import java.util.UUID;

@Component
@Slf4j
public class PreLoggingFilter implements GlobalFilter {


    //HttpServletRequest & Response 대신 exchange 사용
    //GatewayFilterChain 은 FilterChain 과 다름
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {

        // 유저가 보낸 http 요청을 받음
        ServerHttpRequest serverHttpRequest = exchange.getRequest();

        // PreLoggingFilter 에서 요청을 식별할 수 있는 HTTP Header 작성


        String requestID = UUID.randomUUID().toString();
        // 나중에 PostLoggingFilter 에서 Header 를 바탕으로 실행에 걸린시간 측정
        serverHttpRequest.mutate()
                .headers(httpHeaders -> {
                    httpHeaders.add("X-GATEWAY-REQUEST-ID", requestID);
                    httpHeaders.add("X-GATEWAY-REQUEST-TIME", String.valueOf(Instant.now().toEpochMilli()));
                }); // .mutate() 사용자가 보낸 요청을 조작하겠다.

        log.info("transaction : {}",requestID);

        //filterChain.doFilter() 대신
        return chain.filter(exchange);
    }
}
