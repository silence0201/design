package Filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: CriteriaSingle
 * Author: silence
 * Update: silence(2016-07-29 22:59)
 */
public class CriteriaSingle implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
