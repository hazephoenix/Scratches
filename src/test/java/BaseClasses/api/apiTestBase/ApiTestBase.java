package BaseClasses.api.apiTestBase;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;


public class ApiTestBase {

    @BeforeClass
    public void setup() {
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
    }

}
