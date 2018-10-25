package CreateMaze;

/**
 *
 * @author Tadhg
 */
public class ProxyCoin implements CoinInterface
{
    private NewCoin newCoin = new NewCoin();
    @Override
    public void updateScore()
    {
        newCoin.updateScore();
    }
    
}
