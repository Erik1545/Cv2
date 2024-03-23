package com.example.demo;

import com.example.demo.repository.AppUserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Slf4j

public class DatabaseRunner implements ApplicationRunner {
    private final AppUserRepository appUserRepository;

    public DatabaseRunner(AppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public void run(ApplicationArguments args) {
        appUserRepository.findAll().forEach(appUser -> log.info(appUser.toString()));
    }
}
