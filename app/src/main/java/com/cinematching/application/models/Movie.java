package com.cinematching.application.models;

import android.net.Uri;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Jean-Christophe Melikian on 07/09/2017.
 */

public class Movie {

    private String id;

    private String name;

    private Uri imageUrl;

    private ArrayList<String> releaseDate;

    private String synopsis;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Uri getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(Uri imageUrl) {
        this.imageUrl = imageUrl;
    }

    public ArrayList<String> getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(ArrayList<String> releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }
}
