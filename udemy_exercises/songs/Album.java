package udemy_exercises.songs;

import java.util.ArrayList;

class Album {
    
    private String name;
    private ArrayList<Song> songs;
    
    public Album(String name) {
        this.name = name;
        this.songs = new ArrayList<Song>();
    }
    
    public boolean addPlaylist(int trackNum, LinkedList<Song> playlist) {
        int index = trackNum -1;
        if (index >= 0) && (index <= this.songs.size()) {
            playlist.add(this.songs);
            return true;
        }
        System.out.println("Album does not have track " + trackNum);
        return false;
    }
    
    public boolean addPlayList(String title, LinkedList<Song> playlist) {
        Song checkSong = findSong(title);
        if(checkSong != null) {
            playlist.add(checkSong);
            return true;
        }
        System.out.println("Song title " + title + " not found.");
        return false;
    }
    
    public static void showPlaylist(LinkedList<Song> playlist) {
        Iterator<Song> iterator = playlist.iterator();
        System.out.println("===========================");
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("===========================");
    }

    public static void stop() {

        // not sure how to implement this outside of a simple message

        System.out.println("Current song stopped.")

    }

    public static void nextSong() {

        // check for next song in playlist then play

        if(listIterator.hasNext()) {
            System.out.println("Now playing: " + listIterator.next().toString());
        }
        else {
            System.out.println("No songs exist after this one.")
        }
    }

    }

    public static void previousSong() {

    // check for previous song in playlist then play

    if(listIterator.hasPrevious()) {
        System.out.println("Now playing: " + listIterator.previous().toString());
    }
    else {
        System.out.println("No songs exist before this one.")
    }

    }

    public static void repeatSong() {

    // code to print current song again? Probably not right.

        System.out.println("Now playing: " + listIterator());

    }

    public static void removePlaylist() {
        if(playlist.size() > 0) {
            listIterator.remove();
    }

}

/*
**Song Player w/ Java Classes**
     - **Album class** 
       - Playlist of **Songs**.
       - addPlayist() (songs must appear in the list in the order by which they were added)
       - stop()
       - nextSong()
       - previousSong()
       - repeatSong()
       - showPlaylist()
       - removePlaylist()
     - **A song must exist in an album before it can be added to the playlist (so you can only play songs that you own.)**
*/