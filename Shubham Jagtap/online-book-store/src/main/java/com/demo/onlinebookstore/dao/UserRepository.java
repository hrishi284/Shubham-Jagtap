package com.demo.onlinebookstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.demo.onlinebookstore.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, String> {

}
