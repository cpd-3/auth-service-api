package com.cpd.hotel_system.auth_service_api.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.cpd.hotel_system.auth_service_api.dto.request.SystemUserRequestDto;

public interface SystemUserService {
    public void createUser(SystemUserRequestDto dto) throws IOException;
    public void initializeHosts(List<SystemUserRequestDto> users) throws IOException;
    public void resend(String email);
}
