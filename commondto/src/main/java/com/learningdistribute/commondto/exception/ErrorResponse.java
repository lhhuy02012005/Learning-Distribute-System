package com.learningdistribute.commondto.exception;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.time.Instant;
import java.util.Date;
import java.util.List;

@Builder
@Data
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ErrorResponse {
    int status;
    String path;
    String error;
    String message;
    @Builder.Default
    List<FieldViolation> details = List.of();
    Object data;
    @Builder.Default
    Instant timestamp = Instant.now();

    @Data
    @Builder
    @AllArgsConstructor
    @FieldDefaults(level = AccessLevel.PRIVATE , makeFinal = true)
    public static class FieldViolation {
        String field;
        String message;
    }
}
