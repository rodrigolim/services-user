package br.com.sansys.services.user.config.usecases;

import br.com.sansys.services.user.adapters.output.CreateUserAdapter;
import br.com.sansys.services.user.application.core.usecases.CreateUserUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CreateUserUseCaseConfig {

    @Bean
    public CreateUserUseCase useCase(CreateUserAdapter createUserAdapter) {
        return new CreateUserUseCase(createUserAdapter);
     }

 }