package lab6;

public class Main {
    public static void main(String[] args) {
        Bouquet bouquet = new Bouquet();

        bouquet.add(new Rose(15, 90, 89));
        bouquet.add(new Rose(15, 86, 94));
        bouquet.add(new Rose(15, 95, 80));
        bouquet.add(new Peonis(5, 95, 100));
        bouquet.add(new Carnation(9, 70, 120));

        bouquet.add(new Ribbon(3));
        bouquet.add(new WrappingPaper(5));

        System.out.println("Initial bouquet: ");
        bouquet.show();
        System.out.println("Price: " + bouquet.getPrice() + "\n");

        System.out.println("Initial flowers: ");
        bouquet.showFlowers();
        System.out.println("Sorted flowers: ");
        bouquet.sortByFreshness();
        bouquet.showFlowers();

        int lower = 95;
        int higher = 100;
        System.out.printf("FLower in range from %d to %d:%n", lower, higher);
        System.out.println(bouquet.findFlowerInRange(lower, higher));
    }
}
