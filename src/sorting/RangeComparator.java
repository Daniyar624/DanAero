package sorting;
import plane.Plane;

import java.util.Comparator;

public class RangeComparator implements Comparator<Plane>{
    @Override
    public int compare(Plane o1, Plane o2) {
        int flag = o1.getRange() - o2.getRange();
        return flag;
    }


}
