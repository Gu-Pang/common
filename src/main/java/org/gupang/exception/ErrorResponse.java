package org.gupang.exception;

import org.springframework.http.HttpStatusCode;

public record ErrorResponse(
        HttpStatusCode httpStatusCode,
        String message
) {
}
