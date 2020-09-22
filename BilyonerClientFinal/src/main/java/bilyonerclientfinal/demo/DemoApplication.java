package bilyonerclientfinal.demo;

// Controller

import bilyonerclientfinal.demo.dto.EventsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
@EnableFeignClients

public class DemoApplication {
    

    @Autowired
    private BilyonerClient client;

    @GetMapping("/findAllEvents")
    public List<EventsResponse> getAllEvents(){
        return client.getEvents();
    }
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
