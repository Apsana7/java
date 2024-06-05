import java.util.Scanner;
public class poem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] poem = {
                "I've hunted near, I've hunted far",
                "I even looked inside my car",
                "I've lost my glasses,I'm in need",
                "To have them now so i can read",
                "I Loudly swear and I curse",
                "Did I leave them in my purse?",
                "Are they behind the sofa,under the bed?",
                "oh there they are-- on my head!"
        };

        RightAlignment(poem);
        System.out.println();
        centreAlignment(poem);
    }
    public static  void centreAlignment(String[] poem){
        int column =poem[0].length();
        int remaining;

        for(int i=0; i<poem.length; i++){
            if(poem[i].length()>column){
                column = poem[i].length();
            }
        }
        for(int i = 0; i<poem.length;i++){
            remaining = column - poem[i].length();
            int leftSideSpace = remaining/2;
            for(int j=0; j< leftSideSpace; j++){
                System.out.print(" ");
            }
            /////////////////////////////////
            System.out.print(poem[i]);
            /////////////////////////////////
            int rightSideSpace = remaining / 2;
            for (int j = 0; j < rightSideSpace; j++) {
                System.out.print(" ");

            }
            System.out.println();
        }

    }
    public static void RightAlignment(String[] poem){
        int column = poem[0].length();
        for(int i = 0; i<poem.length; i++){
            if(poem[i].length() > column){
                column = poem[i].length();
            }
        }
        for (int i = 0; i < poem.length; i++) {
            int remaining;
            remaining = column - poem[i].length();
            int space = remaining;
            for (  int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            System.out.println(poem[i]);
        }

    }
}



