package br.com.sansys.services.user.application.core.usecases;

import br.com.sansys.services.user.application.ports.input.DeleteUserInputGateway;
import br.com.sansys.services.user.application.ports.output.DeleteUserOutputGatway;
import br.com.sansys.services.user.application.ports.output.FindByIdUserOutputGatway;

import java.util.UUID;

public class DeleteUserUseCase implements DeleteUserInputGateway {

    private final FindByIdUserOutputGatway findByIdUserOutputGatway;
    private final DeleteUserOutputGatway deleteUserOutputGatway;

    public DeleteUserUseCase(FindByIdUserOutputGatway findByIdUserOutputGatway,
                             DeleteUserOutputGatway deleteUserOutputGatway) {
        this.findByIdUserOutputGatway = findByIdUserOutputGatway;
        this.deleteUserOutputGatway = deleteUserOutputGatway;
    }

    @Override
    public void deleteById(UUID id) {
        var user = findByIdUserOutputGatway.findById(id);
        deleteUserOutputGatway.delete(user);
    }
}
