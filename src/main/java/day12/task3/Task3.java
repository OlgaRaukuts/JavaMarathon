package day12.task3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task3 {

    public static void main(String[] args) {

        MusicBand band1 = new MusicBand("Evanescence", 2001);
        MusicBand band2 = new MusicBand("Fall Out Boy", 2002);
        MusicBand band3 = new MusicBand("Rasmus", 1998);
        MusicBand band4 = new MusicBand("Rammstein", 1996);
        MusicBand band5 = new MusicBand("Imagine Dragons", 2007);
        MusicBand band6 = new MusicBand("Arctic Monkeys", 2009);
        MusicBand band7 = new MusicBand("U2", 1987);
        MusicBand band8 = new MusicBand("Queen", 1978);
        MusicBand band9 = new MusicBand("Ace Of Base", 1995);
        MusicBand band10 = new MusicBand("Simple Plan", 2003);

        List<MusicBand> musicBands = new ArrayList<>(Arrays.asList(band1,band2,band3,band4,band5,band6,band7,band8,band9,band10));


        System.out.println(musicBands.toString());

        Collections.shuffle(musicBands);
        System.out.println(musicBands.toString());


        System.out.println(groupsAfter2000(groupsAfter2000(musicBands)));
    }

   public static List<MusicBand> groupsAfter2000(List<MusicBand> musicBands){
       List<MusicBand> groupsAfter2000 = new ArrayList<>();
        for(MusicBand band: musicBands ) {
            if(band.getYear() > 2000){
                groupsAfter2000.add(band);}
        }

        return groupsAfter2000;
    }


}
