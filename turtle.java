import java.util.Scanner;
public class turtle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int m=30;
        int n=50;
        String [][] canvas = new String[m][n];

//        System.out.println("Enter position:");
//        int i = input.nextInt();
//        int j= input.nextInt();

        System.out.println("Enter commands:");
        int dist;
        int currentX = 0;
        int currentY = 0;
        int a;
        int b;
        while(true) {
            String move = input.next().toUpperCase();

            if(move.equals("MOVE")) {
                a = input.nextInt();
                b = input.nextInt();

                        currentX = a;
                        currentY = b;
            }else if(move.equals("DOWN")) {
                dist = input.nextInt();
                for(int d = 0; d < dist; d++) {
                    canvas[currentX][currentY] = "*";
                    currentX++;
                }
            } else if(move.equals("RIGHT")) {
                dist = input.nextInt();
                for (int d = 0; d < dist; d++) {
                    canvas[currentX][currentY] = "*";
                    currentY++;
                }
            }else if(move.equals("LEFT")){
                  dist = input.nextInt();
                  for(int d=20; d<dist; d--){
                      canvas[currentX][currentY] = "*";
                      currentY--;

                  }
            }else if(move.equals("TOP")){
                 dist = input.nextInt();
                     for(int d=0; d<dist; d++){
                         canvas[currentX][currentY] = "*";
                         currentX--;
                 }
            }else if(move.equals("END")) {
                break;
            }
//            System.out.println();
        }
        //print the final result
        for(int i = 0; i < m; i ++) {
            for(int  j = 0; j < n; j ++) {
                if(canvas[i][j] != null) {
                    System.out.printf("%s", canvas[i][j]);
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

}