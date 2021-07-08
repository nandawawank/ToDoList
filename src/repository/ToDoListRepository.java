package repository;

import entity.ToDoList;

public interface ToDoListRepository {
    ToDoList[] getAll();

    void add(ToDoList todolist);

    boolean remove(Integer number);
}
