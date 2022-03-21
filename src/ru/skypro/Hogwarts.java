package ru.skypro;

public class Hogwarts {
    private int enchantment;
    private int transgress;
    private String name;


    public Hogwarts(String name, int enchantment, int transgress) {
        this.name = name;
        this.enchantment = enchantment;
        this.transgress = transgress;

    }

    public static Hogwarts compare(Hogwarts st1, Hogwarts st2) {
        if (st1.getEnchantment() > st2.getEnchantment()) {
            System.out.println(st1 + " enchantment than " + st2);
            return st1;
        } else
            System.out.println(st2 + " enchantment than " + st1);
        return st2;
    }

    @Override
    public String toString() {
        return "" +
                "name " + name +
                " enchantment=" + enchantment +
                ", transgress=" + transgress +
                ", ";
    }

    public int getEnchantment() {
        return enchantment;
    }

    public int getTransgress() {
        return transgress;
    }

    public String getName() {
        return name;
    }


}

