package com.cpd.hotel_system.auth_service_api.service;

public interface EmailService {
    public boolean sendUserSignupVerificationCode(String toEmail, String subject, String otp);
}
