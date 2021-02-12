package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        members1.add("Vova");
        members1.add("Vasya");
        members1.add("Petya");
        MusicBand band1 = new MusicBand("Pesnyary", 1968, members1);

        List<String> members2 = new ArrayList<>();
        members2.add("Jack");
        members2.add("Nick");
        members2.add("Bob");

        MusicBand band2 = new MusicBand("Bastards", 1994, members2);


        band1.transferMembers(band1, band2);
        band1.printMembers();
        band2.printMembers();

    }
}
