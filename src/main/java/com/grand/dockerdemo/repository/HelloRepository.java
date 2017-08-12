package com.grand.dockerdemo.repository;

import com.grand.dockerdemo.model.HelloResource;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HelloRepository extends JpaRepository<HelloResource, Long> {

}
