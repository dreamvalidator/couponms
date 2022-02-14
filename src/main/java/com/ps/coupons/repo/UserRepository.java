package com.ps.coupons.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ps.coupons.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByEmail(String email);

}
