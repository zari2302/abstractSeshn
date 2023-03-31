package flovers;

public class Rose extends Flowers{
    private String forms;

    public Rose() {
    }

    public Rose(String name, String[] kinds, String color, String forms) {
        super(name, kinds, color);
        this.forms = forms;
    }

    public String getForms() {
        return forms;
    }

    public void setForms(String forms) {
        this.forms = forms;
    }

    @Override
    public String toString() {
        return "Rose: " +
                "forms: " + forms + "\n" + super.toString();
    }
}
