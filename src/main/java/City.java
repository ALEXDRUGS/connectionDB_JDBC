import java.util.Objects;

public class City {
    private String cityName;
    private Integer cityId;

    public City(String cityName, Integer cityId) {
        this.cityName = cityName;
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    @Override
    public String toString() {
        return "City " + cityName + " cityId " + cityId;
    }
}
