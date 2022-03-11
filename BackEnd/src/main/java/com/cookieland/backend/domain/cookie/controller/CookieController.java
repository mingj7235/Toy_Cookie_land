package com.cookieland.backend.domain.cookie.controller;

import com.cookieland.backend.domain.cookie.dto.request.CookieRequestDto;
import com.cookieland.backend.domain.cookie.dto.response.CookieResponseDto;
import com.cookieland.backend.domain.cookie.service.CookieCreateService;
import com.cookieland.backend.domain.cookie.service.CookieFindService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

@Slf4j
@RestController
@RequiredArgsConstructor
public class CookieController {

    private final CookieCreateService cookieCreateService;

    private final CookieFindService cookieFindService;

    @PostMapping ("/cookies")
    public ResponseEntity<CookieResponseDto.Response> create (final CookieRequestDto.@NotNull Create request) {
        return ResponseEntity.ok(cookieCreateService.create(request));
    }

    @GetMapping ("/cookies/{id}")
    public ResponseEntity<CookieResponseDto.Response> findById (final @NotNull Long id) {
        return ResponseEntity.ok(cookieFindService.findById(id));
    }
}
