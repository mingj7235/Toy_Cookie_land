package com.cookieland.backend.domain.cookie.entity;

import com.cookieland.backend.domain.cookie.dto.request.CookieRequestDto;
import com.cookieland.backend.domain.tag.entity.Tag;
import com.cookieland.backend.global.common.base.BaseTime;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Getter
@Setter(AccessLevel.PRIVATE)
@SuperBuilder
@NoArgsConstructor (access = AccessLevel.PROTECTED)
@AllArgsConstructor (access = AccessLevel.PRIVATE)
public class Cookie extends BaseTime {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String detail;

    private Long calories;

    @ManyToMany (cascade = CascadeType.ALL)
    private List<Tag> tags;

    public static Cookie toEntity (final CookieRequestDto.@NotNull Create request) {
        return Cookie.builder()
                .name(request.getName())
                .detail(request.getDetail())
                .calories(request.getCalories())
//                .tags() //FIXME : 해결 방안
                .build();
    }

}
