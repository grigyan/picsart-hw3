import java.util.Arrays;

public class Main {
    //bubble sort
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            boolean swap = false;
            for(int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] < array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    swap = true;
                }
            }
            if(!swap){
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {5, 6, 4, 3, 1};
        bubbleSort(a);

        Computer myPc = new Computer();
        myPc.setBrand("HP");
        myPc.setOwnerName("Grigor");
        myPc.setNumOfCores(4);
        myPc.setRamMemory(8);
        myPc.setHddMemory(1000);
        myPc.setSsdMemory(256);
        myPc.setScreenSize(15.6);

        myPc.setOn(false);
        myPc.setTouchScreen(false);

        System.out.println("Hi! My name is " + myPc.getOwnerName() + " and today I'll tell you about my PC");
        System.out.println("My PC is build by " + myPc.getBrand());
        System.out.println("It has " + myPc.getNumOfCores() + " cores");
        System.out.println("My PC has " + myPc.getRamMemory() + " GB of RAM memory" +
        " and " + myPc.getHddMemory() + " GB of HDD memory");
        System.out.println("Moreover, it has " + myPc.getSsdMemory() + " GB of SSD memory which makes it faster");
        System.out.println("It's screen is " + myPc.getScreenSize() + " inches");

        if(myPc.isTouchScreen()){
            System.out.println("Lastly it has this advanced touch screen display");
        }

        if (myPc.isOn()) {
            System.out.println("Currently, it turned on");
        } else {
            System.out.println("Right now it is turned off");
        }

    }
}
