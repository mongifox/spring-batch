package com.phoenix.springbatch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.phoenix.springbatch.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
