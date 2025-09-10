package com.example.shortlink.domain.url.dto.request;

import lombok.Getter;

@Getter
public class CreateUrlRequest {

    private String originalUrl;

    private CreateUrlRequest(String originalUrl) {
        this.originalUrl = originalUrl;
    }

    public static CreateUrlRequest of(String originalUrl) {
        return new CreateUrlRequest(originalUrl);
    }
}
