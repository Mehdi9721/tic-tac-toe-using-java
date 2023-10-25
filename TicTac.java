import javax.swing.*;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

class TicTac{
    public static void main(String[] args) {
         char[][] board=new char[3][3];
        for (int i = 0; i <board.length ; i++) {
            for (int j = 0; j <board[i].length ; j++) {
                board[i][j]='*';
            }
        }
        char Player='X';
        boolean gameOver=false;
        Scanner sc=new Scanner(System.in);
     while(!gameOver){
         printBorad(board);
         System.out.println("Now "+Player+" will move ");
         int row=0,col=0;
         row=sc.nextInt();
         col= sc.nextInt();
    if(board[row][col]!='*'){
        System.out.println("enter valid move");
    }else{
        board[row][col]=Player;
        gameOver=haveWon(board,Player);
        if(gameOver){
            System.out.println(Player +" WON");
        }else {
            if(Player=='X'){
                Player='0';
            }else {
 Player='X';
            }
        }
    }
     }
     printBorad(board);

    }

    private static void printBorad(char[][] board) {
        for (int i = 0; i <board.length ; i++) {
            for (int j = 0; j <board[i].length ; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static boolean haveWon(char[][] board, char player) {
//checking for row
        for (int i = 0; i <board.length ; i++) {
            if(board[i][0]==player && board[i][1]==player && board[i][2]==player ){
                return true;
            }
        }
        //checking column
        for (int i = 0; i <board[0].length ; i++) {
            if(board[0][i]==player && board[1][i]==player && board[2][i]==player ){
                return true;
            }
        }
        //cheching diagonal left to right
        for (int i = 0; i < board.length; i++) {
            if(board[0][0]==player && board[1][1]==player && board[2][2]==player ){
                return true;
            }
        }
        if(board[0][2]==player && board[1][1]==player && board[2][0]==player ){
            return true;
        }
        return false;
    }

}