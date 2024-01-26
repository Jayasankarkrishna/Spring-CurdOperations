package com.example_app.curd_operations.Dao;

import com.example_app.curd_operations.Entity.CallProgress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CallProgressRepository extends JpaRepository<CallProgress, Long> {
}
