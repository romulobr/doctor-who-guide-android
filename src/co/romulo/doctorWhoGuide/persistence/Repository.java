package co.romulo.doctorWhoGuide.persistence;

import java.util.List;

public interface Repository<T extends Model> {
    T get(Integer id);
    List<T> getAll();
}
