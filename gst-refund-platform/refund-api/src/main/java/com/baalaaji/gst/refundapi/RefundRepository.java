package com.baalaaji.gst.refundapi;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

// Talks to the database. Spring writes save, findById, delete for us.
public interface RefundRepository extends JpaRepository<Refund, UUID> {
}
