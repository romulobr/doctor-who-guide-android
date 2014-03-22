package co.romulo.doctorWhoGuide.domain;

import co.romulo.doctorWhoGuide.persistence.Model;

import java.util.Date;

public class Episode extends Model {
    private String name;
    private String description;
    private Date date;
    private Integer season;
    private Date firstAired;
    private String imageUrl;
    private String trailerUrl;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public Date getDate() {
        return date;
    }

    public Integer getSeason() {
        return season;
    }

    public void setSeason(Integer season) {
        this.season = season;
    }

    public Date getFirstAired() {
        return firstAired;
    }

    public void setFirstAired(Date firstAired) {
        this.firstAired = firstAired;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTrailerUrl() {
        return trailerUrl;
    }

    public void setTrailerUrl(String trailerUrl) {
        this.trailerUrl = trailerUrl;
    }

    public Episode(int id, String name, String description, Date date) {
        this.setId(id);
        this.name = name;
        this.description = description;
        this.date = date;
    }

    @Override
    public String toString() {
        return name;
    }
}
