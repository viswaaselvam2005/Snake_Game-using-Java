import javax.swing.*;
public class App
{
  public static void main(String[] args) throws Exception{
     
    int boardWidth = 600;
    int boardHeight = 600;
    
    
    JFrame frame = new JFrame("Snake");
    frame.setVisible(true);
    frame.setSize(boardHeight,boardWidth);
    frame.setLocationRelativeTo(null);
    frame.setResizable(false); 
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    SnakeGame snakeGame = new SnakeGame(boardHeight,boardWidth);
    frame.add(snakeGame);
    frame.pack();
    snakeGame.requestFocus();
  }
}