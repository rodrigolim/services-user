package br.com.sansys.services.user.config.usecases;

import br.com.sansys.services.user.adapters.output.DeleteUserAdapter;
import br.com.sansys.services.user.adapters.output.FindByIdUserAdapter;
import br.com.sansys.services.user.application.core.usecases.DeleteUserUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteUserUseCaseConfig {

    @Bean
    public DeleteUserUseCase deleteUserUseCase(FindByIdUserAdapter findByIdUserAdapter, DeleteUserAdapter deleteUserAdapter) {
        return new DeleteUserUseCase(findByIdUserAdapter, deleteUserAdapter);
    }

}
