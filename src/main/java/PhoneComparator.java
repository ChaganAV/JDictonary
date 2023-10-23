import java.util.Comparator;

public class PhoneComparator implements Comparator<Employer> {
    @Override
    public int compare(Employer o1, Employer o2) {
        return o1.getPhone().toString().compareTo(o2.getPhone().toString());
    }
}
