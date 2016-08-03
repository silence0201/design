package Filter;

import java.util.List;

/**
 * Description: Criteria
 * Author: silence
 * Update: silence(2016-07-29 22:57)
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
