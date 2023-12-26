package br.com.sansys.services.user.adapters.input.protocols;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserRequest implements Serializable {
    private String id;
    private String name;
    private String username;
    private String password;
    private Integer age;
    private String email;

    private List<UserRequest> requests;
}