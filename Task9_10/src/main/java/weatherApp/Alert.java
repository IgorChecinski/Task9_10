package weatherApp;

public class Alert {
    private String name;
    private String description;
    private List<User> users;

    public Alert(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String sendNotification() {
        // Method implementation
        return "name: "+ name + " description: "+ description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
