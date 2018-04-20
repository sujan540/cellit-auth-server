package com.cellit.server.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cellit.server.model.User;

/**
 * @author Sujan Maharjan
 * @since 4/20/2018
 */
public interface UserRepository extends JpaRepository <User, Integer>{

    Optional<User> findByFirstName(String username);
}
