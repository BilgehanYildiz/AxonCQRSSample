package com.example.saga.command;

import org.axonframework.modelling.command.TargetAggregateIdentifier;

public class UpdateTestEntityCommand {
    @TargetAggregateIdentifier
    public final String id;
    public final int status;
    public final int testid;


    public UpdateTestEntityCommand(String id, int status,int testid)
    {
        this.id=id;
        this.status=status;
        this.testid=testid;
    }

}

