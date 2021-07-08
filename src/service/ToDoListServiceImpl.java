package service;

import entity.ToDoList;
import repository.ToDoListRepository;
import repository.ToDoListRepositoryImpl;

public class ToDoListServiceImpl implements ToDoListService{
    private ToDoListRepository todoListRepository;

    public ToDoListServiceImpl(ToDoListRepository todoListRepository) {
        this.todoListRepository = todoListRepository;
    }

    @Override
    public void showToDoList() {
        ToDoList[] model = todoListRepository.getAll();

        System.out.println("TODOLIST");
        for (var i = 0; i < model.length; i++) {
            var toDoList = model[i];
            var no = i + 1;

            if (toDoList != null) {
                System.out.println(no + " " + toDoList.getTodo());
            }
        }
    }

    @Override
    public void addToDoList(String todo) {
        ToDoList toDoList = new ToDoList(todo);
        todoListRepository.add(toDoList);
    }

    @Override
    public void removeToDoList(Integer number) {
        boolean success = todoListRepository.remove(number);

        if (success) {
            System.out.println("Success menghapus todo : " + number);
        } else {
            System.out.println("Failed menghapus todo : " + number);
        }
    }
}
