package com.example.accessingdatamysql;

import org.springframework.data.repository.CrudRepository;

import com.example.accessingdatamysql.Log;


public interface LogRepository extends CrudRepository<Log, Integer> {

}
