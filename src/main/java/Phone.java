import java.util.Objects;

public class Phone implements Comparable<Phone>{
    private int id;
    private String brand;
    private String model;
    private RAM ram;
    private int memory;
    private double screenSize;
    private int cameras;
    private int sims;

    public Phone(int id, String brand, String model, RAM ram, int memory, double screenSize, int cameras, int sims) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.memory = memory;
        this.screenSize = screenSize;
        this.cameras = cameras;
        this.sims = sims;
    }

    public Phone() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getCameras() {
        return cameras;
    }

    public void setCameras(int cameras) {
        this.cameras = cameras;
    }

    public int getSims() {
        return sims;
    }

    public void setSims(int sims) {
        this.sims = sims;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                ", memory=" + memory +
                ", screenSize=" + screenSize +
                ", cameras=" + cameras +
                ", sims=" + sims +
                "}\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Phone)) return false;
        Phone phone = (Phone) o;
        return getId() == phone.getId() && getMemory() == phone.getMemory() && Double.compare(phone.getScreenSize(), getScreenSize()) == 0 && getCameras() == phone.getCameras() && getSims() == phone.getSims() && Objects.equals(getBrand(), phone.getBrand()) && Objects.equals(getModel(), phone.getModel()) && getRam() == phone.getRam();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getBrand(), getModel(), getRam(), getMemory(), getScreenSize(), getCameras(), getSims());
    }

    @Override
    public int compareTo(Phone phone) {
        int result = this.brand.compareTo(phone.getBrand());
        if (result == 0 )
            result = this.model.compareTo(phone.getModel());
        if (result == 0 )
            result = this.ram.compareTo(phone.getRam());
        if (result == 0 )
            result = this.ram.compareTo(phone.getRam());

        return result;
    }
}
