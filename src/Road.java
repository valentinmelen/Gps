import java.util.Objects;

import static java.lang.Math.pow;
import static java.lang.StrictMath.sqrt;

public class Road {
    private String name;
    private GeoLocationPoint pointA;
    private GeoLocationPoint pointB;

    public Road(String name, GeoLocationPoint pointA, GeoLocationPoint pointB) {
        this.name = name;
        this.pointA = pointA;
        this.pointB = pointB;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GeoLocationPoint getPointA() {
        return pointA;
    }

    public void setPointA(GeoLocationPoint pointA) {
        this.pointA = pointA;
    }

    public GeoLocationPoint getPointB() {
        return pointB;
    }

    public void setPointB(GeoLocationPoint pointB) {
        this.pointB = pointB;
    }

    public boolean connects(City city){
        if(city.getGeoLocationPoint().equals(pointA) || city.getGeoLocationPoint().equals(pointB))
        {
            return true;
        }
        return false;
    }

    public double getLength(){
        int latitudeDifference = Math.abs(pointA.getLatitude() - pointB.getLatitude());
        int longitudeDifference = Math.abs(pointA.getLongitude() - pointB.getLongitude());

        return sqrt(pow(latitudeDifference, 2) + pow(longitudeDifference, 2));
    }

    @Override
    public String toString() {
        return name + ": " + this.getLength();
    }
}
