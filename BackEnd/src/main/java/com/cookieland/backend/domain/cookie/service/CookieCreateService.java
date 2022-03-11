package com.cookieland.backend.domain.cookie.service;

import com.cookieland.backend.domain.cookie.dto.request.CookieRequestDto;
import com.cookieland.backend.domain.cookie.dto.response.CookieResponseDto;
import com.cookieland.backend.domain.cookie.service.core.CookieService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.constraints.NotNull;

@Slf4j
@Service
@RequiredArgsConstructor
@Transactional
public class CookieCreateService {

    private CookieService cookieService;

    public CookieResponseDto.Response create (final CookieRequestDto.@NotNull Create request) {
        return CookieResponseDto.Response.from(cookieService.create(request));
    }
}
