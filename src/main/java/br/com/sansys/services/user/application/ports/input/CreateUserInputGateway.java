package br.com.sansys.services.user.application.ports.input;

import br.com.sansys.services.user.application.core.domains.User;

import java.util.Optional;

public interface CreateUserInputGateway {
    Optional<User> create(User user);
}