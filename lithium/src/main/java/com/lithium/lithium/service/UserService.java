package com.lithium.lithium.service;

import com.lithium.lithium.dto.auth.UserProfileResponse;

public interface UserService {
    UserProfileResponse getProfile(Long userId);
}
