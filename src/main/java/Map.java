import java.util.*;

public class Map {
    private List<Parc> parcList;

    public Map(List<Parc> parcList) {
        this.parcList = parcList;
    }

    public List<Parc> getParcList() {
        return parcList;
    }

    public void setParcList(List<Parc> parcList) {
        this.parcList = parcList;
    }

    public List<Opinion> getAllReviews () {
        List<Opinion> allReviews = new ArrayList<>();

        for (Parc p : parcList) {
            allReviews.addAll(p.getOpinionList());
            for (Hotel h : p.getHotelList()){
                allReviews.addAll(h.getOpinionList());
                for (Room r : h.getRoomList()){
                    allReviews.addAll(r.getOpinionList());
                }
            }
        }
        return allReviews;
    }

    public Hotel findBestHotel () {
        Hotel bestHotel = null;
        HashMap<Integer, Hotel> hotelHashMap = new HashMap<>();
        HashSet<Hotel> hotelHashSet = new HashSet<>();

        for (Parc p : parcList) {
            hotelHashSet.addAll(p.getHotelList());
        }

        for (int i=0; i<hotelHashSet.size(); i++){
            int counter = 0;
            for (Parc p : parcList){
                for (Hotel h : p.getHotelList()){
                    if (h.equals(hotelHashSet.toArray()[i])){
                        counter++;
                    }
                }
            }
            hotelHashMap.put(counter, (Hotel) hotelHashSet.toArray()[i]);
        }

        List<Integer> ratings = hotelHashMap.keySet().stream().sorted((o1, o2) -> o2 - o1).toList();

        for (Integer i : hotelHashMap.keySet()){
            if (Objects.equals(ratings.getFirst(), i)) {
                bestHotel = hotelHashMap.get(i);
            }
        }
        return bestHotel;
    }

    public List<Place> getAllPlacesInside (Double minLat, Double maxLat, Double minLong, Double maxLong) {
        List<Place> allPlacesInside = new ArrayList<>();

        for (Parc p : parcList) {
            if (verifyLatitude(minLat, maxLat, p.getLatitude()) && verifyLongitude(minLong, maxLong, p.getLongitude())){
                allPlacesInside.add(p);
            }
            for (Hotel h : p.getHotelList()){
                if (verifyLatitude(minLat, maxLat, h.getLatitude()) && verifyLongitude(minLong, maxLong, h.getLongitude())){
                    allPlacesInside.add(h);
                }
            }
        }
        return allPlacesInside;
    }

    public boolean verifyLatitude (Double min, Double max, Double position){
        return position >= min && position <= max;
    }
    public boolean verifyLongitude (Double min, Double max, Double position){
        return position >= min && position <= max;
    }

    public Double findCheapestHotelPrice (List<Parc> parcList) {
        Double minBudget = 0.0;
        for (Parc p : parcList){
            p.getHotelList().sort(Comparator.comparing(Hotel::getNightPrice));
            minBudget += p.getHotelList().getFirst().getNightPrice();
        }
        return minBudget;
    }

    public List<Item> getAllReviewedItems () {
        List<Item> allReviewedItems = new ArrayList<>();

        for (Parc p : parcList) {
            if (!p.getOpinionList().isEmpty()){
                allReviewedItems.add(p);
            }
            for (Hotel h : p.getHotelList()){
                if (!h.getOpinionList().isEmpty()){
                    allReviewedItems.add(h);
                }
                for (Room r : h.getRoomList()){
                    if (!r.getOpinionList().isEmpty()){
                        allReviewedItems.add(r);
                    }
                }
            }
        }
        return allReviewedItems;
    }
}
