package Iterators;

/**
 * Description: IteratorPatternDemo
 * Author: silence
 * Update: silence(2016-08-01 20:21)
 */
public class IteratorPatternDemo {
    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
