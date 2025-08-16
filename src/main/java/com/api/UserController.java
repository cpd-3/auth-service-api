package com.api;


import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cpd.hotel_system.auth_service_api.config.JwtService;
import com.cpd.hotel_system.auth_service_api.dto.request.SystemUserRequestDto;
import com.cpd.hotel_system.auth_service_api.service.SystemUserService;
import com.cpd.hotel_system.auth_service_api.util.StandardResponseDto;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/user-service/api/v1/users")
@RequiredArgsConstructor
public class UserController {
    private final SystemUserService systemUserService;
    private final JwtService jwtService;

    @PostMapping("/visitors/signup")
    public ResponseEntity<StandardResponseDto> createUser(
        @RequestBody SystemUserRequestDto dto
    ) throws IOException{
        systemUserService.createUser(dto);
        return new ResponseEntity<>(
            new StandardResponseDto(201,"user account was created",null),
            HttpStatus.CREATED
        );
    }

    @PostMapping("/visitors/resend")
    public ResponseEntity<StandardResponseDto> resend(
        @RequestParam String email,
        @RequestParam String type
    ) throws IOException{
        systemUserService.resend(email, type);
        return new ResponseEntity<>(
            new StandardResponseDto(200,"please check you email",null),
            HttpStatus.OK
        );
    }

    @PostMapping("/visitors/forgot-password-request-code")
    public ResponseEntity<StandardResponseDto> forgotPasswordRequest(
        @RequestParam String email
    ) throws IOException{
        systemUserService.forgotPasswordSendVerificationCode(email);
        return new ResponseEntity<>(
            new StandardResponseDto(200,"please check you email",null),
            HttpStatus.OK
        );
    }

}
