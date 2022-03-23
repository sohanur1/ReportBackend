package com.synesis.mofl.report.service.IService;

import com.synesis.mofl.report.model.FinancialProgress;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface FinancialProgressService {

    FinancialProgress insertUser(FinancialProgress financialProgress);


    List<FinancialProgress> fetchData();
}
