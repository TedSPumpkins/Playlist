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
private ArrayList<Song> playlist; //creating aan array list that uses song objects as its items


     /**
      * Constructor-- this doesn't need any parameters. You should just initialize the ArrayList and
      * then use additional methods to add Songs in one-by-one
      */

public Playlist(){
    playlist = new ArrayList<Song>(); //initializing the array list
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
        playlist.add(s1); //see commnents on the song.java method
    }

    public void likeSong(int p){//see commnents on the song.java method
     playlist.get(p).like(); //this gets the song at position p and calls the like method
     
        }


    public void removeSong(int num){
     playlist.remove(num);//see commnents on the song.java method
    }


    public String examineSongs(){
        String songs = ""; //creates a temporary songs string
        for(Song i :playlist){//iterates over each element in the playlist, where each element is a Song. 
            songs += i.toString() + "\n"; // adds each song same(from the Array list) to a string
        }
        return songs;

    }
    public String likedSongs(){
       String likedSongs = "";
        for(Song s: playlist){ //iterates over each element in the playlist, where each element is a Song. 
            if(s.getlikedstatus() == true){
               likedSongs += s.toString() + "\n"; // adds each song same(from the Array list) to a string
            }
        }
    return likedSongs;
    }
    
    public String totalDurration(){
    int totaltime = 0;
    int minutes = 0;
    int seconds = 0;
        for(Song s : playlist){
            totaltime += s.getduration(); // see method in song
    }
    seconds = totaltime % 60; //takes the remainder
    minutes = totaltime / 60; //filters seconds into minutes
    return minutes + ":" + seconds;
    }

    public void removeUnliked(){
    for(int i = 0; i < playlist.size();i++){
        if(playlist.get(i).getlikedstatus() == false){
            playlist.remove(i); //removes song if unliked
            i--;//keeps loop in order
        }
    }
}

public String toString(){
    return playlist.toString();
}
}
