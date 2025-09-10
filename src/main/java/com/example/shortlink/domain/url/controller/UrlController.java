package com.example.shortlink.domain.url.controller;

import com.example.shortlink.domain.url.repository.UrlRepository;
import com.example.shortlink.domain.url.service.UrlService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class UrlController {

    private final UrlService urlService;

    

}
