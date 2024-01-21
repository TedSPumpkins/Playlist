//this is a test
import java.util.ArrayList;

/**
 * The Playlist class, which will keep track of a playlist of Song objects
 * Refer to the project description to make sure you have access to all available methods
 */
public class Playlist { 
    /**
     * Fields-- This will likely just need to be the ArrayList of Songs. Reference our previous problems
     * (CarDealership, Zoo) for structure on how this will look
     */
private ArrayList<Song> playlist;


     /**
      * Constructor-- this doesn't need any parameters. You should just initialize the ArrayList and
      * then use additional methods to add Songs in one-by-one
      */

public Playlist(){
    playlist = new ArrayList<Song>();
}


      /**
       * Methods-- Remember that you need to be able to complete all of the following:
       * Adding a song
       * 'liking' a song
       * Removing a specific song
       * Examining all Songs (a String return or void print makes sense here)
       * Examining a sublist of all liked songs
       * Determining the total duration of all songs
       * Removing all unliked songs from the playlist (careful with this one!)
       */
    public void addSong(Song s1){
        playlist.add(s1);
    }

    public void likeSong(int p){
     playlist.get(p).like();
        }


    public void removeSong(int num){
     playlist.remove(num);
    }


    public String examineSongs(){
        String songs = "";
        for(Song i :playlist){
            songs += i.toString() + "\n";
        }
        return songs;

    }
    public String likedSongs(){
       String likedSongs = "";
        for(Song s: playlist){
            if(s.getlikedstatus() == true){
               likedSongs += s.toString() + "\n";
            }
        }
    return likedSongs;
    }
    
    public String totalDurration(){
    int totaltime = 0;
    int minutes = 0;
    int seconds = 0;
        for(Song s : playlist){
            totaltime += s.getduration();
    }
    seconds = totaltime % 60;
    minutes = totaltime / 60;
    return minutes + ":" + seconds;
    }

    public void removeUnliked(){
    for(int i = 0; i < playlist.size();i++){
        if(playlist.get(i).getlikedstatus() == false){
            playlist.remove(i);
            i--;
        }
    }
}

public String toString(){
    return playlist.toString();
}
}
