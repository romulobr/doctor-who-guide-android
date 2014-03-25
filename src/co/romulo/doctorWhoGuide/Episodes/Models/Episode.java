package co.romulo.doctorWhoGuide.Episodes.Models;

import co.romulo.doctorWhoGuide.persistence.Model;

import java.util.Date;

public class Episode extends Model {
    private String name;
    private int season;
    private int number;

    public String getName() {
        return name;
    }

    public Episode(int id, int season, int number, String name, String sinopsys, Date firstAired) {
        super(id);
        this.season = season;
        this.number = number;
        this.setId(id);
        this.name = name;
    }

    @Override
    public String toString() {
        return getFormatedSeasonAndNumber() + " " + name;
    }

    public String getFormatedSeasonAndNumber() {
        return String.valueOf(this.season)+ "/" + String.valueOf(this.number);
    }
}
