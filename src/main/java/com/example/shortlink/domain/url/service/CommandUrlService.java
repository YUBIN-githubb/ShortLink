package com.example.shortlink.domain.url.service;

import com.example.shortlink.domain.url.entity.Url;
import com.example.shortlink.domain.url.repository.UrlRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class CommandUrlService {
    private final UrlRepository urlRepository;

    @Transactional
    public Url saveUrl(String originalUrl) {
        Url savedOriginalUrl = Url.createOriginalUrl(originalUrl);
        return urlRepository.save(savedOriginalUrl);
    }
}
