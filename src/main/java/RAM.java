public enum RAM {
    HALF_GB (512),
    ONE_GB(1024),
    TWO_GB(2048),
    THREE_GB(3072),
    FOUR_GB(4096),
    SIX_GB(6144),
    EIGHT_GB(8192);


    private final int size;

    RAM(int size) {
        this.size = size;
    }

    public int getSize(){
        return this.size;
    }
}
