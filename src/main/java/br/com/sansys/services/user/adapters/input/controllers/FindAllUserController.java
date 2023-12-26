package br.com.sansys.services.user.adapters.input.controllers;

import br.com.sansys.services.user.adapters.input.protocols.UserResponse;
import br.com.sansys.services.user.application.ports.output.FindAllUserOutputGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class FindAllUserController {

    private final FindAllUserOutputGateway findAllUserOutputGateway;

    @GetMapping
    public ResponseEntity<UserResponse> fildAll() {
//        var users = findAllUserOutputGateway.findAll();
//        return ResponseEntity.ok(UserResponse.fromDomains(users));

        return ResponseEntity.ok(UserResponse.fromDomains(findAllUserOutputGateway.findAll()));
    }

}