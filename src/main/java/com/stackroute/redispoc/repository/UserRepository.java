package com.stackroute.redispoc.repository;

import com.stackroute.redispoc.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Map;

public interface UserRepository extends CrudRepository<User,String> {
}
