package com.lithium.lithium.dto.auth;

public record LoginRequest(
        String email,
        String password
) {
}
