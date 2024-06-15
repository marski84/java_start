package CollectionsApi.exc2;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class MusicCollection {
    public static void main(String[] args) {
        List<Song> songs = List.of(
                new Song("Nothing Else Matters", 386, "Metallica", Song.Genre.METAL),
                new Song("No One", 248, "Alicia Keys", Song.Genre.POP),
                new Song("Nothing Else Matters", 386, "Metallica", Song.Genre.METAL),
                new Song("Believer", 216, "Imagine Dragons", Song.Genre.ROCK),
                new Song("Fear of The Dark", 438, "Iron Maiden", Song.Genre.METAL),
                new Song("Enter Sandman", 346, "Metallica", Song.Genre.METAL),
                new Song("The Unforgiven", 348, "Metallica", Song.Genre.METAL),
                new Song("Girl on Fire", 404, "Alicia Keys", Song.Genre.POP)
        );

//        System.out.println(getGenreTime(songs, Song.Genre.METAL));
//        System.out.println(getArtistSongsAmount(songs, "Metallica"));
        songsWithoutGivenGenre(songs, Song.Genre.METAL);


    }

    public static void songsWithoutGivenGenre(List<Song> songs, Song.Genre genre) {
        songs.stream()
                .filter(song -> !song.getGenre().equals(genre))
                .distinct()
                .forEach(song -> System.out.println(song.getTitle() + " - "
                        + song.getArtist() + " - " + song.getLength() +"sec, "
                        + song.getGenre() ));

    }

    public static long getArtistSongsAmount(List<Song> songs, String artistName) {
        if (!songs.stream().anyMatch(song -> song.getArtist().equals(artistName)))
        {
            throw new NoSuchElementException("No such artist: " + artistName);
        }
        return songs.stream()
                .filter(song -> song.getArtist().equals(artistName))
                .count();
    }


    public static double getGenreTime(List<Song> songsList, Song.Genre genre) {
        return songsList.stream()
                .filter(song -> song.getGenre() == genre)
                .mapToInt(Song::getLength)
                .reduce(0, (a, b) -> a + b);
    }
}