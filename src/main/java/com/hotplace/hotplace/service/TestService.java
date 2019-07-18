package com.hotplace.hotplace.service;

import com.hotplace.hotplace.domain.TbUserEntity;
import com.hotplace.hotplace.repository.TestJpaRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    private TestJpaRepository testJpaRepository;

    public Optional<TbUserEntity> getTest(long id) {
        return testJpaRepository.findById(id);
    }
}
