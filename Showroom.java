import java.util.Scanner;

public class Showroom implements utility {


    String showroom_name;
    String Showroom_addres;
    int total_employee;
    int total_cars_in_stock=0;
    String manager_name;

    @Override
    public void get_details(){
        System.out.println("showroom name "+showroom_name);
        System.out.println("showroom Address "+ Showroom_addres);
        System.out.println("Manager Name"+manager_name);
        System.out.println("Total employee "+total_employee );
        System.out.println("Total cars in Stock "+total_cars_in_stock);
     } 


     public void set_details(){
        Scanner sc= new Scanner(System.in);
        System.out.println("=========================   *** Enter Showroo Details ***   =========================");
        System.out.println();
        System.out.println("Showroom Name: ");
        showroom_name=sc.nextLine();

        System.out.println("Showroom Address: ");
        Showroom_addres =sc.nextLine();

        System.out.println("Manager Name: ");
        manager_name=sc.nextLine();

        System.out.println("Total number of employee");
        total_employee=sc.nextInt();

        System.out.println("Total cars in Stock: ");
        total_cars_in_stock=sc.nextInt();
        
    }
}