package br.com.sansys.services.user.application.core.usecases;

import br.com.sansys.services.user.application.core.domains.User;
import br.com.sansys.services.user.application.core.validator.UserValidator;
import br.com.sansys.services.user.application.ports.input.CreateUserInputGateway;
import br.com.sansys.services.user.application.ports.output.CreateUserOutputGateway;
import br.com.sansys.services.user.config.infra.exceptions.UserNotValidException;

import java.util.Optional;

public class CreateUserUseCase implements CreateUserInputGateway {

    private final CreateUserOutputGateway createUserOutputGateway;

    public CreateUserUseCase(CreateUserOutputGateway createUserOutputGateway) {
        this.createUserOutputGateway = createUserOutputGateway;
    }

    @Override
    public Optional<User> create(User user) {
        if (UserValidator.isValid(user)){
            return createUserOutputGateway.save(user);
        }
        throw new UserNotValidException("User not is valid!");
     }
 }