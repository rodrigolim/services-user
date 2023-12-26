package br.com.sansys.services.user.application.ports.output;

import br.com.sansys.services.user.application.core.domains.User;

public interface DeleteUserOutputGatway {
    void delete(User user);
}
