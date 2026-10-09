package com.baalaaji.gst.refundapi;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

// One row in the "refund" table
@Entity
@Table(name = "refund")
public class Refund {

    @Id
    @GeneratedValue
    private UUID id;              // unique refund number

    private String gstin;         // taxpayer's GSTIN
    private String refundType;    // EXPWP or EXPWOP
    private BigDecimal amount;    // always BigDecimal for money, never double
    private String status;        // PENDING for now
    private LocalDateTime createdAt;

    protected Refund() { }        // JPA needs an empty constructor

    public Refund(String gstin, String refundType, BigDecimal amount) {
        this.gstin = gstin;
        this.refundType = refundType;
        this.amount = amount;
        this.status = "PENDING";
        this.createdAt = LocalDateTime.now();
    }

    public UUID getId() { return id; }
    public String getGstin() { return gstin; }
    public String getRefundType() { return refundType; }
    public BigDecimal getAmount() { return amount; }
    public String getStatus() { return status; }
    public LocalDateTime getCreatedAt() { return createdAt; }
}
