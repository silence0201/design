package Intercepting;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: FilterChain
 * Author: silence
 * Update: silence(2016-08-03 21:09)
 */
public class FilterChain {
    private List<Filter> filters = new ArrayList<Filter>();
    private Target target;

    public void addFilter(Filter filter){
        filters.add(filter);
    }

    public void execute(String request){
        for (Filter filter : filters) {
            filter.execute(request);
        }
        target.execute(request);
    }

    public void setTarget(Target target){
        this.target = target;
    }
}
