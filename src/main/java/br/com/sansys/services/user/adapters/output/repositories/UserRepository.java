package br.com.sansys.services.user.adapters.output.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import br.com.sansys.services.user.adapters.output.repositories.entities.UserEntity;

import java.util.UUID;

@Repository
public interface UserRepository extends MongoRepository<UserEntity, UUID> {

}