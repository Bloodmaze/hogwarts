
package ru.skypro;
public class Kogtevran extends ru.skypro.Hogwarts {
    private int brainy;
    private int wise;
    private int creative;
    private int witty;
    private String name;

    public Kogtevran(String name,int brainy, int wise, int witty, int creative, int transgress, int enchantment) {
        super(enchantment, transgress);
        this.name=name;
        this.brainy = brainy;
        this.wise = wise;
        this.witty = witty;
        this.creative = creative;
    }
    public static Kogtevran compare(Kogtevran st1, Kogtevran st2) {
        if (st1.getBrainy() > st2.getBrainy()) {
            System.out.println(st1.getName()+" brainy than "+st2.getName());
            return st1;}
        else
            System.out.println(st2.getName()+" brainy than "+st1.getName());
        return st2;
    }

    public int getBrainy() {
        return brainy;
    }

    public void setBrainy(int brainy) {
        this.brainy = brainy;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getCreative() {
        return creative;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "" +
                "name="+ name+
                "brainy=" + brainy +
                ", wise=" + wise +
                ", creative=" + creative +
                ", witty=" + witty +
                "";
    }
}
