package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.shuffle;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> bands = new ArrayList<>();
        bands.add(new MusicBand("Gorgoroth", 1992));
        bands.add(new MusicBand("Mayhem", 1984));
        bands.add(new MusicBand("Immortal", 1991));
        bands.add(new MusicBand("Emperror", 1991));
        bands.add(new MusicBand("Burzum", 1991));
        bands.add(new MusicBand("Finntroll", 1997));
        bands.add(new MusicBand("Korpiklaani", 1993));
        bands.add(new MusicBand("Alestorm", 2004));
        bands.add(new MusicBand("Mgla", 2001));
        bands.add(new MusicBand("Batushka", 2015));
        Collections.shuffle(bands);
        System.out.println(bands);

        System.out.println(groupsAfter2000(bands));
    }


    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> groupsAfter2000 = new ArrayList<>();

        for (MusicBand band : bands) {
            if (band.getYear() > 2000) {
                groupsAfter2000.add(band);
            }
        }
        return (groupsAfter2000);
    }
}
