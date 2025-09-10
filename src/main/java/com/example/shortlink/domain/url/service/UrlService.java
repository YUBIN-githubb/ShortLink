package com.example.shortlink.domain.url.service;

import com.example.shortlink.domain.url.repository.UrlRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UrlService {

    private final UrlRepository urlRepository;

}
