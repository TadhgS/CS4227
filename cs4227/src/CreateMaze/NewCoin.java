package CreateMaze;
import Controller.UpdateUserScore;
/**
 *
 * @author Tadhg
 */
public class NewCoin implements CoinInterface
{
    @Override
   public void updateScore()
   {
       UpdateUserScore updateUserScore = new UpdateUserScore();
       updateUserScore.updateUserScore();
   }
    
}
