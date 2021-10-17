package com.example.saga.events;

public class TestEntityCreatedEvent {
    public final String id;
    public final String name;
    public final String info;
    public final int testid;

    public TestEntityCreatedEvent(String id,String name,int testid)
    {
        this.id=id;
        this.name=name;
        this.info="Test Entity created Event";
        this.testid=testid;
    }

}
