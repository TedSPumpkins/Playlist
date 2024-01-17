/**
 * File for a Song class to be used in the Playlist Project
 * @author Teddy nd  Hadi
 * @version
 */
public class Song {
    //Fields-- what information do we want each Song to store?
private int duration;
private String name;
private boolean liked;



    /**
     * Constructor-- what information needs to be given to make a Song?
     * How will you handle 'liked' songs? It makes sense for a Song not be 'liked' by default
     */
    public Song(Myduration, Myname){
        duration = Myduration;
        name = Myname;
        liked= true;
    }

     /**
      * Methods-- what will you want each Song to do?

      
      * Consider all the getter methods (getName, getArtist, etc.)
      * You should probably have a toString method to be able to get the information for the full
      * song easily as well!
      * What kind of mutator (setter) methods will you need?
      */

public String getliked(){
if (liked == true){
    return "liked";
}
else{
    return "unliked";
}
}


      public int getduration(){
return duration;
}

public String getname(){
    return name;
    }

public void like(){
    liked = true;
}

public void unlike(){
    liked = false;
}

pubic String toString(){
    return System.out.println("the duration is: " + getduration() + "the liked status is: " + getliked);
}
}