package Methods;
import Plane.Plane;

import java.util.Comparator;

public class CompByRange implements Comparator<Plane>{
    @Override
    public int compare(Plane o1, Plane o2) {
        int flag = o1.getRange() - o2.getRange();
        return flag;
    }


}
