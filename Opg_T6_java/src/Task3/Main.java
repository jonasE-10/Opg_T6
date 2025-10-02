package Task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Room room1 = new Room(2,4);
        Room room2 = new Room(4,6);
        Room room3 = new Room(3,2);
        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);
        Building building1 = new Building(rooms,1);
        Building buildingAnormal = new Building(rooms, 19);
        System.out.println(countLampsInBuilding(building1));
        System.out.println(countWindowsInBuilding(building1));
        System.out.println(countRoomsInBuilding(building1));
        System.out.println(isNormal(building1));
        System.out.println(isNormal(buildingAnormal));

    }
    public static int countLampsInBuilding(Building building){
        int totalLamps = 0;
        for (int i = 0; i < building.getRooms().size(); i++){
               totalLamps += building.getRooms().get(i).getNumberOfLamps();
        }
        return totalLamps;
    }
    public static int countWindowsInBuilding(Building building){
        int totalWindows = 0;
        for (int i = 0; i < building.getRooms().size(); i++){
            totalWindows += building.getRooms().get(i).getNumberofWindows();
        }
        return totalWindows;
    }
    public static int countRoomsInBuilding(Building building){
        return building.getRooms().size();
    }
    public static boolean isNormal(Building building){
        return building.getNumberOfFloors() <= building.getRooms().size();
    }
}
