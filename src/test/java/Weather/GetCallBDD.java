package Weather;


import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
public class GetCallBDD {

    @Test
    public void test_numberOfCurcuitsFor2017_Season(){


        given().
                when().
                get("http://ergast.com/api/f1/2017/circuits.json").
                then().
                assertThat().statusCode(200).
                and().
                body("MRData.CircuitTable.Circuits.circuitId",hasSize(20) ).
                header("content-length",equalTo("4551"));

    }
}
