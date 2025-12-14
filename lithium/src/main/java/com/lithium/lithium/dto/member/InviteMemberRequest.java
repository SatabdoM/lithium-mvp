package com.lithium.lithium.dto.member;

import com.lithium.lithium.enums.ProjectRole;

public record InviteMemberRequest(
        String email,
        ProjectRole role
) {
}
