package com.lithium.lithium.service;

import com.lithium.lithium.dto.subscription.PlanLimitsResponse;
import com.lithium.lithium.dto.subscription.UsageTodayResponse;

public interface UsageService {
    UsageTodayResponse getTodayUsageOfUser(Long userId);

    PlanLimitsResponse getCurrentSubscriptionLimitsOfUser(Long userId);
}
