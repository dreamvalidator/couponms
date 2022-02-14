package com.ps.coupons.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ps.coupons.model.Coupon;

public interface CouponRepository extends JpaRepository<Coupon, Long> {

	Coupon findByCode(String code);
}
