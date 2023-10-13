package day12.task4;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> members;

    public MusicBand(String name, int year, List<String> members) {
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

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }

    @Override
    public String toString() {
        return "Group name " + name
                + " year of creation " +
                year;
    }

    public static void transferMembers(MusicBand memberA, MusicBand memberB){

        for (String member : memberA.getMembers())
            memberB.getMembers().add(member);

        memberA.getMembers().clear();

    }

    public void printMembers(){
        System.out.println(members);
    }
}
