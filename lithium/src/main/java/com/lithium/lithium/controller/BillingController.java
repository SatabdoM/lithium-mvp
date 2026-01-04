package com.lithium.lithium.controller;

import com.lithium.lithium.dto.subscription.*;
import com.lithium.lithium.service.PlanService;
import com.lithium.lithium.service.SubscriptionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BillingController {
    public final PlanService planService;
    public final SubscriptionService subscriptionService;

    @GetMapping("/api/plans")
    public ResponseEntity<List<PlanResponse>> getAllActivePlans() {
        return ResponseEntity.ok(planService.getAllActivePlans());
    }

    @GetMapping("/api/me/subscription")
    public ResponseEntity<SubscriptionResponse> getMySubscription() {
        Long userId = 1L;
        return ResponseEntity.ok(subscriptionService.getCurrentSubscription());
    }

    @PostMapping("/api/stripe/checkout")
    public ResponseEntity<CheckoutResponse> createCheckoutResponse(@RequestBody CheckoutRequest checkoutRequest) {
        Long userId = 1L;
        return ResponseEntity.ok(subscriptionService.getCheckoutSessionUrl(checkoutRequest, userId));
    }

    @PostMapping("/api/stripe/portal")
    public ResponseEntity<PortalResponse> openCustomPortal() {
        Long userId = 1L;
        return ResponseEntity.ok(subscriptionService.openCustomPortal(userId));
    }


}
