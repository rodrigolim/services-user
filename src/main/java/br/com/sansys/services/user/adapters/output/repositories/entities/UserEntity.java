package br.com.sansys.services.user.adapters.output.repositories.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TypeAlias(value = "User")
@Document(collection = "users")
public class UserEntity implements Serializable {

    @Id
    private UUID id;
    private String name;
    private String username;
    private String password;
    private Integer age;
    private String email;

    //Others parameters...

}