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

public class play {



    public static void main(String[] args) {


        System.out.println("Welcome to Tic Tac Toe!");
        System.out.println();

        //creat markers
        String marker1 = "X";
        String marker2 = "O";
        boolean playAgain = true;

        Scanner s = new Scanner(System.in);



        //create player objects
        Human human = new Human();
        Enemy enemy = new Enemy();
        Computer computer = new Computer();

        while(playAgain){
            //run board setup
            set Setup = new set();

            Setup.createBoard();
            Setup.printBoard();
            System.out.println("");
            
            
            //set Enemy
            System.out.println("1. VS Human");
            System.out.println("2. VS Computer");
            System.out.println("");
            System.out.print("Choose Your Enemy:");
            

            //Play With Human
            if(s.nextInt() == 1){
                System.out.println("=====================");
                System.out.println("1. 'X' ");
                System.out.println("2. 'O' ");
                System.out.print("Please choose your marker:");
                if(s.nextInt() == 1){
                // create player objects
                human.setMarker("X");
                enemy.setMarker("O");
                } 
                else
                {
                human.setMarker("O");
                enemy.setMarker("X");

                }
                 // determine who goes first
                 int first = (int) (Math.random() * 2);
                 
                
            boolean won = false;
            int turns = 0;

            if(first == 0){
                System.out.println("You goes first!");
                System.out.println();
                while(!won){
                    human.takeTurn(Setup.getBoard());
                    turns++;
                    Setup.printBoard();
                    if(Setup.hasWon(Setup.getBoard())){
                        won = true;
                        System.out.println("Congrats you won!");
                    }
                    if(turns == 9){
                        won = true;
                        System.out.println("It's a Draw!");
                        break;
                    }
                    if(!won){
                        enemy.takeTurn(Setup.getBoard(), human);
                        turns++;
                        System.out.println();
                        Setup.printBoard();
                        System.out.println();
                        if(Setup.hasWon(Setup.getBoard())){
                            won = true;
                            System.out.println("Human Win!");
                        }
                        if(turns == 9){
                            won = true;
                            System.out.println("It's a Draw!");
                            break;
                        }
                    }

                }  // close while 1
            }
            else {

                System.out.println("Human goes first!");
                System.out.println();
                while(!won){
                    enemy.takeTurn(Setup.getBoard(), human);
                    turns++;
                    Setup.printBoard();
                    if(Setup.hasWon(Setup.getBoard())){
                        won = true;
                        System.out.println("Congrast Human Win!");
                    }
                    if(turns == 9){
                        won = true;
                        System.out.println("It's a Draw!");
                        break;
                    }
                    if(!won){
                        human.takeTurn(Setup.getBoard());
                        turns++;
                        System.out.println();
                        Setup.printBoard();
                        System.out.println();
                        if(Setup.hasWon(Setup.getBoard())){
                            won = true;
                            System.out.println("You Win!");
                        }
                        if(turns == 9){
                            won = true;
                            System.out.println("It's a Draw!");
                            break;
                        }
                    }



                }  // close while 2

            }

            System.out.println("============================");
            System.out.println("1. YES");
            System.out.println("2. QUIT");
            System.out.print("Would you like to play again?");
            if(s.nextInt() == 2){
                playAgain = false;
            }

                 
            
            }
            
            
            
            
            //----------------------//
            // Play With AI
            else{
            
            //set markers
                System.out.println("=====================");
                System.out.println("1. 'X' ");
                System.out.println("2. 'O' ");
                System.out.print("Please choose your marker:");
            if(s.nextInt() == 1){
                // create player objects
                human.setMarker("X");
                computer.setMarker("O");
            } 
            else
            {
                human.setMarker("O");
                computer.setMarker("X");

            }




            // determine who goes first
            int first = (int) (Math.random() * 2);





            boolean won = false;
            int turns = 0;

            if(first == 0){
                System.out.println("You goes first!");
                System.out.println();
                while(!won){
                    human.takeTurn(Setup.getBoard());
                    turns++;
                    Setup.printBoard();
                    if(Setup.hasWon(Setup.getBoard())){
                        won = true;
                        System.out.println("Congrats you won!");
                    }
                    if(turns == 9){
                        won = true;
                        System.out.println("It's a Draw!");
                        break;
                    }
                    if(!won){
                        computer.takeTurn(Setup.getBoard(), human);
                        turns++;
                        System.out.println();
                        Setup.printBoard();
                        System.out.println();
                        if(Setup.hasWon(Setup.getBoard())){
                            won = true;
                            System.out.println("Computer Win!");
                        }
                        if(turns == 9){
                            won = true;
                            System.out.println("It's a Draw!");
                            break;
                        }
                    }

                }  // close while 1
            }
            else {

                System.out.println("Computer goes first!");
                System.out.println();
                while(!won){
                    computer.takeTurn(Setup.getBoard(), human);
                    turns++;
                    Setup.printBoard();
                    if(Setup.hasWon(Setup.getBoard())){
                        won = true;
                        System.out.println("Computer Win");
                    }
                    if(turns == 9){
                        won = true;
                        System.out.println("It's a Draw!");
                        break;
                    }
                    if(!won){
                        human.takeTurn(Setup.getBoard());
                        turns++;
                        System.out.println();
                        Setup.printBoard();
                        System.out.println();
                        if(Setup.hasWon(Setup.getBoard())){
                            won = true;
                            System.out.println("You Win!");
                        }
                        if(turns == 9){
                            won = true;
                            System.out.println("It's a Draw!");
                            break;
                        }
                    }



                }  // close while 2

            }

            System.out.println("============================");
            System.out.println("1. YES");
            System.out.println("2. QUIT");
            System.out.print("Would you like to play again?");
            System.out.println();
            if(s.nextInt() == 2){
                playAgain = false;
            }

        }

    }
    }
}
