package Task2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class Cafe {
    ArrayList<String> coffeeMenu = new ArrayList<>();
    public void loadMenuData(){
        try {
            File file = new File("Opg_T6_java/src/Task2/coffees.txt");
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()){
                coffeeMenu.add(scan.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
