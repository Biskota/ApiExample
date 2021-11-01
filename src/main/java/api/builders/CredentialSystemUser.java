package api.builders;

import lombok.*;

@Data
@Builder
public class CredentialSystemUser {

    private String email;
    private String password;
}
