
import flovers.Flowers;
import flovers.Rose;
import flovers.Tulip;

public class Main {
    public static void main(String[] args) {
        Rose rose = new Rose("Karusel", new String[]{"Maggie", "Harlekin"}, "Pink", "rounded");
        Rose rose1 = new Rose("Diadem", new String[]{"Gelaksi", "Nikol'", "Frizia"},
                "Yellow", "rounded");
        System.out.println(rose1 + "\n" + rose);
        Tulip tulip = new Tulip("GeneralDeVet", new String[]{"Diana", "Cardinal"},
                "Orange", "Galandia");
        Tulip tulip1 = new Tulip("Darvinovy", new String[]{"Parade", "Golden", "Apeldoorn"},
                "Red", "Niderlandia");
        System.out.println(tulip + "\n" + tulip1);
    }
}