package day12.task5;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> members;

    public MusicBand(String name, int year, List<MusicArtist> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    public void setMembers(List<MusicArtist> members) {
        this.members = members;
    }

    @Override
    public String toString() {
        return "Group name " + name
                + " year of creation " +
                year;
    }

    public static void transferMembers(MusicBand memberA, MusicBand memberB){

        for (MusicArtist member : memberA.getMembers())
            memberB.getMembers().add(member);

        memberA.getMembers().clear();

    }

    public void printMembers(){
        System.out.println(members);
    }
}
