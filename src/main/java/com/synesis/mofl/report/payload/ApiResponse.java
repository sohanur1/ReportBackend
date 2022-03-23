package com.synesis.mofl.report.payload;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ApiResponse {
	
    private Boolean success;
    private String message;
    private Object data;
    private Long count;

    public ApiResponse(Boolean success, String message) {
        this.success = success;
        this.message = message;
    }


    public ApiResponse(Boolean success, String message, Object data) {
        this.success = success;
        this.message = message;
        this.data = data;
    }

    public ApiResponse(Boolean success, String message, Object data, Long count) {
        this.success = success;
        this.message = message;
        this.data = data;
        this.count = count;
    }
    
    public ApiResponse(String message) {
		this.message = message;
	}

    public ApiResponse(){}

}
