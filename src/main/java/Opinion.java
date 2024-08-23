import java.time.LocalDate;

public class Opinion {
    private User user;
    private Place place;
    private Room room;
    private int rating;
    private String description;
    private LocalDate date;

    public Opinion(User user, Place place, int rating, String description, LocalDate date) {
        this.user = user;
        this.place = place;
        this.rating = rating;
        this.description = description;
        this.date = date;
        this.room = null;
    }

    public Opinion(User user, Room room, int rating, String description, LocalDate date) {
        this.user = user;
        this.room = room;
        this.rating = rating;
        this.description = description;
        this.date = date;
        this.place = null;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
