package tests.apiTests;

import BaseClasses.api.POJO.RequestData;
import BaseClasses.api.apiTestBase.ApiTestBase;
import BaseClasses.api.endpoints.DigitalHostpitalApi;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.equalTo;

public class Dh extends ApiTestBase {



    @Test
    public void canPostPatient () {

        final RequestSpecification createPatientSpec = RestAssured.given().
                contentType(ContentType.JSON).
                body(RequestData.CREATE_PATIENT_BODY);

        RestAssured.given(createPatientSpec).
                when().
                post(DigitalHostpitalApi.POST_PATIENT_DATA).
                then().
                statusCode(200).
                and().
                body("SODERZHIT UPORYADO4 SPISOK USLUG + proverit' basu?", equalTo("o"));
    }

    @Test
    public void canGetSeverity() {

        final RequestSpecification severitySpec = RestAssured.given().
                contentType(ContentType.JSON).
                body(RequestData.CREATE_PATIENT_BODY);

        RestAssured.given(severitySpec).
                when().
                get(DigitalHostpitalApi.GET_SEVERITY).
                then().
                statusCode(200).
                and().
                body("SODERZHIT UPORYADO4 SPISOK USLUG + proverit' basu?", equalTo("o"));
    }


    @Test
    public void canGetDiagnosis() {

        final RequestSpecification severitySpec = RestAssured.given().
                contentType(ContentType.JSON).
                body(RequestData.CREATE_PATIENT_BODY);

        RestAssured.given(severitySpec).
                when().
                get(DigitalHostpitalApi.GET_DIAGNOSTIC).
                then().
                statusCode(200).
                and().
                body("SODERZHIT UPORYADO4 SPISOK USLUG + proverit' basu?", equalTo("o"));

    }

    @Test
    public void canGetServiceList() {

    }

    @Test
    public void canPostQueueStarted() {

    }

    @Test
    public void canPostQueueFinished() {

    }

    @Test
    public void canPostOfficeReady() {

    }


}
