import  java.util.Scanner;
public class ticTacToe{
    public static  void main(String[] args){
        boolean isFirstPlayer = true;
        boolean isDraw = true;
        int n=9;
   Scanner input = new Scanner(System.in);
   String[] box= {"-","-","-","-","-","-","-","-","-","-"};
   for(int i=0; i<n; i++){
       Board(box);
       int position = input.nextInt() - 1;

       if(position>=0 && position<9 && box[position].equals("-")){
           System.out.print("unoccupied\n");
            if(isFirstPlayer){
              box[position] = "X";
              isFirstPlayer = false;
            }else{
                box[position] ="O";
                isFirstPlayer = true;
            }
            String result =  WinningCondition(box);
            if(result.equals("Player 1")){
                Board(box);
                System.out.print("WINNER PLAYER1");
                isDraw = false;
                return;
           }
           if(result.equals("Player 2")){
               Board(box);
               System.out.print("Winner player2");
               isDraw = false;
               return;
           }
       }else{
           System.out.print("occupided\n");
           n++;
       }
       if(position>9){
           System.out.println("Invalid");
           n++;
       }
   }
   if(isDraw = true){
       System.out.print("--Draw--");
       Board(box);
   }

    }
    public static void Board(String[] box){
        System.out.println();
        System.out.println(box[0] + " | "+box[1]+ " | "+box[2] );
        System.out.println("---------");
        System.out.println(box[3]+" | "+ box[4] + " | "+box[5]);
        System.out.println("---------");
        System.out.println(box[6] + " | "+box[7]+ " | "+box[8]);
    }
    public static String WinningCondition(String[] box){
        String line = "";
        for(int i=0; i<8; i++){
            switch (i){
                case 0:
                    line = box[0]  + box[1] + box[2];
                    break;
                case 1:
                    line = box[3] + box[4] + box[5];
                    break;
                case 2:
                    line = box[6] + box[7] + box[8];
                    break;
                case 3:
                    line = box[0] + box[3] + box[6];
                    break;
                case 4:
                    line = box[1] + box[4] + box[7];
                    break;
                case 5:
                    line = box[2] + box[5] + box[8];
                    break;
                case 6:
                    line = box[0] + box[4] + box[8];
                    break;
                case 7:
                    line = box[2] + box[4] + box[6];
            }
            if(line.equals("XXX")){
                return "Player 1";
            }else if(line.equals("OOO")){
                return "Player 2";
            }
        }
        return "";
    }
}