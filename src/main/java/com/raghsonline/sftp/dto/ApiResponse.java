package com.raghsonline.sftp.dto;

import java.time.LocalDateTime;

// Supporting DTO
//Enhanced DTO
public record ApiResponse(
 LocalDateTime serverTime,
 boolean success,
 String message,
 String filename,  // Optional: include the uploaded filename
 Object data // Optional payload (can be null)
) {
	// Custom constructor that sets serverTime to now()
    public ApiResponse(boolean success, String message, String filename) {
        this(LocalDateTime.now(), success, message, filename, null);
    }
    
 // Factory Methods

    // General purpose
    public static ApiResponse of(boolean success, String message, String filename, Object data) {
        return new ApiResponse(LocalDateTime.now(), success, message, filename, data);
    }
    
    public static ApiResponse of(boolean success, String message, String filename) {
        return new ApiResponse(LocalDateTime.now(), success, message, filename, null);
    }

    // For success response
    public static ApiResponse success(String message, Object data) {
        return new ApiResponse(LocalDateTime.now(), true, message, null, data);
    }

    // For error response
    public static ApiResponse error(String message) {
        return new ApiResponse(LocalDateTime.now(), false, message, null, null);
    }
}