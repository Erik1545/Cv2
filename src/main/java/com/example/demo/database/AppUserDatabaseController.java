package com.example.demo.database;

import com.example.demo.datatranferobject.AppUserResponse;
import com.example.demo.service.AppUserService;
import com.example.demo.service.ResourceNotFound;
import lombok.AllArgsConstructor;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app-user")
@AllArgsConstructor
public class AppUserDatabaseController {
    private AppUserService appUserService;

    @QueryMapping
    public AppUserResponse appUser(@Argument final Long id) throws ResourceNotFound {
        return appUserService.findById(id).toDto();
    }
}
