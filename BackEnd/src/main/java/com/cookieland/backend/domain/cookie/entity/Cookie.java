package com.cookieland.backend.domain.cookie.entity;

import com.cookieland.backend.domain.tag.entity.Tag;
import com.cookieland.backend.global.common.base.BaseTime;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
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

}
