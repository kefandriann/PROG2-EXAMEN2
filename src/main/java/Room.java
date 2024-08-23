import java.util.List;

public class Room extends Item {
    private Hotel hotel;
    private int number;
    private List<Opinion> opinionList;

    public Room(Hotel hotel, int number, List<Opinion> opinionList) {
        this.hotel = hotel;
        this.number = number;
        this.opinionList = opinionList;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<Opinion> getOpinionList() {
        return opinionList;
    }

    public void setOpinionList(List<Opinion> opinionList) {
        this.opinionList = opinionList;
    }

    public void addReview (Opinion o) {
        this.opinionList.add(o);
    }
}
