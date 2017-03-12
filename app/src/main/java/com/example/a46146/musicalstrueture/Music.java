package com.example.a46146.musicalstrueture;

import java.io.Serializable;

public class Music implements Serializable {
    private String name;
    private String singer;
    private String Album;
    private String Lyric;
    private int pic;

    public Music() {
    }

    public Music(String name, String singer, String album, int pic, String lyric) {
        this.name = name;
        this.singer = singer;
        Album = album;
        this.pic = pic;
        Lyric = lyric;
    }

    public String getName() {
        return name;
    }

    public String getSinger() {
        return singer;
    }

    public String getAlbum() {
        return Album;
    }

    public int getPic() {
        return pic;
    }

    public String getLyric() {
        return Lyric;
    }
}
