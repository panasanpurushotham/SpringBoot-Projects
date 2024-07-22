package com.EduBridge.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.EduBridge.model.Edubridge;

@Repository
public interface EdubridgeRepository extends JpaRepository<Edubridge, Integer> {

}
