package com.insurance.insurancequote.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.insurance.insurancequote.entity.Quote;



public interface QuoteRepository extends JpaRepository<Quote, Long> {
}
