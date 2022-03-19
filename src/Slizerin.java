package ru.skypro;

public class Slizerin extends ru.skypro.Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int imperiousness;
    private String name;

    public Slizerin(String name,int cunning, int determination, int ambition, int resourcefulness, int imperiousness, int enchantment, int transgress) {
        super(enchantment, transgress);
        this.name=name;
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.imperiousness = imperiousness;
    }

    public static Slizerin compare(Slizerin st1, Slizerin st2) {
        if (st1.getAmbition()> st2.getAmbition()) {
            System.out.println(st1.getName()+" ambition than "+st2.getName());
            return st1;}
        else
            System.out.println(st2.getName()+" abition than "+st1.getName());
        return st2;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getImperiousness() {
        return imperiousness;
    }

    public void setImperiousness(int imperiousness) {
        this.imperiousness = imperiousness;
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
                ""+name+
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", imperiousness=" + imperiousness +
                "";
    }
}
