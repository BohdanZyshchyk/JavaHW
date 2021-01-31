import java.util.ArrayList;
import java.util.List;

public class Person {
    private long Id;
    private City city;
    private List<Penalty> penaltyList;

    public Person(long id, City city) {
        Id = id;
        this.city = city;
        this.penaltyList = new ArrayList<Penalty>();
    }

    @Override
    public String toString() {
        return "Person{" +
                "Id=" + Id +
                ", city=" + city +
                ", penaltyList=" + penaltyList +
                '}';
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public List<Penalty> getPenaltyList() {
        return penaltyList;
    }

    public void setPenaltyList(List<Penalty> penaltyList) {
        this.penaltyList = penaltyList;
    }
}
