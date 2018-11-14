package CreateMaze;

import Avatar.Avatar;

/**
 *
 * @author Tadhg
 */
public class ProxyCoin implements CoinInterface
{
    private NewCoin newCoin = new NewCoin();
    @Override
    public void updateScore(Avatar a)
    {
        int score = 10;
        newCoin.updateScore(a);
    }
    
}
