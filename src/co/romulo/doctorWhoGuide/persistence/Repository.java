package co.romulo.doctorWhoGuide.persistence;

import java.util.Collection;

public interface Repository<T extends Model> {
    T get(Integer id);
    Collection<T> getAll();
}
