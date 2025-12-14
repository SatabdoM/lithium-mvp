package com.lithium.lithium.dto.auth;

public record SignupRequest(
        String email,
        String name,
        String password
) {
}
