import java.util.ArrayList;
import java.util.List;

public class PhonesStorage {
    private List<Phone> phones = new ArrayList<>();

    public boolean addPhone (Phone phone){
        for (Phone ph:phones) {
            if (ph.getId() == phone.getId())
                return false;
        }
        phones.add(phone);
        return true;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    public PhonesStorage(List<Phone> phones) {
        this.phones = phones;
    }

    public PhonesStorage() {
    }

    @Override
    public String toString() {
        return "PhonesStorage{" +
                "phones:\n" + phones +
                '}';
    }
}
