package com.raghsonline.sftp.dto;
// Supporting DTOs
public record FileInfo(
    String filename,
    long size,
    boolean isDirectory
) {}