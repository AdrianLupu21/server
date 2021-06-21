package com.upb.fiir.dw1000.api;

import com.upb.fiir.dw1000.dto.TestRequest;
import com.upb.fiir.dw1000.repository.DW1000Repository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dw1000")
public class MonitorService {

    private final DW1000Repository dw1000Repository;

    public MonitorService(DW1000Repository dw1000Repository){
        this.dw1000Repository = dw1000Repository;
    }

    @RequestMapping(value = "/postId", method = RequestMethod.POST, consumes = "application/json")
    public void postMonitor(@RequestBody TestRequest testRequest){
        System.out.println(testRequest.getId());
        System.out.println(testRequest.getName());
    }
}
