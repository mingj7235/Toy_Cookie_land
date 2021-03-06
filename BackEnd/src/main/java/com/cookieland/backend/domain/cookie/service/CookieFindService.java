package com.cookieland.backend.domain.cookie.service;

import com.cookieland.backend.domain.cookie.dto.response.CookieResponseDto;
import com.cookieland.backend.domain.cookie.service.core.CookieService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.constraints.NotNull;
import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
@Transactional (readOnly = true)
public class CookieFindService {

    private final CookieService cookieService;

    public CookieResponseDto.Response findById (final @NotNull Long id) {
       return CookieResponseDto.Response.from(cookieService.findById(id));
    }

//    public List<CookieResponseDto.Response> findAll () {
//        return Coo
//    }
}
