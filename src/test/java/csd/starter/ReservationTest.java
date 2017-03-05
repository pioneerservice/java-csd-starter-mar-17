package csd.starter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Date;
import java.util.Scanner;
import java.util.function.Function;

import static org.junit.Assert.assertEquals;
/*
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        monochrome = true,
        features = {
                "src/features/booking"
        }
)
*/
public class ReservationTest {

    @Test
    public void bookTest() {
        String memberId = "";
        String courtName = "";
        String startDate = "";
        String endDate = "";

        Order successOrder = new Order(memberId, courtName, startDate, endDate, true);
        Order failOrder = new Order(memberId, courtName, startDate, endDate, false);
        assertEquals(successOrder, Reservator.getInstance().book(memberId, courtName, startDate, endDate));
        //assertEquals(failOrder, Reservator.getInstance().book(memberId, courtName, startDate, endDate));
    }
}
