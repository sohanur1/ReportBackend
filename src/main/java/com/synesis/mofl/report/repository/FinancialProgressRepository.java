package com.synesis.mofl.report.repository;

import com.synesis.mofl.report.model.FinancialProgress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FinancialProgressRepository extends JpaRepository<FinancialProgress, Long> {

}
