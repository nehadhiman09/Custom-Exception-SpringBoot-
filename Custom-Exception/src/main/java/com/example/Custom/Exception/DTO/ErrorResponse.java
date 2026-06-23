package com.example.Custom.Exception.DTO;

import lombok.*;

import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ErrorResponse {
    private String id;
    private String errorCode;
    private String message;
    private int status;
    private Instant timestamp;
    private String path;
}
