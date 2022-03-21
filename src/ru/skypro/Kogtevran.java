package ru.skypro;

public class Kogtevran extends Hogwarts {
    private int brainy;
    private int wise;
    private int creative;
    private int witty;

    public Kogtevran(String name, int brainy, int wise, int witty, int creative, int transgress, int enchantment) {
        super(name, enchantment, transgress);
        this.brainy = brainy;
        this.wise = wise;
        this.witty = witty;
        this.creative = creative;
    }

    public static Kogtevran compare(Kogtevran st1, Kogtevran st2) {
        if (st1.getBrainy() > st2.getBrainy()) {
            System.out.println(st1.getName() + " brainy than " + st2.getName());
            return st1;
        } else
            System.out.println(st2.getName() + " brainy than " + st1.getName());
        return st2;
    }

    public int getBrainy() {
        return brainy;
    }

    public int getWise() {
        return wise;
    }

    public int getCreative() {
        return creative;
    }

    public int getWitty() {
        return witty;
    }

    @Override
    public String toString() {
        return "" +super.toString()+
                "brainy=" + brainy +
                ", wise=" + wise +
                ", creative=" + creative +
                ", witty=" + witty +
                "";
    }
}
