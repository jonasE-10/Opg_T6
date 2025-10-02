package Task3;

public class Room {
    private int numberOfLamps;
    private int numberofWindows;

    public Room(int numberOfLamps, int numberofWindows) {
        this.numberOfLamps = numberOfLamps;
        this.numberofWindows = numberofWindows;
    }

    public int getNumberOfLamps() {
        return numberOfLamps;
    }

    public int getNumberofWindows() {
        return numberofWindows;
    }

    public void setNumberOfLamps(int numberOfLamps) {
        this.numberOfLamps = numberOfLamps;
    }

    public void setNumberofWindows(int numberofWindows) {
        this.numberofWindows = numberofWindows;
    }

}
