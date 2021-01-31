import java.util.ArrayList;
import java.util.List;

public class PenaltySystem {
    private List<Person> personList;

    public PenaltySystem() {
        this.personList = new ArrayList<Person>();
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }
    public void SetPenalty(Penalty penalty, long id){

        if(personList.stream()
                .anyMatch(t -> t.getId().equals(idToCheck));
    }

}
