import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Program {
    private static Scanner sc = new Scanner(System.in);
    private static List<Book> list = new ArrayList<>();
    private static int menu(){
        System.out.println("0. Exit");
        System.out.println("1. Add Book");
        System.out.println("2. Delete Book");
        System.out.println("3. Search Book");
        System.out.println("4. Display Books");
        return sc.nextInt();
    }
    public static void main(String[] args) {
        int choice;
        do{
            choice = menu();
            switch(choice){
                case 1:
                {
                    Book book = new Book();
                    book.input();
                    list.add(book);
                    System.out.println(list.size());
                    break;
                }
                case 2:{
                    if(list.isEmpty()){
                        System.out.println("No Books");
                    }else{
                        System.out.println("Enter Book Id : ");
                        int id = sc.nextInt();
                        Iterator itr = list.iterator();
                        while(itr.hasNext()){
                            Book book = (Book)itr.next();
                            if(book.getId() == id){
                                list.remove(book);
                                break;
                            }
                        }
                    }
                    break;
                }
                case 3:{
                    if(list.isEmpty()){
                        System.out.println("No Books");
                    }else{
                        System.out.println("Enter Book Id : ");
                        int id = sc.nextInt();
                        Iterator itr = list.iterator();
                        while(itr.hasNext()){
                            Book book = (Book)itr.next();
                            if(book.getId() == id){
                                System.out.println(book.toString());
                            }
                        }
                    }
                    break;
                }
                case 4:
                {
                    if(list.isEmpty()){
                        System.out.println("No Books");
                    }else{
                        for (Book book : list) {
                            System.out.println(book.toString());
                        }
                    }
                    break;
                }
            }
        }while(choice != 0);
    }
}
