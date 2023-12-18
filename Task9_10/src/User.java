import java.util.List;

public class User {
    private String name;
    private String spotifyAccount; // Optional, hence could be null
    
    // Association with other classes
    private Preferences preferences;
    private List<Report> reports;
    private SearchHistory searchHistory;
    
    // Constructors, getters, and setters would be added here
}
