package org.gupang.common.exception;

import org.springframework.http.HttpStatusCode;

public record ErrorResponse(
        HttpStatusCode httpStatusCode,
        String message
) {
}
