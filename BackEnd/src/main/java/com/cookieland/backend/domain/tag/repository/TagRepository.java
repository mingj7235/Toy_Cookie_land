package com.cookieland.backend.domain.tag.repository;

import com.cookieland.backend.domain.tag.entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag, Long> {

}
