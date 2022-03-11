package com.cookieland.backend.domain.cookie.dto.request;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor (access = AccessLevel.PRIVATE)
public class CookieRequestDto {

    @Getter
    @NoArgsConstructor (access = AccessLevel.PRIVATE)
    public static class Create {

        private String name;

        private String detail;

        private Long calories;

        private List<Long> tagIds;
    }
}
