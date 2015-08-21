package com.bg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bg.domain.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
