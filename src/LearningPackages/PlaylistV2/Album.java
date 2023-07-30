package LearningPackages.PlaylistV2;


import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;

    private SongList songs;

    public static class SongList{
        private ArrayList<Song> songs;

        private SongList(ArrayList<Song> songs) {
            this.songs = songs;
        }

        private SongList() {
            songs = new ArrayList<>();
        }

        private boolean add(Song song){
            if(findSong(song.getTitle()) == null){
                songs.add(song);
                return true;
            }
            return false;

        }

        private Song findSong(String title){
            for(Song s : songs){
                if(s.getTitle().equals(title)){
                    return s;
                }
            }
            return null;
        }

        private Song findSong(int trackNumber){
            if(trackNumber < songs.size()){
                  return songs.get(trackNumber);
            }

            return null;
        }


    }


    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songs = new SongList(new ArrayList<>());

    }


    public boolean addSong(String title, double duration){

        if(songs.findSong(title) == null){
            songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    public boolean addToPlayList(int number, LinkedList<Song> playlist){
        number--;
        if(number < 0 || songs.findSong(number) == null){
            return false;
        }
        playlist.add(songs.songs.get(number));
        return true;
    }
    public boolean addToPlayList(String title, LinkedList<Song> playlist) {
        Song s = songs.findSong(title);
        if (s == null) {

            return false;
        }
        playlist.add(s);
        return true;
    }


}
