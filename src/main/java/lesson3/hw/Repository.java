package lesson3.hw;

public interface Repository<T, Tid> {
    void create(T item);

    void delete(T item);

    T getById(Tid id);
}
