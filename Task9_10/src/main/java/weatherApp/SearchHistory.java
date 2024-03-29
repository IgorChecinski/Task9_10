package weatherApp;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class SearchHistory {
    private HashMap<Location, Date> listOfSearchLocations;

    public SearchHistory() {
    }

    public SearchHistory(HashMap<Location, Date> listOfSearchLocations) {
        this.listOfSearchLocations = listOfSearchLocations;
    }



    public Date addSearchHistory(Location location){
        return listOfSearchLocations.put(location, new Date());
    }

    public HashMap<Location, Date> getListOfSearchLocations() {
        return listOfSearchLocations;
    }

    public void setListOfSearchLocations(HashMap<Location, Date> listOfSearchLocations) {
        this.listOfSearchLocations = listOfSearchLocations;
    }
}