import java.util.List;
import java.util.Objects;

public class Parc extends Place {
    private List<Hotel> hotelList;

    public Parc(String name, Double longitude, Double latitude, String description, List<Opinion> opinionList, List<Hotel> hotelList) {
        super(name, longitude, latitude, description, opinionList);
        this.hotelList = hotelList;
    }

    public List<Hotel> getHotelList() {
        return hotelList;
    }

    public void setHotelList(List<Hotel> hotelList) {
        this.hotelList = hotelList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parc parc = (Parc) o;
        return Objects.equals(hotelList, parc.hotelList);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(hotelList);
    }

}
