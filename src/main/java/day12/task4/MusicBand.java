package day12.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> memberName;

    public MusicBand(String name, int year, List<String> memberName) {
        this.name = name;
        this.year = year;
        this.memberName = memberName;
    }

    public List<String> getMemberName() {
        return memberName;
    }

    public void setMemberName(List<String> memberName) {
        this.memberName = memberName;
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
                "memberName=" + memberName +
                '}';
    }

    public static void transferMembers(MusicBand a, MusicBand b) {
        for (String member : a.getMemberName()) {
            b.getMemberName().add(member);
        }
        a.getMemberName().clear();
    }

    public void printMembers() {
        System.out.println(this.memberName);

    }
}
