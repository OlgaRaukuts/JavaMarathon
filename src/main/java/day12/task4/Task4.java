package day12.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {

        List<String> members = new ArrayList<>(Arrays.asList("Till Lindermann","Richard Kruspe", "Paul Landers","Oliver Riedel","Christian Flake Lorenz" ));


        MusicBand musicBand = new MusicBand("Rammstein", 1996, members);
        musicBand.printMembers();

        List<String> members2 = new ArrayList<>(Arrays.asList("Dan Reynolds","Wayne Sermon","Ben McKee","Daniel Platzman"));


        MusicBand musicBand1 = new MusicBand("Imagine Dragons", 2007, members2);


        musicBand1.printMembers();

        MusicBand.transferMembers(musicBand,musicBand1);

        musicBand.printMembers();
        musicBand1.printMembers();

    }
}
