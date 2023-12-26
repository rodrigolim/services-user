package br.com.sansys.services.user.config.infra.utils;

import lombok.experimental.UtilityClass;

import java.util.UUID;

@UtilityClass
public class GenId {

    public static String newId() {
        return UUID.randomUUID().toString();
    }

    public static String newId(String id) {
        return (id != null && !id.isEmpty()) ? id : UUID.randomUUID().toString();
    }

    public static UUID newUUID() {
        return UUID.randomUUID();
    }

    public static UUID newUUID(String id) {
        return (id != null && !id.isEmpty()) ? UUID.fromString(id) : UUID.randomUUID();
    }

}
