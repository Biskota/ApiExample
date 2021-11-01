package api.utils;

import api.builders.CredentialSystemUser;

public class BuilderUtil {
    public CredentialSystemUser buildCredentialSystemUser(String email, String password){
        return CredentialSystemUser.builder()
                .email(email)
                .password(password)
                .build();

    }
}
