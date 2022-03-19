package ru.skypro;

public class Griffindor extends ru.skypro.Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;
   private String name;

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public Griffindor(String name, int nobility, int honor, int bravery, int enchantment, int transgress) {
        super(enchantment, transgress);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
        this.name = name;


    }

    public static Griffindor compare(Griffindor st1, Griffindor st2) {
        if (st1.getBravery() > st2.getBravery()) {
            System.out.println(st1.getName()+" brave than "+st2.getName());
            return st1;}
        else
            System.out.println(st2.getName()+" brave than "+st1.getName());
            return st2;
        }

    @Override
    public String toString() {
        return "" +
                "" + name + '\''+
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                "} " + super.toString();
    }
}

  /*  @Override
    public String toString() {
        return "" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                "," + super.toString();*/

