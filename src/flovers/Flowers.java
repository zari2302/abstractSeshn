package flovers;

import java.util.Arrays;

public abstract class Flowers {
    private String name;
    private String[] kinds;
    private String color;

    public Flowers() {
    }

    public Flowers(String name, String[] kinds, String color) {
        this.name = name;
        this.kinds = kinds;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getKinds() {
        return kinds;
    }

    public void setKinds(String[] kinds) {
        this.kinds = kinds;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Flowers: " +
                "name: " + name + "\n" +
                "kinds: " + Arrays.toString(kinds) +
                "color: " + color + "\n" ;
    }
}
