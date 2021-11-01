package api.steps;

import api.builders.CredentialSystemUser;
import api.utils.ApiServises;
import api.utils.BuilderUtil;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.qameta.allure.Step;
import io.restassured.response.Response;
import lombok.SneakyThrows;

import static api.endpoints.Endpoints.SYSTEM_USER_AUTHTOKEN;

public class ApiUsersSteps {
    private final ApiServises apiService = new ApiServises();
    private final BuilderUtil builderUtil = new BuilderUtil();
    private final ObjectMapper objectMapper = new ObjectMapper();


    @SneakyThrows
    @Step("Generate tokens for existing system user by email and password")
    public Response generateSystemUserToken(String email, String password){
        CredentialSystemUser credentialSystemUser = builderUtil.buildCredentialSystemUser(email, password);
        return apiService.postRequest(SYSTEM_USER_AUTHTOKEN,null, objectMapper.writeValueAsString(credentialSystemUser),null,null);
    }
}
