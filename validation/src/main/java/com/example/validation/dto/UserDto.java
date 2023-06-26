package com.example.validation.dto;

import com.example.validation.constraints.annotations.EmailWhitelist;
import com.example.validation.constraints.annotations.PhoneWhitelist;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.time.LocalDate;

@Data
public class UserDto {
    private Long id;

    @NotBlank
    private String username;

    @EmailWhitelist
    private String email;

    @PhoneWhitelist
    private String phone;

    @NotNull
    @Min(value = 14, message = "14살 이상이어야함니다 ")
    private Integer age;

    @Future
    private LocalDate validUntil;

    @NotNull
    private String notNull; //Null 값인지 아닌지


}
