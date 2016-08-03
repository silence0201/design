package Filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: CriteriaMale
 * Author: silence
 * Update: silence(2016-07-29 22:57)
 */
public class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("MALE")){
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
