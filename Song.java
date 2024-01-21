/**
 * File for a Song class to be used in the Playlist Project
 * @author Teddy nd  Hadi
 * @version
 */
public class Song {
    //Fields-- what information do we want each Song to store?
private int duration; //intitializing duration name and liked variable
private String name;
private boolean liked; 



    /**
     * Constructor-- what information needs to be given to make a Song?
     * How will you handle 'liked' songs? It makes sense for a Song not be 'liked' by default
     */
public Song(int Myduration, String Myname){ //contructing song object
        duration = Myduration;
        name = Myname;
        liked= false; //songs are initially unliked
    }

     /**
      * Methods-- what will you want each Song to do?

      
      * Consider all the getter methods (getName, getArtist, etc.)
      * You should probably have a toString method to be able to get the information for the full
      * song easily as well!
      * What kind of mutator (setter) methods will you need?
      */


//This Method returns a string telling if the song is liked or unliked
public String printlikedstatus(){
String likedstatus = "";  //creates empty string
if (liked == true){
    likedstatus = "liked"; //sets string value to liked on condition that the boolean value is true. 
}
else{
    likedstatus = "unliked";
}

return likedstatus;
}

//Get likedstatus
public boolean getlikedstatus(){
    return liked;
}

//This Method returns the durration of a song
public String getdurationasString(){ 
int minutes = duration/60; //duration is in seconds, to the /60 tranfers this into the # of minutes
int seconds = duration%60; //remiander
return "(" + minutes + ":" + seconds + ")";
}

public int getduration(){
    return duration;
}

//This method gets the name of a song
public String getname(){
    return name;
    }

//This method makes a song liked
public void like(){
    liked = true;
}

//This method makes a song unliked
public void unlike(){
    liked = false;
}

public String toString(){
    return "\"" + name + "\"" + getdurationasString() + "---" + printlikedstatus();
}
}