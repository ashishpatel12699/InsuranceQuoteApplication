package com.insurance.insurancequote.controller;


import org.springframework.web.bind.annotation.*;

import com.insurance.insurancequote.entity.Quote;
import com.insurance.insurancequote.repo.QuoteRepository;
import com.insurance.insurancequote.service.QuoteService;

import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("/api/v1/insurance-quotes")
@RequiredArgsConstructor
public class QuoteController {

    private final QuoteService service;

    @PostMapping
    public Quote create(@RequestBody Quote q) {
        return service.saveQuote(q);
    }

    @GetMapping("/{id}")
    public Quote get(@PathVariable Long id) {
        return service.getQuote(id);
    }
}

