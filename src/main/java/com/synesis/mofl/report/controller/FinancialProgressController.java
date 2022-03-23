package com.synesis.mofl.report.controller;

import com.synesis.mofl.report.model.FinancialProgress;
import com.synesis.mofl.report.service.FinancialProgressImpl;
import com.synesis.mofl.report.service.IService.FinancialProgressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class FinancialProgressController {
    @Autowired
    private FinancialProgressService financialProgressService;

    @CrossOrigin
    @PostMapping("/insert")
    public FinancialProgress insertUser(@RequestBody FinancialProgress financialProgress){
        return financialProgressService.insertUser(financialProgress);
    }

    @CrossOrigin
    @GetMapping("/list")
    public List<FinancialProgress> fetchData(){
        return financialProgressService.fetchData();

    }
}
