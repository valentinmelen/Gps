import java.util.Objects;

public class City implements Comparable<City>{
    private String cityName;
    private GeoLocationPoint geoLocationPoint;

    public City(String name, GeoLocationPoint cityCenter) {
        this.cityName = name;
        this.geoLocationPoint = cityCenter;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public GeoLocationPoint getGeoLocationPoint() {
        return geoLocationPoint;
    }

    public void setGeoLocationPoint(GeoLocationPoint geoLocationPoint) {
        this.geoLocationPoint = geoLocationPoint;
    }

    @Override
    public int compareTo(City o) {
        return 0;
    }
    @Override
    public String toString() {
        return cityName;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return Objects.equals(geoLocationPoint, city.geoLocationPoint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cityName, geoLocationPoint);
    }
}
