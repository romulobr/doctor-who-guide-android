package co.romulo.doctorWhoGuide.persistence;

import java.util.List;

public class InMemoryRepository<T extends Model> implements Repository<T> {

    private final List<T> list;

    public InMemoryRepository(List<T> list) {
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
    public List<T> getAll() {
        return list;
    }
}
