package ru.skypro;

public class Slizerin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int imperiousness;

    public Slizerin(String name, int cunning, int determination, int ambition, int resourcefulness, int imperiousness, int enchantment, int transgress) {
        super(name, enchantment, transgress);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.imperiousness = imperiousness;
    }

    public static Slizerin compare(Slizerin st1, Slizerin st2) {
        if (st1.getAmbition() > st2.getAmbition()) {
            System.out.println(st1.getName() + " ambition than " + st2.getName());
            return st1;
        } else
            System.out.println(st2.getName() + " abition than " + st1.getName());
        return st2;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getImperiousness() {
        return imperiousness;
    }

    @Override
    public String toString() {
        return "" +super.toString() +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", imperiousness=" + imperiousness +
                "";
    }
}
