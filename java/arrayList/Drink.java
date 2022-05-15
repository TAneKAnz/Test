package java.arrayList;
public class Drink {
    private String menu, category;
    private int price;
    
    public Drink() {
    }
    public Drink(String menu, String category, int price) {
        this.menu = menu;
        this.category = category;
        this.price = price;
    }

    public String getMenu() {
        return menu;
    }
    public void setMenu(String menu) {
        this.menu = menu;
    }

    @Override
    public String toString() {
        return "Drink [category=" + category + ", menu=" + menu + ", price=" + price + "]";
    }
}
