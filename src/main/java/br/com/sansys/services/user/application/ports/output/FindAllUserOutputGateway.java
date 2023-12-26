package br.com.sansys.services.user.application.ports.output;

import br.com.sansys.services.user.application.core.domains.User;

import java.util.List;

public interface FindAllUserOutputGateway {

    List<User> findAll();
}
