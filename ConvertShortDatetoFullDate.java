import java.util.Scanner;

public class ConvertShortDatetoFullDate {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String date = "";

        do {
            System.out.println("You cant input Format YYYY-MM-DD");
            date = scanner.nextLine();
            String[] parts = date.split("-");

            switch (parts[1]){
                case "01":{
                    System.out.println("January" +" "+ parts[0] +","+ parts[2]);
                    break;
                }
                case  "02":{
                    System.out.println("February" +" "+ parts[0] +","+ parts[2]);
                    break;
                }
                case  "03":{
                    System.out.println("March" +" "+ parts[0] +","+ parts[2]);
                    break;
                }
                case "04":{
                    System.out.println("April" +" "+ parts[0] +","+ parts[2]);
                    break;
                }
                case "05":{
                    System.out.println("May" +" "+ parts[0] +","+ parts[2]);
                    break;
                }
                case "06":{
                    System.out.println("June" +" "+ parts[0] +","+ parts[2]);
                    break;
                }
                case "07":{
                    System.out.println("July" +" "+ parts[0] +","+ parts[2]);
                    break;
                }
                case "08":{
                    System.out.println("August" +" "+ parts[0] +","+ parts[2]);
                    break;
                }
                case "09":{
                    System.out.println("September" +" "+ parts[0] +","+ parts[2]);
                    break;
                }
                case "10":{
                    System.out.println("October" +" "+ parts[0] +","+ parts[2]);
                    break;
                }
                case "11":{
                    System.out.println("November" +" "+ parts[0] +","+ parts[2]);
                    break;
                }
                case  "12":{
                    System.out.println("December" +" "+ parts[0] +","+ parts[2]);
                    break;
                }
                default:{
                    System.out.println("Exit....");
                    break;
                }
            }

        }while (true);
    }
}
