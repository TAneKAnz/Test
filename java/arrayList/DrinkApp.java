package java.arrayList;
import java.util.ArrayList;

public class DrinkApp {
    public static void main(String[] args) {
        demoArrayList(); 
    }

    public static void demoArrayList() {
        ArrayList<Drink> menus = new ArrayList<Drink>();
        menus.add(new Drink("capucino", "coffee", 50));
        menus.add(new Drink("ice-tea", "tea", 40));

        for (Drink drink : menus) {
            System.out.println(drink.toString());
        }
    }
}
