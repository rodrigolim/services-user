package br.com.sansys.services.user.adapters.output;

import br.com.sansys.services.user.adapters.output.repositories.UserRepository;
import br.com.sansys.services.user.adapters.output.repositories.entities.UserEntity;
import br.com.sansys.services.user.application.core.domains.User;
import br.com.sansys.services.user.application.ports.output.CreateUserOutputGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class CreateUserAdapter implements CreateUserOutputGateway {

    private final UserRepository repository;

    @Override
    public Optional<User> save(User user) {
        return Optional.of(User.fromEntity(this.repository.save(user.toEntity())));
    }

}