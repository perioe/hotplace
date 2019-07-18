package com.hotplace.hotplace.controller;

import com.hotplace.hotplace.domain.TbUserEntity;
import com.hotplace.hotplace.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/")
    public TbUserEntity getIndex() {
        return testService.getTest(1L).get();
    }
}
