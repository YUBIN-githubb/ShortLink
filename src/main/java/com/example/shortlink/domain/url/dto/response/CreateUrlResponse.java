package com.example.shortlink.domain.url.dto.response;

import lombok.Getter;

@Getter
public class CreateUrlResponse {

    private String shortUrl;

    private CreateUrlResponse(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    public static CreateUrlResponse of(String shortUrl) {
        return new CreateUrlResponse(shortUrl);
    }
}
