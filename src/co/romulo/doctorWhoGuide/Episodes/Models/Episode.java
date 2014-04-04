package co.romulo.doctorWhoGuide.Episodes.Models;

import co.romulo.doctorWhoGuide.persistence.Model;

import java.util.Date;

public class Episode extends Model {
    private String name;
    private final int id;
    private int season;
    private int number;

    private final String synopsys;
    private final Date firstAired;

    public String getName() {
        return name;
    }

    public Episode(int id, int season, int number, String name, String synopsys, Date firstAired) {
        super(id);
        this.id = id;
        this.season = season;
        this.number = number;
        this.synopsys = synopsys;
        this.firstAired = firstAired;
        this.setId(id);
        this.name = name;
    }

    @Override
    public String toString() {
        return getFormatedSeasonAndNumber() + " " + name;
    }

    public String getFormatedSeasonAndNumber() {
        return String.valueOf(this.season)+ "." + String.valueOf(this.number);
    }

    public String getFormatedSeasonAndNumberLongVersion() {
        return "Season "+String.valueOf(this.season)+ ", Episode " + String.valueOf(this.number);
    }

    public int getSeason() {
        return season;
    }

    public int getNumber() {
        return number;
    }

    public String getSynopsys() {
        return synopsys;
    }

    public Date getFirstAired() {
        return firstAired;
    }
}
