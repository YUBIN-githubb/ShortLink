package com.example.shortlink.domain.url.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Table(name = "urls")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Url {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String originalUrl;

    private String shortUrl;

    private Url(String originalUrl, String shortUrl) {
        this.originalUrl = originalUrl;
        this.shortUrl = shortUrl;
    }

    public static Url create(String originalUrl, String shortUrl) {
        return new Url(originalUrl, shortUrl);
    }

    public static Url createOriginalUrl(String originalUrl) {
        return new Url(originalUrl, null);
    }

    public void updateShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }
}
