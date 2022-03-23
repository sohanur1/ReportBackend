package com.synesis.mofl.report.service;

import com.synesis.mofl.report.model.FinancialProgress;
import com.synesis.mofl.report.repository.FinancialProgressRepository;
import com.synesis.mofl.report.service.IService.FinancialProgressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FinancialProgressImpl implements FinancialProgressService {

    @Autowired
    private FinancialProgressRepository financialProgressRepository;

    @Override
    public FinancialProgress insertUser(FinancialProgress financialProgress) {
        return financialProgressRepository.save(financialProgress);
    }

    @Override
    public List<FinancialProgress> fetchData() {
        return financialProgressRepository.findAll();
    }


}
