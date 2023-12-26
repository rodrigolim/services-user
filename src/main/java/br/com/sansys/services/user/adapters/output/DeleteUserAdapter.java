package br.com.sansys.services.user.adapters.output;

import br.com.sansys.services.user.adapters.output.repositories.UserRepository;
import br.com.sansys.services.user.application.core.domains.User;
import br.com.sansys.services.user.application.ports.output.DeleteUserOutputGatway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DeleteUserAdapter implements DeleteUserOutputGatway {

    private final UserRepository repository;

    @Override
    public void delete(User user) {
        this.repository.deleteById(user.getId());
    }
}
