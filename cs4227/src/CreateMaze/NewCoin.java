package CreateMaze;
import Avatar.Avatar;

 
public class NewCoin implements CoinInterface
{
   @Override
   public void updateScore(Avatar a)
   {
       int score = 10;
       a.setScore(score);
   }

    
}