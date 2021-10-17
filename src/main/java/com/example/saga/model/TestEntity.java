package com.example.saga.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//Örnek senaryo 13 h2 de yarattığımız tablonun java da bir jpa classını oluşturmak
@Entity
@Table(name="TEST")
public class TestEntity {
    @Id
    @Column(name="ID")
    private int id;
    @Column(name="NAME")
    private String name;
    @Column(name="INFO")
    private String info;
    @Column(name="EVENTID")
    private String eventid;
    @Column(name="STATUS")
    private int status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getEventid() {
        return eventid;
    }

    public void setEventid(String eventid) {
        this.eventid = eventid;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
