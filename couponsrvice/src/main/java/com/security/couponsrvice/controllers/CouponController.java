package com.security.couponsrvice.controllers;

import com.security.couponsrvice.model.Coupon;
import com.security.couponsrvice.repository.CouponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/couponapi")
public class CouponController {

    @Autowired
    private CouponRepository repository;

    @PostMapping("/coupon")
    public Coupon create(@RequestBody Coupon coupon){
        return repository.save(coupon);
    }

    @GetMapping("/coupon/{code}")
    public Coupon getCoupon(@PathVariable String code){
        return repository.findByCode(code);
    }
}
