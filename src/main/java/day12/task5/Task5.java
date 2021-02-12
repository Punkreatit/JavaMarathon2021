package day12.task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> artist1 = new ArrayList<MusicArtist>();
        artist1.add(new MusicArtist("Joe", 27));
        artist1.add(new MusicArtist("Jim", 33));
        artist1.add(new MusicArtist("Jess", 22));
        artist1.add(new MusicArtist("jack", 44));

        List<MusicArtist> artist2 = new ArrayList<MusicArtist>();
        artist2.add(new MusicArtist("Hagen", 45));
        artist2.add(new MusicArtist("Lares", 35));
        artist2.add(new MusicArtist("Diego", 38));
        artist2.add(new MusicArtist("Ksardas", 88));

        MusicBand band1 = new MusicBand("4j", 2001, artist1);
        MusicBand band2 = new MusicBand("Gothic", 2005, artist2);

        band1.printMembers();
        band2.printMembers();
        band1.transferMembers(band1, band2);
        System.out.println("Объвление: группе " + band2.getName() + " требуются четыре музыканта, имена которых начинаются на букву <<J>>, гонорар 3000 золотых монет ежемесячно");
        band1.printMembers();
        band2.printMembers();


    }
}
