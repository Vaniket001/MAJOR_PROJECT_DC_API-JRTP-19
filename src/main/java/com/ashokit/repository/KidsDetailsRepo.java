package com.ashokit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ashokit.entity.DCKidsEntity;

public interface KidsDetailsRepo extends JpaRepository<DCKidsEntity, Serializable> {

}
