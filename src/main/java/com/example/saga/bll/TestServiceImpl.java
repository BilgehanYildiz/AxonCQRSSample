package com.example.saga.bll;

import com.example.saga.command.CreateTestEntityCommand;
import com.example.saga.command.UpdateTestEntityCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.axonframework.eventsourcing.eventstore.EventStore;
import org.springframework.stereotype.Service;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

@Service
public class TestServiceImpl {
    private final CommandGateway commandGateway;

    private final EventStore eventStore;


    public TestServiceImpl(CommandGateway commandGateway,EventStore eventStore) {
        this.commandGateway = commandGateway;
        this.eventStore=eventStore;
    }

    public void listTestEvent()
    {
        String id="5";
        eventStore.readEvents(id).asStream().collect(Collectors.toList());
    }

    public String createTest(int id)
    {
        try{
            String idtoEvent= UUID.randomUUID().toString();
        CompletableFuture<Object> result= commandGateway.send(new CreateTestEntityCommand(idtoEvent,"Bilgehan",id));
         return idtoEvent;
        }
        catch (Exception ex)
        {
            System.out.println("Command error");
        }
        return "";
    }

    public void updateTest(String id,int testid)
    {
        try{

            CompletableFuture<Object> result= commandGateway.send(new UpdateTestEntityCommand(id,1,testid));
            //Object o=result.get();
            //String a="";
        }
        catch (Exception ex)
        {
            System.out.println("Command error");
        }
    }
}
