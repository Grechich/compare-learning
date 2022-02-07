import java.util.Comparator;

public  class  PhoneComparatorByCameras implements  Comparator <Phone>{

    @Override
    public int compare(Phone o1, Phone o2) {
        return o1.getCameras()-o2.getCameras();
    }
}
