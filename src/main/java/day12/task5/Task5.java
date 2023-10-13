package day12.task5;

import day12.task4.MusicBand;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {

        List<String> members = new ArrayList<>(Arrays.asList("Till Lindermann","Richard Kruspe", "Paul Landers","Oliver Riedel","Christian Flake Lorenz" ));


        MusicBand musicBand = new MusicBand("Rammstein", 1996, members);
        musicBand.printMembers();

        List<String> members2 = new ArrayList<>(Arrays.asList("Dan Reynolds","Wayne Sermon","Ben McKee","Daniel Platzman", "Harry Potter"));


        MusicBand musicBand1 = new MusicBand("Imagine Dragons", 2007, members2);


        musicBand1.printMembers();

        MusicBand.transferMembers(musicBand,musicBand1);

        musicBand.printMembers();
        musicBand1.printMembers();

    }
}
