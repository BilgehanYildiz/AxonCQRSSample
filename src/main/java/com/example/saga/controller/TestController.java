package com.example.saga.controller;

import com.example.saga.bll.TestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/test")
public class TestController {
    @Autowired
    private TestServiceImpl testService;

    @GetMapping(path = "/create/{testid}")
    public ResponseEntity<String> createFirstCommand(@PathVariable int testid)
    {
       String eventid= testService.createTest(testid);
        return ResponseEntity.status(HttpStatus.OK).body("Event yaratıldı"+eventid);

    }

    @GetMapping(path = "/update/{id}/{testid}")
    public ResponseEntity<String> updateFirstCommand(@PathVariable String id,@PathVariable int testid)
    {
        testService.updateTest(id,testid);
        return ResponseEntity.status(HttpStatus.OK).body("Event update edildi");
    }


}
