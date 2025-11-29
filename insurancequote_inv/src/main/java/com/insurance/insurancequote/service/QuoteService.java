package com.insurance.insurancequote.service;

import org.springframework.stereotype.Service;

import com.insurance.insurancequote.entity.Quote;
import com.insurance.insurancequote.repo.QuoteRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class QuoteService {

    private final QuoteRepository repo;

    public Quote saveQuote(Quote q) {

        double premium = q.getBasePremium();

        
        if (q.getClientAge() < 30)
            premium -= premium * 0.10;

        if (q.getCoverageAmount() > 500000)
            premium += premium * 0.05;

        q.setFinalPremium(premium);
        return repo.save(q);
    }

    public Quote getQuote(Long id) {
        return repo.findById(id).orElse(null);
    }
}
