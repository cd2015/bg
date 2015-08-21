package com.bg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bg.domain.Attribute;

public interface AttributeRepository  extends JpaRepository<Attribute, Integer>{

}
