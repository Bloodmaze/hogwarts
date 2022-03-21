package ru.skypro;

public class Puffendui extends Hogwarts {
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Puffendui(String name, int industriousness, int loyalty, int honesty, int enchantment, int transgress) {
        super(name, enchantment, transgress);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public static Puffendui compare(Puffendui st1, Puffendui st2) {
        if (st1.getHonesty() > st2.getHonesty()) {
            System.out.println(st1.getName() + " honesty than " + st2.getName());
            return st1;
        } else
            System.out.println(st2.getName() + " honesty than " + st1.getName());
        return st2;
    }


    @Override
    public String toString() {
        return "" +super.toString()+
                "industriousness=" + industriousness +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                " ";
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }
}
