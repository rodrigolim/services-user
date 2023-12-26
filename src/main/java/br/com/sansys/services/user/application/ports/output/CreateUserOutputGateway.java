package br.com.sansys.services.user.application.ports.output;

import br.com.sansys.services.user.application.core.domains.User;

import java.util.Optional;

public interface CreateUserOutputGateway {
    Optional<User> save(User user);
}