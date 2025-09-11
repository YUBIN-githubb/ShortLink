package com.example.shortlink.domain.url.service;

import com.example.shortlink.domain.url.entity.Url;
import com.example.shortlink.domain.url.repository.UrlRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Base64;

@Service
@RequiredArgsConstructor
public class UrlService {

    private final UrlRepository urlRepository;
    private final CommandUrlService commandUrlService;

    @Transactional
    public String createUrl(String originalUrl) {

        Url savedOriginalUrl = commandUrlService.saveUrl(originalUrl);

        Long id = savedOriginalUrl.getId();
        String shortUrl = Base64.getUrlEncoder().encodeToString(id.toString().getBytes());

        savedOriginalUrl.updateShortUrl(shortUrl);

        //urlRepository.save(savedOriginalUrl);

        return shortUrl;
    }
}
