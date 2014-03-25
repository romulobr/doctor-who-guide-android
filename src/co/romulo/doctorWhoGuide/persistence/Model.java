package co.romulo.doctorWhoGuide.persistence;

public class Model {

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
