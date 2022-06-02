package com.green.greenProject;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class GreenController {
    public  String hello(){
        return "hello nishi";
    }

    @GetMapping(value = "/commodity")
    private String getHelloClient() {
        String uri = "https://api.data.gov.in/resource/2b07aa13-faea-4ec1-8709-38df9852e6fd?api-key=579b464db66ec23bdd000001cdd3946e44ce4aad7209ff7b23ac571b&format=json";
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);
        return result;
    }
}
