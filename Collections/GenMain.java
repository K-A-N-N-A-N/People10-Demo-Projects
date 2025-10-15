public class GenMain {
    public static void main(String[] args) {
        System.out.println("Hello, Collections!");

        GenClass<Integer> intObj = new GenClass<>(88); // Connot use primitive types like int, char
        intObj.showType();

        GenClass<String> strObj = new GenClass<>("Generics Test");
        strObj.showType();
    }
}