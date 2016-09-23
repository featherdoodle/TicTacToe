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
public class Game {
    
    private boolean turn;
    private Player player1, player2;
    private Board board;
    
    
    public boolean step(){
        Move move = new Move();
        if(turn){
            move = player1.getMove(board);
            if(board.isPossible(move)){
                board.updateBoard(move);
            }
        }
        
        
    }
    
    
}
