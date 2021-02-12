package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> member;

    public MusicBand(String name, int year, List<MusicArtist> member) {
        this.name = name;
        this.year = year;
        this.member = member;
    }

    public List<MusicArtist> getMember() {
        return member;
    }

    public void setMember(List<MusicArtist> member) {
        this.member = member;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", member=" + member +
                '}';
    }

    public static void transferMembers(MusicBand a, MusicBand b) {
        for (MusicArtist member : a.getMember()) {
            b.getMember().add(member);
        }
        a.getMember().clear();
    }

    public void printMembers() {
        System.out.println(this.member);

    }
}
