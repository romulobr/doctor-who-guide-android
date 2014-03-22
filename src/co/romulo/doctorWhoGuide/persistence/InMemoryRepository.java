package co.romulo.doctorWhoGuide.persistence;

import co.romulo.doctorWhoGuide.domain.Episode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class InMemoryRepository<T extends Model> implements Repository<T> {

    private final Collection<T> list;

    public InMemoryRepository(Collection<T> list) {
        this.list = list;
    }

    @Override
    public T get(Integer id) {
        for (T t : list) {
            if (t.getId().equals(id)) {
                return t;
            }
        }
        return null;
    }

    @Override
    public Collection<T> getAll() {
        return list;
    }
}
