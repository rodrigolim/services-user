package br.com.sansys.services.user.adapters.output;

import br.com.sansys.services.user.adapters.output.repositories.UserRepository;
import br.com.sansys.services.user.application.core.domains.User;
import br.com.sansys.services.user.application.ports.output.FindAllUserOutputGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
@RequiredArgsConstructor
public class FindAllUserAdapter implements FindAllUserOutputGateway {

    private final UserRepository repository;

    @Override
    public List<User> findAll() {
        return User.fromEntities(this.repository.findAll());
    }

}