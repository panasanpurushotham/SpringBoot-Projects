package com.edubridge.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edubridge.app.entity.MobileShop;

@Repository
public interface MobileRepository extends JpaRepository<MobileShop, Integer> {

	List<MobileShop>  findByModel(String model);

}
