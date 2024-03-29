package HomeFactory;

public class HomeFactory {

    public static void main(String[] args) {
        Home first = new Home(500, 500);
        first.takeShower();
        first.takeBath();
        first.makeDinner();
        first.watchTv(5);
        first.boilWater();
    }

}
