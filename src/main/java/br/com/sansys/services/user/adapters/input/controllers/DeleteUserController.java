package br.com.sansys.services.user.adapters.input.controllers;

import br.com.sansys.services.user.application.ports.input.DeleteUserInputGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;


@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class DeleteUserController {

    private final DeleteUserInputGateway deleteUserInputGateway;

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity<Void> delete(@PathVariable("id") String id) {
        deleteUserInputGateway.deleteById(UUID.fromString(id));
        return ResponseEntity.noContent().build();
    }

}
