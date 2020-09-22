package bilyonerclientfinal.demo;


import bilyonerclientfinal.demo.dto.EventsResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(url="https://aping.bilyoner.com", name ="BilyonerClient")
public interface BilyonerClient {

    @GetMapping("/event")
    public List<EventsResponse> getEvents();

}
