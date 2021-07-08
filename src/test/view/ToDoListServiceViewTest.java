
package test.view;

import repository.ToDoListRepository;
import repository.ToDoListRepositoryImpl;
import service.ToDoListService;
import service.ToDoListServiceImpl;
import view.ToDoListView;

public class ToDoListServiceViewTest {

    public static void main(String[] args) {
        testShowTodoList();
    }

    public static void testShowTodoList(){
        ToDoListRepository todoListRepository = new ToDoListRepositoryImpl();
        ToDoListService todoListService = new ToDoListServiceImpl(todoListRepository);
        ToDoListView todoListView = new ToDoListView(todoListService);

        todoListService.addToDoList("Belajar Java Dasar");
        todoListService.addToDoList("Belajar Java OOP");
        todoListService.addToDoList("Belajar Java Standard Classes");

        todoListView.showToDoList();
    }

    public static void testAddTodoList(){
        ToDoListRepository todoListRepository = new ToDoListRepositoryImpl();
        ToDoListService todoListService = new ToDoListServiceImpl(todoListRepository);
        ToDoListView todoListView = new ToDoListView(todoListService);

        todoListView.addToDoList();

        todoListService.showToDoList();

        todoListView.addToDoList();

        todoListService.showToDoList();
    }

    public static void testRemoveTodoList(){
        ToDoListRepository todoListRepository = new ToDoListRepositoryImpl();
        ToDoListService todoListService = new ToDoListServiceImpl(todoListRepository);
        ToDoListView todoListView = new ToDoListView(todoListService);

        todoListService.addToDoList("Belajar Java Dasar");
        todoListService.addToDoList("Belajar Java OOP");
        todoListService.addToDoList("Belajar Java Standard Classes");

        todoListService.showToDoList();

        todoListView.removeToDoList();

        todoListService.showToDoList();
    }
}