public class ClassNdObjects {
    public static void main(String[] args){
        Pokemon p1 = new Pokemon("Pikachu", 5, 55);
        Pokemon p2 = new Pokemon("Dragonite", 10, 250);

        p1.Attcak();
        p2.Attcak();

        System.out.println(p1.level);
        System.out.println(p2.level);

    }
}