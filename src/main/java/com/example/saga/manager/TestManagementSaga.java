package com.example.saga.manager;

import com.example.saga.events.TestEntityCreatedEvent;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.axonframework.modelling.saga.SagaEventHandler;
import org.axonframework.modelling.saga.SagaLifecycle;
import org.axonframework.modelling.saga.StartSaga;
import org.axonframework.spring.stereotype.Saga;
import org.springframework.beans.factory.annotation.Autowired;

/*
@Saga
public class TestManagementSaga   {
    @Autowired
    private transient CommandGateway commandGateway;

    @StartSaga
    @SagaEventHandler(associationProperty = "id")
    public void handle(TestEntityCreatedEvent testEntityCreatedEvent){

        System.out.println("Saga invoked");

        //associate Saga
        //SagaLifecycle.associateWith("paymentId", paymentId);

        System.out.println("test id" + testEntityCreatedEvent.id);

        //send the commands
        //commandGateway.send(new CreateInvoiceCommand(paymentId, orderCreatedEvent.orderId));
    }
}
*/