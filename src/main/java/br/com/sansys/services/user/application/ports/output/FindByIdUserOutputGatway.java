package br.com.sansys.services.user.application.ports.output;

import br.com.sansys.services.user.application.core.domains.User;

import java.util.UUID;

public interface FindByIdUserOutputGatway {
    User findById(UUID id);
}
