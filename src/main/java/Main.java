import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Phone sumsungS21 = new Phone(0, "Sumsung", "S21", RAM.EIGHT_GB, 256, 6.57, 4, 2);
        Phone xiaomiK10 = new Phone(1, "Xiaomi", "K10", RAM.EIGHT_GB, 128, 6.13, 5, 2);
        Phone xiaomi10S = new Phone(2, "Xiaomi", "10S", RAM.SIX_GB, 128, 6.3, 3, 2);
        Phone xiaomi9C = new Phone(3, "Xiaomi", "9A", RAM.THREE_GB, 64, 6.25, 3, 1);
        Phone xiaomi9A = new Phone(4, "Xiaomi", "9A", RAM.TWO_GB, 32, 6.53, 2, 1);
        Phone iPhoneX = new Phone(5, "iPhone", "X", RAM.EIGHT_GB, 256, 6.73, 3, 2);

        PhonesStorage storage = new PhonesStorage();
        storage.addPhone(iPhoneX);
        storage.addPhone(sumsungS21);
        storage.addPhone(xiaomi9A);
        storage.addPhone(xiaomi9C);
        storage.addPhone(xiaomi10S);
        storage.addPhone(xiaomiK10);

Comparator <Phone> phoneByScreenSize = new Comparator<>() {
    public int compare(Phone o1, Phone o2) {
        if (o1.getScreenSize()-o2.getScreenSize() > 0) {
            return 1;
        }else if (o1.getScreenSize()-o2.getScreenSize() < 0){
            return -1;
        }else {
            return 0;
        }
    }
};

        System.out.println(storage);
        Collections.sort(storage.getPhones());
        System.out.println(storage);
        Collections.sort(storage.getPhones(), Collections.reverseOrder());
        System.out.println(storage);
        Collections.sort(storage.getPhones(), (o1, o2) -> {
            if (o1.getScreenSize()-o2.getScreenSize() > 0) {
                return 1;
            }else if (o1.getScreenSize()-o2.getScreenSize() < 0){
                return -1;
            }else {
                return 0;
            }
        });
        System.out.println(storage);
        Collections.sort(storage.getPhones(),new PhoneComparatorByCameras());
        System.out.println(storage);
    }
}
