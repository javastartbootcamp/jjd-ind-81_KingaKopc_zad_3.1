public class Main {
    public static void main(String[] args) {
        Bed bed = new Bed(55, 90, 220);
        bed.height = 55;
        bed.width = 90;
        bed.lenght = 220;

        System.out.println("Informacje o łóżku: ");
        System.out.println("Wysokość: " + bed.height);
        System.out.println("Długość: " + bed.lenght);
        System.out.println("Szerokość: " + bed.width);
    }
}
