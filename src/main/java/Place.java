import java.util.List;

public abstract class Place extends Item {
    private String name;
    private Double longitude;
    private Double latitude;
    private String description;
    private List<Opinion> opinionList;

    public Place(String name, Double longitude, Double latitude, String description, List<Opinion> opinionList) {
        this.name = name;
        this.longitude = longitude;
        this.latitude = latitude;
        this.description = description;
        this.opinionList = opinionList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
