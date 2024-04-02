import java.util.Comparator;

public class UserComparator<T extends User> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        int rersultOfComparing = o1.getFirstName().compareTo(o2.getFirstName());
        if (rersultOfComparing == 0) {
            rersultOfComparing = o1.getLastName().compareTo(o2.getLastName());
            if(rersultOfComparing == 0){
                return o1.getMiddleName().compareTo(o2.getMiddleName());
            } else{
                return rersultOfComparing;
            }
        } else {
            return rersultOfComparing;
        }
    }   
}
