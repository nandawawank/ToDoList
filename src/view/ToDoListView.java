package view;

import service.ToDoListService;
import utils.InputUtils;

public class ToDoListView {
    private ToDoListService toDoListService;

    public ToDoListView(ToDoListService toDoListService) {
        this.toDoListService = toDoListService;
    }

    public void showToDoList() {
        while (true) {
            toDoListService.showToDoList();

            System.out.println("MENU : ");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("x. Keluar");

            var input = InputUtils.input("Pilih");

            if (input.equals("1")) {
                addToDoList();
            } else if (input.equals("2")) {
                removeToDoList();
            } else if (input.equals("x")) {
                break;
            } else {
                System.out.println("Pilihan tidak dimengerti");
            }
        }
    }

    public void addToDoList() {
        System.out.println("MENAMBAH TODOLIST");

        var todo = InputUtils.input("Todo (x Jika Batal)");

        if (todo.equals("x")) {
            // batal
        } else {
            toDoListService.addToDoList(todo);
        }
    }

    public void removeToDoList() {
        System.out.println("MENGHAPUS TODOLIST");

        var number = InputUtils.input("Nomor yang Dihapus (x Jika Batal)");

        if (number.equals("x")) {
            // batal
        } else {
            toDoListService.removeToDoList(Integer.valueOf(number));
        }
    }
}
