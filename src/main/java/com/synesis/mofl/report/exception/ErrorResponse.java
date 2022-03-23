package com.synesis.mofl.report.exception;

import com.synesis.mofl.report.payload.ApiResponse;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ErrorResponse extends ApiResponse{

	private String error;

	public ErrorResponse(Boolean success, String message, String error) {
		super(success, message);
		this.error = error;
	}
	
	public ErrorResponse(String message, String error) {
		super(message);
		this.error = error;
	}
	
	public ErrorResponse(Boolean success, String message, String error, Object data) {
		super(success, message, data);
		this.error = error;
	}
	
	public ErrorResponse(Boolean success, String message, Object data) {
		super(success, message, data);
	}
	
}
