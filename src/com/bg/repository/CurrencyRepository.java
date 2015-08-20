package com.bg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bg.domain.Currency;

public interface CurrencyRepository extends JpaRepository<Currency, Integer>{

}
