package test.service;

import entity.ToDoList;
import repository.ToDoListRepository;
import repository.ToDoListRepositoryImpl;
import service.ToDoListService;
import service.ToDoListServiceImpl;

public class ToDoListServiceTest {
    public static void main(String[] args) {
        testRemoveToDoList();
    }

    public static void testToDoList() {
        ToDoListRepository toDoListRepository = new ToDoListRepositoryImpl();
        ToDoListService toDoListService = new ToDoListServiceImpl(toDoListRepository);

        toDoListService.showToDoList();
    }

    public static void testAddToDoList() {
        ToDoListRepository toDoListRepository = new ToDoListRepositoryImpl();
        ToDoListService toDoListService = new ToDoListServiceImpl(toDoListRepository);

        toDoListService.addToDoList("Belajar Java Dasar");
        toDoListService.addToDoList("Belajar Java OOP");
        toDoListService.addToDoList("Belajar Java Standard Classes");

        toDoListService.showToDoList();
    }

    public static void testRemoveToDoList() {
        ToDoListRepository toDoListRepository = new ToDoListRepositoryImpl();
        ToDoListService toDoListService = new ToDoListServiceImpl(toDoListRepository);

        toDoListService.addToDoList("Belajar Java Dasar");
        toDoListService.addToDoList("Belajar Java OOP");
        toDoListService.addToDoList("Belajar Java Standard Classes");

        toDoListService.showToDoList();

        toDoListService.removeToDoList(2);
        toDoListService.showToDoList();

        toDoListService.removeToDoList(2);
        toDoListService.showToDoList();
    }
}
