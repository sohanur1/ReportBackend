package com.synesis.mofl.report.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.synesis.mofl.report.exception.ErrorResponse;
import com.synesis.mofl.report.payload.ApiResponse;
import com.synesis.mofl.report.service.IService.ILicenseApplicationService;

/**
 * This controller is to provide test api
 *
 * @author Md. Emran Hossain
 * @since 20 Jan, 2022
 * @version 1.1
 */
@SuppressWarnings({ "unchecked", "rawtypes" })
@RestController
public class TestController {

//    private static final Logger LOG = LoggerFactory.getLogger(TestController.class);
//
//    @Autowired
//    private ILicenseApplicationService iTestService;
//
//    @GetMapping("/test")
//    public ResponseEntity<?> getTest(){
//        return new ResponseEntity(new ApiResponse(true, "Got Request"),
//                HttpStatus.OK);
//    }
//
//    @GetMapping("/test/{id}")
//    public ResponseEntity<?> getTestById(@PathVariable Long id){
//        try {
//             LicenseApplication licenseApplication = iTestService.getTestById(id);
//            if (ObjectUtils.isEmpty(licenseApplication)) {
//                return new ResponseEntity(new ErrorResponse(false, "There is no License Application!", "404 Not Found", null), HttpStatus.BAD_REQUEST);
//            }
//            return ResponseEntity.ok(new ApiResponse(true, "All License Application", licenseApplication, 1L));
//        }catch (Exception e) {
//            LOG.info(e.getMessage());
//            return new ResponseEntity(new ErrorResponse(false, "There is no License Application!", e.getMessage(), null), HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
}
