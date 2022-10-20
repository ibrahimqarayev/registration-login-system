package com.ibrahimqarayev.bussiness.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class UserDto {

    private Long id;
    @NotEmpty
    private String firstName;
    @NotEmpty
    private String lastName;
    @NotEmpty(message = "Email bosh ola bilmez")
    @Email
    private String email;
    @NotEmpty(message = "Shifre bosh ola bilmez")
    private String password;



}
