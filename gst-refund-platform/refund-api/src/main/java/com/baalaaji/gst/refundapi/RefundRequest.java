package com.baalaaji.gst.refundapi;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;

// What the user sends in the request body
public record RefundRequest(
        @NotBlank @Size(min = 15, max = 15) String gstin,   // GSTIN is 15 characters
        @NotBlank String refundType,
        @NotNull @Positive BigDecimal amount
) { }
