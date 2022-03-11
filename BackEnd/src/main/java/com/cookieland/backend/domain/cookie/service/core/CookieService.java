package com.cookieland.backend.domain.cookie.service.core;

import com.cookieland.backend.domain.cookie.dto.request.CookieRequestDto;
import com.cookieland.backend.domain.cookie.entity.Cookie;
import com.cookieland.backend.domain.cookie.repository.CookieRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.constraints.NotNull;

@Slf4j
@Service
@RequiredArgsConstructor
@Transactional
public class CookieService {

    private final CookieRepository cookieRepository;

    public Cookie create (final CookieRequestDto.@NotNull Create request) {
        return cookieRepository.save(Cookie.toEntity(request));
    }

    @Transactional (readOnly = true)
    public Cookie findById(final @NotNull Long id) {
        return cookieRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("not found by Id"));
    }

}
