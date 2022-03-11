package com.cookieland.backend.domain.cookie.dto.response;

import com.cookieland.backend.domain.cookie.entity.Cookie;
import lombok.*;

import javax.validation.constraints.NotNull;

@NoArgsConstructor (access = AccessLevel.PRIVATE)
public class CookieResponseDto {

    @Getter
    @Builder
    @AllArgsConstructor (access = AccessLevel.PRIVATE)
    @NoArgsConstructor (access = AccessLevel.PRIVATE)
    public static class Response {
        private Long id;

        private String name;

        private String detail;

        private Long calories;

        public static Response from (final @NotNull Cookie cookie) {
            return Response.builder()
                    .id(cookie.getId())
                    .name(cookie.getName())
                    .detail(cookie.getDetail())
                    .calories(cookie.getCalories())
                    .build();
        }
    }
}
