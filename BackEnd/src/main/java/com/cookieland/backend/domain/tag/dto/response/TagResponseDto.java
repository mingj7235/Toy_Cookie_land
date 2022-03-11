package com.cookieland.backend.domain.tag.dto.response;

import com.cookieland.backend.domain.tag.entity.Tag;
import lombok.*;

import javax.validation.constraints.NotNull;

@NoArgsConstructor (access = AccessLevel.PRIVATE)
public class TagResponseDto {

    @Getter
    @Setter
    @Builder
    @AllArgsConstructor (access = AccessLevel.PRIVATE)
    @NoArgsConstructor (access = AccessLevel.PRIVATE)
    public static class Response {
        private String tagName;

        public static Response from (final @NotNull Tag tag) {
            return Response.builder()
                    .tagName(tag.getTagName())
                    .build();
        }
    }
}
