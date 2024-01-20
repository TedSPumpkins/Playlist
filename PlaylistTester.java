/**
 * Sample of a tester file for the Playlist class. This file should demonstrate all the capability of your
 * playlist in the main method. You don't need to follow the testing specifications of this exactly
 * if you want to write your own separate tester instead.
 * Note that there's no need for a Scanner in this project-- all of the playlist can be 'hardcoded' into main.
 * @Theodore Rountree-Shtulman
 * @Hadi Ammar
 * @version 1/21/2024
 */


import java.util.*;
public class PlaylistTester {
    public static void main(String[] args) {
        System.out.println("Initializing a Playlist...\n");
        //Make your playlist here
        Playlist songs = new Playlist();
    
        System.out.println("Adding songs to the Playlist...\n");
        Song A = new Song(200, "a");
        Song B = new Song(300, "b");
        Song C = new Song(400, "c");
        Song D = new Song(500, "d");
        Song E = new Song(600, "e");
        Song F = new Song(700, "f");
        Song G = new Song(800, "g");
        songs.addSong(A);
        songs.addSong(B);
        songs.addSong(C);
        songs.addSong(D);
        songs.addSong(E);
        songs.addSong(F);
        songs.addSong(G);


        System.out.println(songs.examineSongs());

        System.out.println("Printing the songs...\n");
        System.out.println(songs.examineSongs());



        System.out.println("\nLiking the songs in position 0/a, 2/c, and 4/e...\n");
        //Once your songs are 'liked', this should be reflected in the next printout
        songs.likeSong(0);
        songs.likeSong(2);
        songs.likeSong(4);


        System.out.println("Printing the songs...\n");
        System.out.println(songs.examineSongs());

        System.out.println("\nRemoving the song in position 2 ...\n");
        songs.removeSong(2);
        System.out.println("Printing the songs...\n");
        System.out.println(songs.examineSongs());


        
        System.out.println("\nPrinting only the liked songs...\n");
        System.out.println(songs.likedSongs());


        System.out.println("\nPrinting the total duration of all songs...\n");
        System.out.println(songs.totalDurration());

        System.out.println("\nRemoving all unliked songs from the playlist...\n");
        songs.removeUnliked();

        System.out.println("Printing all songs...\n");
        //This should now look like only the liked songs list from before
        System.out.println(songs.examineSongs());
    }
}
