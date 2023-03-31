package flovers;

public class Tulip extends Flowers {
    private String aCountry;

    public Tulip() {
    }

    public Tulip(String name, String[] kinds, String color, String aCountry) {
        super(name, kinds, color);
        this.aCountry = aCountry;
    }

    public String getaCountry() {
        return aCountry;
    }

    public void setaCountry(String aCountry) {
        this.aCountry = aCountry;
    }

    @Override
    public String toString() {
        return "Tulip: " + "\n" +
                "aCountry: " + aCountry + "\n" + super.toString();
    }
}
