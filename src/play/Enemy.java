/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package play;

/**
 *
 * @author Abdel Julian Bengngu
 */
import java.util.Scanner;


class Enemy extends player{
public Enemy(){

}


public void takeTurn(String[][] board, Human human) {

    Scanner s = new Scanner(System.in);

    boolean turn = true;

    while(turn){
        System.out.println("Human  Turn!");
        System.out.print("enter your move (row[1-3]): ");
        int row = s.nextInt();
        System.out.print("enter your move (column[1-3]): ");
        int col = s.nextInt();
        System.out.print("Human Move At Row: "+row+" And Cell: "+col);
        System.out.println();
        if(board[row - 1][col - 1] != "X" && board[row - 1][col - 1] != "O"){
            board[row - 1][col - 1] = Marker;
            turn = false;
        } // closes if
        else {
             System.out.println("This move at (" + (row + 1) + "," + (col + 1)
                  + ") is not valid. Try again...");
        }
    } // ends while
} // ends method
}
