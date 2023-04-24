public class IceCreamDemo {
    public static void main(String[] args) {
        IceCream vanilla = new IceCream("Vanilla", 1, 1);
        IceCream superChocChip = new IceCream("Super Duper Chocolate Chip 9001", 5, 3);

        vanilla.addTopping("Sadness");
        superChocChip.addTopping("Marshmallow");
        superChocChip.addTopping("Wafer");

        vanilla.iceCreamDeets();
        System.out.println();
        superChocChip.iceCreamDeets();
    }
}
