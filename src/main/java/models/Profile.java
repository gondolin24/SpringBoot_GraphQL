package models;

public class Profile {
    private int id;
    private String username;
    private String bio;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", bio='" + bio + '\'' +
                '}';
    }
}
