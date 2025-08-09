package com.cpd.hotel_system.auth_service_api.service;

import java.io.IOException;

import com.cpd.hotel_system.auth_service_api.dto.request.SystemUserRequestDto;

public interface SystemUserService {
    public void createUser(SystemUserRequestDto dto) throws IOException;
}
