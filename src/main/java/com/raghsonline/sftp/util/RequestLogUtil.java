package com.raghsonline.sftp.util;

import jakarta.servlet.http.HttpServletRequest;

public class RequestLogUtil {

    public static String getUri(HttpServletRequest request) {
        return request.getRequestURI();
    }

    public static String getUrl(HttpServletRequest request) {
        return request.getRequestURL().toString();
    }
    
    public static String getMethodName() {
        return new Object() {}.getClass().getEnclosingMethod().getName();
    }

    public static String logRequestDetails(HttpServletRequest request) {
        return String.format("Method : '%s', Request URI: '%s', Full URL: '%s'", 
        		getMethodName(), getUri(request), getUrl(request));
    }
    
    public static String logRequestDetails(HttpServletRequest request, String methodName) {
        return String.format("Method: '%s', URI: '%s', Full URL: '%s'",
                methodName, getUri(request), getUrl(request));
    }
}