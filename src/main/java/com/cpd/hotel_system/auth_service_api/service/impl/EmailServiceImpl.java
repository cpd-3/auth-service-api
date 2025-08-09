package com.cpd.hotel_system.auth_service_api.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.cpd.hotel_system.auth_service_api.service.EmailService;
import com.cpd.hotel_system.auth_service_api.util.EmailTemplateHelper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmailServiceImpl implements EmailService{

    private final EmailTemplateHelper emailTemplateHelper;

    @Value("${fromEmail}")
    private String senderEmail;

    @Value("${emailKey}")
    private String apiKey;

    @Override
    public boolean sendUserSignupVerificationCode(String toEmail, String subject, String otp) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sendUserSignupVerificationCode'");
    }
    
}
