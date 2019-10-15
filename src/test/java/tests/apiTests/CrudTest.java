package tests.apiTests;

import BaseClasses.api.POJO.TokenResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.restassured.RestAssured;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static BaseClasses.api.POJO.Basket.*;


public class CrudTest {

    private static TokenResponse authorizationToken;
    private final static ObjectMapper mapper = new ObjectMapper();
    private static ObjectNode bodyObject;
    private static String requestBody;

    @BeforeTest
    public void setUp() {
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
    }

    @Test
    public void crudTest() {
        //создаем body запроса
        bodyObject = mapper.createObjectNode();
        requestBody = bodyObject.put("capacity",
                268).toString();

        //создаем новую корзину и получаем токен авторизации
        authorizationToken = createBasket(generatedBasketId, requestBody);
    }

    @Test
    public void s2() {
        //используя ранее полученный токен смотрим корзину
        getBasket(generatedBasketId, authorizationToken);
    }

    @Test
    public void s3() {
        //редактируем capacity корзины
        updateBasket(generatedBasketId, authorizationToken);
    }

    @Test
    public void s4() {
        //удаляем
        deleteBasket(generatedBasketId, authorizationToken);
    }
}

