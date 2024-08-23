import java.util.List;
import java.util.Objects;

public class Hotel extends Place {
    private String telephone;
    private String email;
    private Double nightPrice;
    private List<Room> roomList;

    public Hotel(String name, Double longitude, Double latitude, String description, List<Opinion> opinionList, String telephone, String email, Double nightPrice, List<Room> roomList) {
        super(name, longitude, latitude, description, opinionList);
        this.telephone = telephone;
        this.email = email;
        this.nightPrice = nightPrice;
        this.roomList = roomList;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getNightPrice() {
        return nightPrice;
    }

    public void setNightPrice(Double nightPrice) {
        this.nightPrice = nightPrice;
    }

    public List<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<Room> roomList) {
        this.roomList = roomList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hotel hotel = (Hotel) o;
        return Objects.equals(telephone, hotel.telephone) && Objects.equals(email, hotel.email) && Objects.equals(nightPrice, hotel.nightPrice) && Objects.equals(roomList, hotel.roomList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(telephone, email, nightPrice, roomList);
    }
}
