package com.example.Userloginregistration.EmailVerification.registration;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class RegistrationRequest {

    private  final String firstName;
    private  final String lasttName;
    private  final String email;
    private  final String password;
}