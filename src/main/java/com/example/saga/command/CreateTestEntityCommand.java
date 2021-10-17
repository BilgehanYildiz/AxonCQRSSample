package com.example.saga.command;

import org.axonframework.modelling.command.TargetAggregateIdentifier;

public class CreateTestEntityCommand {
    @TargetAggregateIdentifier
    public final String id;
    public final String name;
    public final String info;
    public final int testid;

    public CreateTestEntityCommand(String id,String name,int testid)
    {
        this.id=id;
        this.name=name;
        this.testid=testid;
        this.info="Test Entity creation will be requested";
    }

}

