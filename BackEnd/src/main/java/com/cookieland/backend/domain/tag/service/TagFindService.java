package com.cookieland.backend.domain.tag.service;

import com.cookieland.backend.domain.tag.repository.TagRepository;
import com.cookieland.backend.domain.tag.service.core.TagService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@RequiredArgsConstructor
@Transactional
public class TagFindService {

    private final TagService tagService;

}
