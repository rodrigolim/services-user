package br.com.sansys.services.user.config.infra.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public final class Https {

    private Https() {
    }

    public static <T>ResponseEntity<T> CREATED(T response){
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    public static <T>ResponseEntity<T> OK(T response){
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
