package com.ps.coupons.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ps.coupons.model.Coupon;
import com.ps.coupons.repo.CouponRepository;


@RestController
@RequestMapping("/couponapi")
public class CouponApi {
	@Autowired
	 CouponRepository couponRepo;
	
	@PostMapping( "/coupons")
	Coupon create(@RequestBody Coupon coupon ) {
		
		return couponRepo.save(coupon);
	}

	@GetMapping("/coupons/{code}")
	public Coupon getCoupon(@PathVariable String code) {
		System.out.println("SERVER 2");
		return couponRepo.findByCode(code);
	}
}
