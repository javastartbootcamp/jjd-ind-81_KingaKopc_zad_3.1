public class Main {
    public static void main(String[] args) {
        Bed bed = new Bed(55, 90, 220);
        Bed bed2 = new Bed(40, 80, 180);
        bed.height = 55;
        bed.width = 90;
        bed.lenght = 220;
        bed2.height = 40;
        bed2.width = 80;
        bed2.lenght = 180;

        System.out.println("Informacje o łóżkach: ");
        System.out.println("Wysokość: " + bed.height + "," + bed2.height);
        System.out.println("Szerokość: " + bed.width +  "," +  bed2.width);
        System.out.println("Długość: " + bed.lenght + "," +  bed2.lenght);
    }
}
