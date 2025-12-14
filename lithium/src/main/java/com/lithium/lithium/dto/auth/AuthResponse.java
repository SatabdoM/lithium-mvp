package com.lithium.lithium.dto.auth;

public record AuthResponse(
        String token,
        UserProfileResponse user
) {

}
