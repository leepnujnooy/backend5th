package com.example.gateway.config.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.time.Instant;

@Component
@Slf4j
public class PostLoggingFilter implements GlobalFilter {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {

        return chain.filter(exchange)
                .then(Mono.fromRunnable(()->{
                    //사용자가 보낸 요청을 받음
                    ServerHttpRequest httpRequest = exchange.getRequest();

                    //해당 이름을 가진 헤더가 가진 값을 가져옴 ( 프리로깅 필터에서 바꿔만든 헤더 )
                    String requestId = httpRequest.getHeaders()
                            .getFirst("X-GATEWAY-REQUEST-ID");
                    String requestTimeString = httpRequest.getHeaders()
                            .getFirst("X-GATEWAY-REQUEST-TIME");

                    //현재시간
                    long timeEnd = Instant.now().toEpochMilli();

                    //Pre logging 에서 기록한 시각
                    long timeStart = Long.parseLong(requestTimeString);

                    log.info("트랜잭션 소요시간 : {}초",(float)(timeEnd-timeStart)/1000);
                }));
    }
}
