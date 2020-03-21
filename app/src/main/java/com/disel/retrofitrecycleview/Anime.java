package com.disel.retrofitrecycleview;

public class Anime {

    private String name ;
    private String description;
    private String Rating;
    private int episode;
    private String categorie;
    private String studio ;
    private String img;

    public Anime() {
    }

    // Constructor
    public Anime(String name, String description, String Rating, int episode, String categorie, String studio, String img) {
        this.name = name;
        this.description = description;
        this.Rating = Rating;
        this.episode = episode;
        this.categorie = categorie;
        this.studio = studio;
        this.img = img;
    }

    // Getter
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getRating() {
        return Rating;
    }

    public int getNb_episode() {
        return episode;
    }

    public String getCategorie() {
        return categorie;
    }

    public String getStudio() {
        return studio;
    }

    public String getImage_url() {
        return img;
    }


    // Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRating(String Rating) {
        this.Rating = Rating;
    }

    public void setNb_episode(int nb_episode) {
        this.episode = nb_episode;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public void setImage_url(String image_url) {
        this.img = image_url;
    }
}
