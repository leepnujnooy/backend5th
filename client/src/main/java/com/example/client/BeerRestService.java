package com.example.client;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class BeerRestService {
    // getForObject -> 다른거 필요 없고, 응답 Body 만 있으면 될때
    public void getBeerObject() {
        // RestTemplate: Spring 에서 제공하는 기본 HTTP Client
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://random-data-api.com/api/v2/beers";

//        // RestTemplate 으로 GET 요청
//        String responseBody = restTemplate.getForObject(url, String.class);
//        log.info(responseBody);

        // @RequestBody, @ResponseBody => JSON -> DTO
        BeerGetDTO responseBody
                = restTemplate.getForObject(url, BeerGetDTO.class);
        log.info(responseBody.toString());
    }

    // STATUS LINE
    // RESPONSE HEADER
    // RESPONSE BODY
    // getForEntity: HTTP 응답 전체 확인
    public void getBeerEntity() {
        // RestTemplate: Spring 에서 제공하는 기본 HTTP Client
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://random-data-api.com/api/v2/beers";

        // RestController
        ResponseEntity<BeerGetDTO> response =
                restTemplate.getForEntity(url, BeerGetDTO.class);
        log.info(response.getStatusCode().toString());
        log.info(response.getHeaders().toString());
        log.info(response.getBody().toString());
    }

    public void postBeerObject(){
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8081/give-me-beer";

        BeerPostDTO dto = new BeerPostDTO();
        dto.setName("카스");
        MessageDTO responseBody = restTemplate.postForObject(url,dto, MessageDTO.class);
        log.info(responseBody.toString());

        //응답 바디 없이 응답하는 URL
        url = "http://localhost:8081/give-me-beer-204";
        ResponseEntity<Void> response = restTemplate.postForEntity(
                url,
                dto,
                Void.class //void 의 클래스. 객체화 불가
        );
        log.info(response.getStatusCode().toString());

        restTemplate.exchange(
                url,
                HttpMethod.POST,
                new HttpEntity<>(dto),
                Void.class
        );
    }

}
