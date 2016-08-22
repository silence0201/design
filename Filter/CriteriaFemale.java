package Filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: CriteriaFemale
 * Author: silence
 * Update: silence(2016-07-29 22:58)
 */
public class CriteriaFemale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("FEMALE")){
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
