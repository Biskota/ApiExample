import api.steps.ApiUsersSteps;
import api.utils.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.TmsLinks;
import org.testng.annotations.Test;

import static org.testng.Assert.*;
import static org.testng.Assert.assertEquals;


public class User extends BaseTest {
    private final ApiUsersSteps apiUsersSteps = new ApiUsersSteps();

    @Test
    @TmsLinks({})
    @Description("POST /user/v1/systemuser/authtoken")
    public void authTokenGenerate(){
        assertEquals(apiUsersSteps.generateSystemUserToken(testCred.SYSTEM_USER_EMAIL(), testCred.SYSTEM_USER_PASSWORD()).getStatusCode(), 200);
    }
}
