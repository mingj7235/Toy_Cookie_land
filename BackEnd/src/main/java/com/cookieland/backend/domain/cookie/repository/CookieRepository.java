package com.cookieland.backend.domain.cookie.repository;

import com.cookieland.backend.domain.cookie.entity.Cookie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CookieRepository extends JpaRepository<Cookie, Long> {

}
