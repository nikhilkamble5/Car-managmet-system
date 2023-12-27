import java.util.Scanner;

// /**
//  * InnerMain
//  */
// public interface utility {
//     public void get_details();
//     public void set_details();

    
// }
public class Main {
    
    static void main_menu(){
        System.out.println();
        System.out.println("=========================   *** Welcome To Showroom Management System ***   =========================");
        System.out.println();
        System.out.println("=========================   *** Enter Your Choice ***   =========================");
        System.out.println();
                System.out.println();
System.out.println("1].ADD SHOWROOMS \t\t\t 2].ADD EMPLOYEE \t\t\t 3].ADD CARS");
        System.out.println();
        System.out.println("4].GET SHOWROOMS \t\t\t 5].GET EMPLOYEE \t\t\t 6].GET CARS");
        System.out.println();
        System.out.println("=========================   *** Enter 0 TO EXIT ***   =========================");


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Showroom showroom[]=new Showroom[5];
        Employee employee[]=new Employee[5];
        Cars cars[]= new Cars[5];

        int car_counter=0;
        int showroom_counter=0;
        int employee_counter=0;
        int choice=100;

        while (choice!=0) {
            main_menu();
            choice =sc.nextInt();
            
            while (choice!=9 && choice!=0) {
                switch (choice) {
                    case 1:
                        showroom[showroom_counter]=new Showroom();
                        showroom[showroom_counter].set_details();
                        showroom_counter++;
                        System.out.println("1].ADD NEW SHOWROOM");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice=sc.nextInt();
                        break;

                        case 2:
                        employee[employee_counter]=new Employee();
                        employee[employee_counter].set_details();
                        employee_counter++;
                        System.out.println("2].ADD NEW Employee");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice=sc.nextInt();
                        break;
                     case 3:
                        cars[car_counter]=new Cars();
                        cars[car_counter].set_details();
                        car_counter++;
                        System.out.println("3].ADD NEW Car");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice=sc.nextInt();
                        break;

                        case 4:
                        for(int i=0;i<showroom_counter;i++){
                            showroom[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0]. Exit");
                        choice=sc.nextInt();
                        break;

                         case 5:
                        for(int i=0;i<employee_counter;i++){
                            employee[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0]. Exit");
                        choice=sc.nextInt();
                        break;

                           case 6:
                        for(int i=0;i<car_counter;i++){
                            cars[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0]. Exit");
                        choice=sc.nextInt();
                        break;
                        
                
                    default:
                    System.out.println("Enter valid choice");
                        break;
                }
            }
        }
    }
}
