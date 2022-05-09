package com.ashokit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.entity.DCEducationEntity;

public interface EducationDetailsRepo extends JpaRepository<DCEducationEntity, Serializable> {

}
