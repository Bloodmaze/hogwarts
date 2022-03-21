package ru.skypro;

public class Main {


    public static void printStudent(Object object) {
        System.out.println(object);
    }

    public static void main(String[] args) {
        Griffindor GarryPotter = new Griffindor("GarryPotter", 100, 100, 100, 100, 100);
        Griffindor GermionaGreindjer = new Griffindor("GermionaGreindjer", 43, 12, 55, 22, 55);
        Griffindor RonUizly = new Griffindor("RonUizly", 11, 44, 55, 11, 77);

        Slizerin DarkoMalfoi = new Slizerin("DarkoMalfoi", 29, 12, 54, 12, 43, 11, 12);
        Slizerin GrexemMonteg = new Slizerin("GrexemMonteq", 33, 99, 52, 23, 43, 5, 1);
        Slizerin GreroriGoil = new Slizerin("GreroriGoil", 1, 23, 12, 4, 2, 12, 4);

        Puffendui ZaxariSmitt = new Puffendui("ZaxariSmitt", 23, 13, 31, 15, 23);
        Puffendui SedrigDiggori = new Puffendui("SedriDiggori", 23, 11, 23, 25, 33);
        Puffendui Djastin = new Puffendui("Djastin", 13, 12, 3, 5, 43);

        Kogtevran ChjouChan = new Kogtevran("ChjouChan", 1, 32, 12, 12, 13, 12);
        Kogtevran PadmaPatil = new Kogtevran("PadmaPatil", 3, 3, 31, 32, 32, 21);
        Kogtevran MarkusBelbi = new Kogtevran("MarkusBelbi", 11, 2, 21, 42, 3, 2);
        printStudent(GarryPotter);
        Griffindor.compare(GarryPotter, GermionaGreindjer);
        Puffendui.compare(ZaxariSmitt, Djastin);
        Kogtevran.compare(MarkusBelbi, PadmaPatil);
        Slizerin.compare(GreroriGoil, GrexemMonteg);
        Hogwarts.compare(GarryPotter, PadmaPatil);


    }
}
