package com.example.goGreen.repository;

import com.example.goGreen.business.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataRepository extends JpaRepository <User, Long> {

}
