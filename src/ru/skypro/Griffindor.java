package ru.skypro;

public class Griffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Griffindor(String name, int nobility, int honor, int bravery, int enchantment, int transgress) {
        super(name, enchantment, transgress);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;


    }

    public static Griffindor compare(Griffindor st1, Griffindor st2) {
        if (st1.getBravery() > st2.getBravery()) {
            System.out.println(st1.getName() + " brave than " + st2.getName());
            return st1;
        } else
            System.out.println(st2.getName() + " brave than " + st1.getName());
        return st2;
    }

    @Override
    public String toString() {
        return "" +super.toString()+
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                " ";
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }
}


