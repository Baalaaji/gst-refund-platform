package com.baalaaji.gst.refundapi;
import java.util.TimeZone;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Start here: click the green ▶ next to main() in IntelliJ
@SpringBootApplication
public class RefundApiApplication {

    public static void main(String[] args) {

        java.util.TimeZone.setDefault(java.util.TimeZone.getTimeZone("Asia/Kolkata"));
        SpringApplication.run(RefundApiApplication.class, args);
    }
}
