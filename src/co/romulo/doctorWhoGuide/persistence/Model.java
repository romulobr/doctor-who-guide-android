package co.romulo.doctorWhoGuide.persistence;

import java.io.Serializable;

public class Model implements Serializable {

    private Integer id = null;

    public Model(int id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
