import java.util.Scanner;
public class calender {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int date = input.nextInt();

        String[] days = {"sun", "mon", "tue", "wed", "thu", "fri", "Sat"};


        System.out.print("Enter first day of the month");
        int first_day= input.nextInt();


        System.out.print("Enter total number of days in a month");
        int total_days = input.nextInt();

        for(int i=0; i<7; i++) {
            String aligned = centreAlign(days[i]);
            System.out.print(aligned.toUpperCase());
        }
        System.out.println();

//        int count_space = 0;
        if(first_day>=1 && first_day<7) {
            for (int i = 1; i < first_day; i++) {
                System.out.print(centreAlign(" "));
            }
        }
        if(total_days>=1 && total_days<32) {
            int dayCount = first_day;
            for (int i = 1; i <= total_days; i++) {
                    System.out.print(centreAlign(String.valueOf(i)));
                if(dayCount % 7 == 0){
                    System.out.println("");
                }
                dayCount += 1;

                }
        }

    }


    public static String centreAlign(String s) {
            int column = 7;
            int remaining = column - s.length();
            int Lspace = remaining / 2;
            String out = "";

            for (int j = 0; j < Lspace; j++) {
                out = out + " ";
            }
            out = out + s;

            int  Rspace = remaining - Lspace;
            for (int j = 0; j < Rspace; j++) {
                out = out + " ";
            }
         return out;
        }
    }




