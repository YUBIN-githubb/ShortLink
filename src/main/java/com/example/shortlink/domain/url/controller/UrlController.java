package com.example.shortlink.domain.url.controller;

import com.example.shortlink.domain.url.dto.request.CreateUrlRequest;
import com.example.shortlink.domain.url.dto.response.CreateUrlResponse;
import com.example.shortlink.domain.url.repository.UrlRepository;
import com.example.shortlink.domain.url.service.UrlService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UrlController {

    private final UrlService urlService;

    @PostMapping("/shorten")
    public ResponseEntity<CreateUrlResponse> createUrl(
            @RequestBody CreateUrlRequest request) {
        String shortUrl = urlService.createUrl(request.getOriginalUrl());
        return ResponseEntity.ok(CreateUrlResponse.of(shortUrl));
    }

    @GetMapping("/test")
    public String test() {
        return "test";
    }


}
