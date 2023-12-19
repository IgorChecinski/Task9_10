package test;

import org.junit.jupiter.api.Test;
import weatherApp.Location;

import static org.junit.jupiter.api.Assertions.*;

class LocationTest {

    @Test
    void searchForLocation() {
        Location loc = new Location();
        String location = "Warsaw";

        assertEquals("Warsaw", location, loc.searchForLocation(location));
    }
}