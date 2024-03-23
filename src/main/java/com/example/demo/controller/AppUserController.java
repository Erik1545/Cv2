package com.example.demo.controller;

import com.example.demo.datatranferobject.AppUserResponse;
import com.example.demo.datatranferobject.AppUserResponseInput;
import com.example.demo.domain.AppUser;
import com.example.demo.service.AppUserService;
import com.example.demo.service.ResourceNotFound;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/app-user")
@AllArgsConstructor
public class AppUserController {
    private AppUserService appUserService;

    @GetMapping("")
    public ResponseEntity<List<AppUserResponse>> findAll() {
        var result = appUserService.findAllByActiveEquals();

        return ResponseEntity.ok(result.stream().map(AppUser::toDto).collect(Collectors.toList()));
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable final Long id) throws ResourceNotFound {
        var result = appUserService.findById(id);

        return ResponseEntity.ok(result.toDto());
    }

    @PostMapping("")
    public ResponseEntity<AppUserResponse> create(@RequestBody @Validated final AppUserResponseInput input) {
        var result = appUserService.create(toEntity(input));

        return ResponseEntity.ok(result.toDto());
    }

    @PutMapping("/{id}")
    public ResponseEntity<AppUserResponse> update(@PathVariable final Long id, @RequestBody final AppUserResponseInput input) {
        var result = appUserService.update(toEntity(id, input));

        return ResponseEntity.ok(result.toDto());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable final Long id) {
        appUserService.delete(id);

        return ResponseEntity.noContent().build();
    }

    private static AppUser toEntity(final AppUserResponse input) {
        return new AppUser(
                input.getUsername(),
                input.getPassword(),
                input.getActive(),
                input.getCreationDate(),
                input.getUpdateDate()
        );
    }

    private static AppUser toEntity(final Long id, final AppUserResponseInput input) {
        return new AppUser(
                id,
                input.getUsername(),
                input.getPassword(),
                input.getActive(),
                input.getCreationDate(),
                input.getUpdateDate()
        );
    }
}
