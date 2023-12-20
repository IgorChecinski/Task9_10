package weatherApp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LocationTest {

    @Test
    void searchForLocation() {
        Location loc = new Location();
        String location = "Warsaw";

        assertEquals("Warsaw", location, loc.searchForLocation(location));
    }
}