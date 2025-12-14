package com.lithium.lithium.service;

import com.lithium.lithium.dto.auth.AuthResponse;
import com.lithium.lithium.dto.auth.LoginRequest;
import com.lithium.lithium.dto.auth.SignupRequest;

public interface AuthService {
    AuthResponse signup(SignupRequest signupRequest);
    AuthResponse login(LoginRequest loginRequest);
}
