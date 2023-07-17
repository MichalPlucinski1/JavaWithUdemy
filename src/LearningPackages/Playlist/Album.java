package LearningPackages.Playlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    private Song findSong(String title){
        for (Song s: songs) {
            if(s.getTitle().equals(title)){
                return s;
            }
        }

        return null;

    }

    public boolean addSong(String title, double duration){
        if(findSong(title) == null){
            songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    public boolean addToPlayList(int number, LinkedList<Song> playlist){
        number--;
        if(number < 0 || number > songs.size()){
            return false;
        }
        playlist.add(songs.get(number));
        return true;
    }
    public boolean addToPlayList(String title, LinkedList<Song> playlist) {
        Song s = findSong(title);
        if (s == null) {

            return false;
        }
        playlist.add(s);
        return true;
    }
}
