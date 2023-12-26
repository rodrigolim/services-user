package br.com.sansys.services.user.adapters.input.controllers;

import br.com.sansys.services.user.adapters.input.protocols.UserRequest;
import br.com.sansys.services.user.adapters.input.protocols.UserResponse;
import br.com.sansys.services.user.application.core.domains.User;
import br.com.sansys.services.user.application.ports.input.CreateUserInputGateway;
import br.com.sansys.services.user.config.infra.utils.Https;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class CreateUserController {

    private final CreateUserInputGateway createUserInputGateway;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<UserResponse> create(@RequestBody UserRequest request) {
//        var user = createUserInputGateway.create(User.fromRequest(request));
//        return ResponseEntity.ok(UserResponse.fromDomain(user));
        return createUserInputGateway.create(User.fromRequest(request))
                .map(UserResponse::fromDomain)
                .map(Https::CREATED)
                .orElse(ResponseEntity.badRequest().build());

     }

 }