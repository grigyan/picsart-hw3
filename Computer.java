public class Computer {
    private String brand;
    private String ownerName;

    private int numOfCores;
    private int ramMemory;
    private int hddMemory;
    private int ssdMemory;
    private double screenSize;

    private boolean isOn;
    private boolean isTouchScreen;


    public int getSsdMemory() {
        return ssdMemory;
    }

    public void setSsdMemory(int ssdMemory) {
        this.ssdMemory = ssdMemory;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getNumOfCores() {
        return numOfCores;
    }

    public void setNumOfCores(int numOfCores) {
        this.numOfCores = numOfCores;
    }

    public int getRamMemory() {
        return ramMemory;
    }

    public void setRamMemory(int ramMemory) {
        this.ramMemory = ramMemory;
    }

    public int getHddMemory() {
        return hddMemory;
    }

    public void setHddMemory(int hddMemory) {
        this.hddMemory = hddMemory;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public boolean isTouchScreen() {
        return isTouchScreen;
    }

    public void setTouchScreen(boolean touchScreen) {
        isTouchScreen = touchScreen;
    }
}
