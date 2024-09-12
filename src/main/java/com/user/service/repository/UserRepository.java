package com.user.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.user.service.controller.request.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, String> {

}
