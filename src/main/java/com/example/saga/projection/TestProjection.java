package com.example.saga.projection;

import com.example.saga.events.TestEntityCreatedEvent;
import com.example.saga.events.TestEntityUpdatedEvent;
import com.example.saga.model.TestEntity;
import com.example.saga.repository.TestRepository;
import org.axonframework.eventhandling.EventHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class TestProjection {

    @Autowired
    private  TestRepository testRepository;

    @EventHandler
    public void on(TestEntityCreatedEvent event) {
       System.out.println("Test entity yaratıldı"+event.id);
        TestEntity testEntity=new TestEntity();
        testEntity.setId(event.testid);
        testEntity.setEventid(event.id);
        testEntity.setName(event.name);
        testEntity.setInfo(event.info);

        testRepository.save(testEntity);
    }

    @EventHandler
    public void on(TestEntityUpdatedEvent event) {
        System.out.println("Test entity update edildi"+event.id);
       Optional<TestEntity> testEntityOpt= testRepository.findById(event.testid);
        if(testEntityOpt.isPresent())
        {
            TestEntity testEntity=   testEntityOpt.get();
            testEntity.setStatus(event.status);
            testEntity.setInfo(event.info+event.id);
            testRepository.save(testEntity);
        }



    }


}
