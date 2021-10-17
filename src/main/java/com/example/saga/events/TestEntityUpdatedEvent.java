package com.example.saga.events;

public class TestEntityUpdatedEvent {
    public final String id;
    public final int status;
    public final String info;
    public final int testid;

    public TestEntityUpdatedEvent(String id, int status,int testid)
    {
        this.id=id;
        this.status=status;
        this.info="Test Entity updated Event";
        this.testid=testid;
    }

}
