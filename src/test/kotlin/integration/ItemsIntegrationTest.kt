package integration

import io.quarkus.test.junit.QuarkusTest
import io.restassured.RestAssured.given
import org.junit.jupiter.api.Test
import org.testcontainers.junit.jupiter.Testcontainers

@Testcontainers
@QuarkusTest
internal class ItemsIntegrationTest {

    @Test
    fun testGetItemsEndpoint() {
        given()
                .`when`().get("/items")
                .then()
                .statusCode(200)
    }

    @Test
    fun testPostItemsEndpoint() {
        given()
                .`when`().post("/items")
                .then()
                .statusCode(200)
    }

}
