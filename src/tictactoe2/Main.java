/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe2;

/**
 *
 * @author Owner
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List<History> histories = History.load("previousGames");
        
        Player human = new HumanPlayer();
        Player computer = new AIPlayer(histories);
        
        Game game = new Game(human, computer);
        
        boolean gameFinished = false;
        
        while(!gameFinished){
            gameFinished = game.step();
        }
        
    }
    
}
