public class BuilderPatternExample {
    public static void main(String[] args) {
        HouseBuilder house = new HouseBuilder.Builder()
                .setName("Concrete Roof")
                .setFoundationType("Concrete Foundation")
                .build();
        System.out.println(house);
    }
}