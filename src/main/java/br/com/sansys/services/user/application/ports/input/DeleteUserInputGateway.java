package br.com.sansys.services.user.application.ports.input;

import java.util.UUID;

public interface DeleteUserInputGateway {

    void deleteById(UUID id);

}
