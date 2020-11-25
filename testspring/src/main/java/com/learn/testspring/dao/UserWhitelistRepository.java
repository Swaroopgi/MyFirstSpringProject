package com.learn.testspring.dao;

import com.learn.testspring.model.UserWhiteList;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
@Service
public interface UserWhitelistRepository extends CrudRepository<UserWhiteList, String> {

}