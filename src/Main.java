import TodoList.Todo;

public class Main {



    public static void main(String[] args) {
        System.out.println("TODO List");
        Todo list1 = new Todo();
        list1.creerTache("john", "list1", "1-1-2020", "G", true);
        System.out.println(list1);
        list1.annulerTache();
        System.out.println(list1);
        list1.creerTache("john", "list1", "1-1-2020", "G", true);
        list1.replannifierTache("2-10-2020");
        System.out.println(list1);
    }


}
