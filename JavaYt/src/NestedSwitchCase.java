import java.util.*;
public class NestedSwitchCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int id=sc.nextInt();
        String Dept=sc.next();
//        switch(id){
//            case 1:
//                System.out.println("Srihari Gatreddi");
//                break;
//            case 2:
//                System.out.println("Indu GAtreddi");
//                break;
//            case 3:
//                switch (Dept){
//                    case "IT":
//                        System.out.println("IT department");
//                        break;
//                    case "Mangement":
//                        System.out.println("Management Department");
//                        break;
//                    default:
//                        System.out.println("Enter valid Department");
//                }
//                break;
//            default:
//                System.out.println("Enter valid Employye ID");
//        }

        switch (id) {
            case 1 -> System.out.println("Srihari Gatreddi");
            case 2 -> System.out.println("Indu GAtreddi");
            case 3 -> {
                switch (Dept) {
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "Mangement":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("Enter valid Department");
                }
            }
            default -> System.out.println("Enter valid Employye ID");
        }
    }
}
