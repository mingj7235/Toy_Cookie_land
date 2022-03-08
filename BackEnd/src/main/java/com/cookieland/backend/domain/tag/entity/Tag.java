package com.cookieland.backend.domain.tag.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter (AccessLevel.PRIVATE)
@NoArgsConstructor (access = AccessLevel.PROTECTED)
@AllArgsConstructor (access = AccessLevel.PRIVATE)
public class Tag {

    @Id
    @GeneratedValue
    private Long id;

    private String tagName;
}
