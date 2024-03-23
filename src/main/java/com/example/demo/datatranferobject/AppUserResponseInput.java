package com.example.demo.datatranferobject;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppUserResponseInput {

    @NotNull
    @NotBlank
    @Size(max = 256, min = 1)
    private String username;
    private String password;
    private Boolean active;

    private LocalDateTime creationDate;

    private LocalDateTime updateDate;


}
