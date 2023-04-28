import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Toy toy1 = new Toy(0, "Медведь", 7);
        Toy toy2 = new Toy(1, "Труба", 6);
        Toy toy3 = new Toy(2, "Санки", 9);
        Toy toy4 = new Toy(3, "Пазл", 8);
        Toy toy5 = new Toy(4,"Барби",5);

        List<Toy> toys = new ArrayList<>();

        toys.add(toy5);
        toys.add(toy4);
        toys.add(toy3);
        toys.add(toy2);
        toys.add(toy1);

        //System.out.println(toys);



        ToysShop toyShop = new ToysShop(toys);
        toyShop.saveToyForLottery();
        toyShop.saveToyForLottery();
        toyShop.saveToyForLottery();
        toyShop.saveToyForLottery();
        toyShop.saveToyForLottery();


    }

}
