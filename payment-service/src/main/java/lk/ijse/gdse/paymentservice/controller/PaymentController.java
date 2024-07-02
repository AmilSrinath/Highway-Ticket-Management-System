package lk.ijse.gdse.paymentservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Amil Srinath
 */
@RestController
@RequestMapping("api/v1/payment")
public class PaymentController {
    @GetMapping("/health")
    public String health() {
        return "Payment Service is up and running";
    }
}
