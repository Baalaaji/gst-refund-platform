package com.baalaaji.gst.refundapi;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

// The door: requests to /api/refunds come here
@RestController
@RequestMapping("/api/refunds")
public class RefundController {

    private final RefundRepository repo;

    public RefundController(RefundRepository repo) {   // Spring gives us the repository
        this.repo = repo;
    }

    // POST /api/refunds  -> save a new refund with status PENDING
    @PostMapping
    public Refund file(@Valid @RequestBody RefundRequest req) {
        Refund refund = new Refund(req.gstin(), req.refundType(), req.amount());
        return repo.save(refund);
    }

    // GET /api/refunds/{id}  -> read one refund back
    @GetMapping("/{id}")
    public Refund get(@PathVariable UUID id) {
        return repo.findById(id).orElseThrow();
    }
}
