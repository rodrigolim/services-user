package br.com.sansys.services.user.application.core.domains;

import br.com.sansys.services.user.adapters.input.protocols.UserRequest;
import br.com.sansys.services.user.adapters.output.repositories.entities.UserEntity;
import br.com.sansys.services.user.config.infra.utils.GenId;
import lombok.*;
import org.springframework.beans.BeanUtils;

import java.util.UUID;
import java.util.List;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private UUID id;
    private String name;
    private String username;
    private String password;
    private Integer age;
    private String email;

    public static User fromRequest(UserRequest request) {
        var user = new User();
        BeanUtils.copyProperties(request, user);
        user.setId(GenId.newUUID(request.getId()));
        return user;
    }

    public static User fromEntity(UserEntity entity) {
        var user = new User();
        BeanUtils.copyProperties(entity, user);
        return user;
    }

    public static List<User> fromEntities(List<UserEntity> all) {
        return all.stream().map(User::fromEntity).toList();
    }

    public UserEntity toEntity() {
        return UserEntity.builder()
                .id(getId())
                .name(getName())
                .username(getUsername())
                .password(getPassword())
                .age(getAge())
                .email(getEmail())
                .build();
    }


 }