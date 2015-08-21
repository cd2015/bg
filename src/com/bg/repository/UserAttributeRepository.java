package com.bg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bg.domain.UserAttribute;

public interface UserAttributeRepository extends JpaRepository<UserAttribute, Integer> {

}
