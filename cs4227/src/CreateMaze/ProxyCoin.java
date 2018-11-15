package CreateMaze;

import Avatar.Avatar;

/**
 *
 * @author Tadhg
 */
public class ProxyCoin implements CoinInterface
{
    private RealCoin proxyCoin = new RealCoin();
    @Override
    public void updateScore(Avatar a)
    {
        int score = 10;
        proxyCoin.updateScore(a);
    }
    
}
