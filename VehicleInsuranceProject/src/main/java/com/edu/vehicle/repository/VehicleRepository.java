package com.edu.vehicle.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.edu.vehicle.entity.Vehicle;


@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {	
     
}