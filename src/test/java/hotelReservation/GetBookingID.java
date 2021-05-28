package hotelReservation;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetBookingID {

    @Test
    public void test(){
        given().post("https://restful-booker.herokuapp.com/booking/16").prettyPeek().
                then().
                statusCode(200);
    }
}
