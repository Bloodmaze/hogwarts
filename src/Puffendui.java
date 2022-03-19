
package ru.skypro;

public class Puffendui extends ru.skypro.Hogwarts {
    private int industriousness;
    private int loyalty;
    private int honesty;
    private String name;

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Puffendui(String name, int industriousness, int loyalty, int honesty, int enchantment, int transgress) {
        super(enchantment, transgress);
        this.name=name;
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;


    }
    public static Puffendui compare(Puffendui st1, Puffendui st2) {
        if (st1.getHonesty() > st2.getHonesty()) {
            System.out.println(st1.getName()+" honesty than "+st2.getName());
            return st1;}
        else
            System.out.println(st2.getName()+" honesty than "+st1.getName());
        return st2;
    }


    @Override
    public String toString() {
        return "" +
                "" + name +" "+
                "industriousness=" + industriousness +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                " " + super.toString();
    }
}
