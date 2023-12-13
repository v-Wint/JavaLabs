package lab6;

import java.util.ArrayList;

public class Bouquet {
    public ArrayList<Flower> flowers;
    public ArrayList<Accessory> accessories;

    public Bouquet() {
        this.flowers = new ArrayList<Flower>();
        this.accessories = new ArrayList<>();
    }

    public Bouquet(ArrayList<Flower> flowers, ArrayList<Accessory> accessories) {
        this.flowers = flowers;
        this.accessories = accessories;
    }

    public void add(Item item) {
        if (item instanceof Flower) {
            flowers.add((Flower)item);
        } else {
            accessories.add((Accessory)item);
        }
    }

    public int getPrice() {
        return flowers.stream().mapToInt(Item::getPrice).sum() + accessories.stream().mapToInt(Item::getPrice).sum();
    }

    public void sortByFreshness() {
        flowers.sort((o1, o2) -> Integer.compare(o1.getFreshness(), o2.getFreshness()));
    }

    public void showFlowers() {
        flowers.forEach(System.out::println);
        System.out.println("");
    }

    public void showAccessories() {
        accessories.forEach(System.out::println);
        System.out.println("");
    }

    public void show() {
        showFlowers();
        showAccessories();
    }

    public Flower findFlowerInRange(int lower, int higher) {
        if (lower > higher)
            return null;
        return flowers.stream().filter(x -> (x.getLength() >= lower && x.getLength() <= higher)).
                findFirst().orElse(null);
    }

}
