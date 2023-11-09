package bai02_employee.Interface;

import java.util.ArrayList;
import java.util.List;

public interface ICrud<T, E> {
    void create(T t);
    T read(E id);
    void update(T t);
    void delete(E id);
    int getIndexOf(E id);
    List<T> finfAll();
    int getSize();
}
