package com.cookieland.backend.domain.cookie.service;

import com.cookieland.backend.domain.cookie.dto.request.CookieRequestDto;
import com.cookieland.backend.domain.cookie.dto.response.CookieResponseDto;
import com.cookieland.backend.domain.cookie.service.core.CookieService;
import com.cookieland.backend.domain.tag.service.TagFindService;
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

    private final CookieService cookieService;

    private final TagFindService findService;

    // tag id 로 tag 찾아서 cookie create 할때 넣어서 제공할것
    public CookieResponseDto.Response create (final CookieRequestDto.@NotNull Create request) {
        return CookieResponseDto.Response.from(cookieService.create(request));
    }
}
