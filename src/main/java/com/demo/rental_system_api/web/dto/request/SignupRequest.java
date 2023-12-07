package com.demo.rental_system_api.web.dto.request;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
public class SignupRequest {
    @NotBlank
    @Size(min = 3, max = 20)
    private String username;
    @NotBlank
    @Size(max = 50)
    @Email(message = "Invalid email")
    private String email;

    @NotBlank
    private String phoneNumber;

    @NotBlank
    @Size(min = 5, max = 40)
    private String password;
}
