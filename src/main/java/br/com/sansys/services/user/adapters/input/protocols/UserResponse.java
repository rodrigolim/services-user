package br.com.sansys.services.user.adapters.input.protocols;

import br.com.sansys.services.user.application.core.domains.User;
import br.com.sansys.services.user.adapters.output.repositories.entities.UserEntity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import org.springframework.beans.BeanUtils;

import java.io.Serializable;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserResponse implements Serializable {
    private String id;
    private String name;
    private String username;
    private String password;
    private Integer age;
    private String email;

    List<UserResponse> responses;

    public static UserResponse fromDomain(User user) {
        return UserResponse.builder()
                .id(user.getId().toString())
                .name(user.getName())
                .username(user.getUsername())
                .password(user.getPassword())
                .age(user.getAge())
                .email(user.getEmail())
                .build();
    }

    public static UserResponse of(List<UserEntity> entities) {
        var list = entities.stream().map(UserResponse::of).toList();
        return UserResponse.builder()
                .responses(list)
                .build();
    }

    public static UserResponse of(UserEntity entity) {
        var response = new UserResponse();
        BeanUtils.copyProperties(entity, response);
        return response;
    }

    public static UserResponse fromDomains(List<User> users) {
        var list = users.stream().map(UserResponse::fromDomain).toList();
        return UserResponse.builder()
                .responses(list)
                .build();
    }
}