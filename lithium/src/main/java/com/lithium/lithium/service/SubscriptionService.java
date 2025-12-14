package com.lithium.lithium.service;

import com.lithium.lithium.dto.subscription.*;

public interface SubscriptionService {
    SubscriptionResponse getCurrentSubscription();

    CheckoutResponse getCheckoutSessionUrl(CheckoutRequest checkoutRequest, Long userId);

    PortalResponse openCustomPortal(Long userId);
}
