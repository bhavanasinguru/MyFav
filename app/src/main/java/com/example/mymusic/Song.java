package com.example.mymusic;

public class Song {
    private String songName,songURL;
    public Song()
    {

    }
    public Song(String songName,String songURL)
    {
        this.songName=songName;
        this.songURL=songURL;
    }
    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getSongURL() {
        return songURL;
    }

    public void setSongURL(String songURL) {
        this.songURL = songURL;
    }


}
