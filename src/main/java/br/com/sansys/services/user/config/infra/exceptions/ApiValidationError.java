package br.com.sansys.services.user.config.infra.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
public class ApiValidationError extends ApiSubError {
    private String object;
    private String field;
    private Object rejectedValue;
    private String message;

    /**
     * Constructor with field and message error.
     *
     * @param object  Field error.
     * @param message Custom message on annotation.
     */
    ApiValidationError(String object, String message) {
        this.object = object;
        this.message = message;
    }
}