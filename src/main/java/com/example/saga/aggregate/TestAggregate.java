package com.example.saga.aggregate;

import com.example.saga.command.CreateTestEntityCommand;
import com.example.saga.command.UpdateTestEntityCommand;
import com.example.saga.events.TestEntityCreatedEvent;
import com.example.saga.events.TestEntityUpdatedEvent;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateCreationPolicy;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.modelling.command.CreationPolicy;
import org.axonframework.spring.stereotype.Aggregate;

@Aggregate
public class TestAggregate {
    @AggregateIdentifier
    private String id;
    private String name;
    private String info;
    private int status;
    private  int testid;

    public TestAggregate(){}

    @CommandHandler
    public TestAggregate(CreateTestEntityCommand command)
    {
        AggregateLifecycle.apply(new TestEntityCreatedEvent(command.id,command.name,command.testid));
    }

    @EventSourcingHandler
    protected void on(TestEntityCreatedEvent testEntityCreatedEvent){

        this.id=testEntityCreatedEvent.id;
        this.name=testEntityCreatedEvent.name;
        this.info=testEntityCreatedEvent.info;
    }

    @CommandHandler
    public void updateTestAggregate(UpdateTestEntityCommand command)
    {
        AggregateLifecycle.apply(new TestEntityUpdatedEvent(command.id,command.status,command.testid));
    }

    @EventSourcingHandler
    protected void on(TestEntityUpdatedEvent testEntityUpdatedEvent){

        this.id=testEntityUpdatedEvent.id;
        this.status=testEntityUpdatedEvent.status;
        this.info=testEntityUpdatedEvent.info;
        this.testid=testEntityUpdatedEvent.testid;
    }


}
