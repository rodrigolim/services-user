package br.com.sansys.services.user.adapters.output;

import br.com.sansys.services.user.adapters.output.repositories.UserRepository;
import br.com.sansys.services.user.application.core.domains.User;
import br.com.sansys.services.user.application.ports.output.FindByIdUserOutputGatway;
import br.com.sansys.services.user.config.infra.exceptions.UserNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.UUID;


@Component
@RequiredArgsConstructor
public class FindByIdUserAdapter implements FindByIdUserOutputGatway {

    private final UserRepository repository;
    @Override
    public User findById(UUID id) {
        return User.fromEntity(this.repository.findById(id).orElseThrow(() -> new UserNotFoundException("User not found!")));
    }
}
