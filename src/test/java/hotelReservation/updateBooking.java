package hotelReservation;

import io.restassured.http.ContentType;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class updateBooking {


    @Test
    public void test(){

        String jsonObject = "{\n" +
                "    \"firstname\" : \"Max\",\n" +
                "    \"lastname\" : \"Goran\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";

      String token ="2778662706a3797" ;
        given().contentType(ContentType.JSON).
                accept(ContentType.JSON).
                header("Cookie","token="+token).
                body(jsonObject).
                put("https://restful-booker.herokuapp.com/booking/35").prettyPeek().
                then().statusCode(200);




    }
}
