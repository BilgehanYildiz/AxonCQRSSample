package com.example.saga.repository;



import com.example.saga.model.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;


@Repository
public interface TestRepository extends JpaRepository<TestEntity,Integer>, JpaSpecificationExecutor {


}