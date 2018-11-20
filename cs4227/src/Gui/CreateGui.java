package Gui;

import Avatar.Avatar;
import Avatar.CheckPoint;
import javax.swing.*;
import java.awt.event.*;
import Controller.Command;
import Controller.Button;
import Controller.PlayerDisplayInfo;
import Interceptor.ConcreteInterceptor;
import Interceptor.ContextObject;
import Interceptor.Dispatcher;
import java.awt.Dimension;
import java.util.ArrayList;
import CreateMaze.ProxyCoin;

/**
 *
 * @author Daniel
 */
public class CreateGui extends JFrame implements ActionListener 
{   
    //creates a new avatar
    Avatar a = new Avatar();
    //creates a memento of avatar
    CheckPoint checkPoint = new CheckPoint();
    
    public static JButton upButton, downButton, leftButton, rightButton, attackButton, runButton, startButton, reStartButton, tryButton;
    public static JTextField userText, scoreText, healthText, floorText;
    public static JTextArea gameScreenText, gameText;
    JComboBox<String> sizeSelection;
    public int previousPosition = 1;
    ArrayList w,t;
    String[] player;
    String roomSize;
    int moveBy;
    
    //creates room
    CreateMaze.AbstractFactory roomFactory = CreateMaze.FactoryProducer.getFactory("room");
    
    //creates the UI
    public CreateGui()
    {
        checkPoint.addAvatar(a.saveState());
        setTitle("The Maze");
        setLayout(null);
        setSize(800,400);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Need logout() on close to log with interceptor
        
        userText = new JTextField();
        userText.setBounds(1, 1, 150, 25);
        userText.setEditable(false);
        userText.setText("Username: " + login.userName);
        add(userText);
        
        scoreText = new JTextField();
        scoreText.setBounds(170, 1, 100, 25);
        scoreText.setText("Coins: ");
        scoreText.setEditable(false);
        add(scoreText);
        
        healthText = new JTextField();
        healthText.setBounds(280, 1, 100, 25);
        healthText.setText("Health: ");
        healthText.setEditable(false);
        add(healthText);
        
        floorText = new JTextField();
        floorText.setBounds(390, 1, 100, 25);
        floorText.setText("Floor: ");
        floorText.setEditable(false);
        add(floorText);
        
        gameScreenText = new JTextArea();
        gameScreenText.setBounds(1, 30, 500, 300);
        gameScreenText.setText("");
        gameScreenText.setEditable(false);
        gameScreenText.setFont(gameScreenText.getFont().deriveFont(40f));
        add(gameScreenText);
        
        
        gameText = new JTextArea();
        gameText.setText("");
        gameText.setEditable(false);
        gameText.setFont(gameText.getFont().deriveFont(10f));
        
        JScrollPane scroll = new JScrollPane(gameText);
        scroll.setBounds(510, 10, 280, 200);
        scroll.setPreferredSize(new Dimension(290,200));
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        add(scroll);
        
        
        
        upButton = new JButton("Up");
        upButton.setBounds(600, 240, 80, 25);
        upButton.addActionListener(this);
        add(upButton);
        upButton.setVisible(false);
        
        downButton = new JButton("Down");
        downButton.setBounds(600, 265, 80, 25);
        downButton.addActionListener(this);
        add(downButton);
        downButton.setVisible(false);
        
        leftButton = new JButton("Left");
        leftButton.setBounds(520, 255, 80, 25);
        leftButton.addActionListener(this);
        add(leftButton);
        leftButton.setVisible(false);
        
        rightButton = new JButton("Right");
        rightButton.setBounds(680, 255, 80, 25);
        rightButton.addActionListener(this);
        add(rightButton);
        rightButton.setVisible(false);
        
        attackButton = new JButton("Attack");
        attackButton.setBounds(520, 255, 80, 25);
        attackButton.addActionListener(this);
        add(attackButton);
        attackButton.setVisible(false);
        
        runButton = new JButton("Run");
        runButton.setBounds(680, 255, 80, 25);
        runButton.addActionListener(this);
        add(runButton);
        runButton.setVisible(false);
        
        startButton = new JButton("Start");
        startButton.setBounds(600, 300, 80, 25);
        startButton.addActionListener(this);
        add(startButton);
        
        reStartButton = new JButton("Restart");
        reStartButton.setBounds(600, 300, 80, 25);
        reStartButton.addActionListener(this);
        add(reStartButton);
        reStartButton.setVisible(false);
        
        tryButton = new JButton("Again?");
        tryButton.setBounds(600, 275, 80, 25);
        tryButton.addActionListener(this);
        add(tryButton);
        tryButton.setVisible(false);
        
        JButton logoutButton = new JButton("Logout");
        logoutButton.setBounds(600, 325, 80, 25);
        logoutButton.addActionListener(this);
        add(logoutButton);
        
        sizeSelection = new JComboBox<>(new String[] {"Small", "Medium", "Large"});
        sizeSelection.setBounds(600, 275, 80, 25);
        sizeSelection.setSelectedIndex(0);
        add(sizeSelection);
        
    }
    //implementation of buttons
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if("Logout".equals(e.getActionCommand()))
        {
            setVisible(false);
            ContextObject cO = new ContextObject();
            Dispatcher dispatcher = new Dispatcher();
            ConcreteInterceptor IC = new ConcreteInterceptor(cO);
            dispatcher.register(IC);
            dispatcher.dispatch();
            Gui.login l = new Gui.login();
            l.setVisible(true);
        }
        else if("Start".equals(e.getActionCommand()))
        {
            startGame();
        }
        else if("Restart".equals(e.getActionCommand()))
        {
            restartGame(false);
        }
        else if("Run".equals(e.getActionCommand()))
        {
            Button.buttonRemote(e.getActionCommand());
            upButton.setVisible(true);
            downButton.setVisible(true);
            leftButton.setVisible(true);
            rightButton.setVisible(true);
            runButton.setVisible(false);
            attackButton.setVisible(false);
            
            a.setPosition(previousPosition);
            printBoard();
        }
        else if("Attack".equals(e.getActionCommand()))
        {
            Button.buttonRemote(e.getActionCommand());
            upButton.setVisible(true);
            downButton.setVisible(true);
            leftButton.setVisible(true);
            rightButton.setVisible(true);
            runButton.setVisible(false);
            attackButton.setVisible(false);
            
            a.setScore(a.getScore() + 1);
            a.setCurrentHP(a.getHP() -2);
            updateGuiStats();
            
            ((CreateMaze.Assembler)t.get(a.getPosition())).getParts().set(1, new CreateMaze.CobbleTile());
            printBoard();
        }
        else if("Again?".equals(e.getActionCommand()))
        {
            restartGame(true);
            gameText.setText("Here again? .....good luck");
        }
        else
        {
            Button.buttonRemote(e.getActionCommand());
            updateGameInfo();
            printBoard();
        }
    }
    
    //on startgame click
    public void startGame()
    {
        upButton.setVisible(true);
        downButton.setVisible(true);
        leftButton.setVisible(true);
        rightButton.setVisible(true);
        runButton.setVisible(false);
        attackButton.setVisible(false);
        startButton.setVisible(false);
        reStartButton.setVisible(true);
        sizeSelection.setVisible(false);
        updateGuiStats();
        
        System.out.print(sizeSelection.getSelectedItem().toString());
        roomSize = sizeSelection.getSelectedItem().toString();
        CreateMaze.Room room = roomFactory.getRoom(roomSize);
        t = room.createTiles();
        w = room.createWalls();
        
        gameText.setText(gameText.getText() + "You start your adventure....good luck\n");
        
        CreateMaze.Assembler x,y = null;
        
        for(int i = 0; i< w.size();i++)
        {
        x = (CreateMaze.Assembler)w.get(i);
        }

        player = new String[t.size()];
        printBoard();
    } 

    private void updateGameInfo() {
        
        ProxyCoin proxyCoin = new ProxyCoin();
        previousPosition = a.getPosition();
        gameText.setText(gameText.getText()  + PlayerDisplayInfo.movementAction +  "\n");
        CreateMaze.Assembler x,y = null;
        
        Collision.HitWall hitWall = new Collision.HitWall(a,sizeSelection.getSelectedIndex()+ 2);
        Collision.HitTile hitTile = new Collision.HitTile(a,sizeSelection.getSelectedIndex()+ 2);
        x = (CreateMaze.Assembler)w.get(a.getPosition());
        
        if(hitWall.checkIfWall())
        {
            x = (CreateMaze.Assembler)w.get(hitWall.getWall());
            a = hitWall.wallHitHealth(x);
            hitWall.wallHitDoor(x);
            gameText.setText(gameText.getText() + "You walked into a " + x.getParts().get(1).name() +""+ x.getParts().get(0).name() + "\n");
            doorCheck(x);
        }
        else
        {
            a.setPosition(a.getPosition() + hitTile.getMove());
            y = (CreateMaze.Assembler)t.get(a.getPosition());
            a = hitTile.tileHitHealth(y.getParts().get(1).name());
            gameText.setText(gameText.getText() + "You walk on a " + y.getParts().get(1).name() +" "+ y.getParts().get(0).name() + "\n");
            
            if(y.getParts().get(1).name() == "Mob")
            {
                upButton.setVisible(false);
                downButton.setVisible(false);
                leftButton.setVisible(false);
                rightButton.setVisible(false);
                runButton.setVisible(true);
                attackButton.setVisible(true);
            }
            else if(y.getParts().size() > 1&&(y.getParts().get(1).name() == "Heal" || y.getParts().get(1).name() == "Coin"))
            {
                ((CreateMaze.Assembler)t.get(a.getPosition())).getParts().set(1, new CreateMaze.CobbleTile());
            }
        }
        if(a.getHP() <= 0)
        {
            a.setCurrentHP(0);
            upButton.setVisible(false);
            downButton.setVisible(false);
            leftButton.setVisible(false);
            rightButton.setVisible(false);
            runButton.setVisible(false);
            attackButton.setVisible(false);
            tryButton.setVisible(true);
            int totalScore = (a.getScore());
            for(int r = 0; r < totalScore; r++)
            {
                proxyCoin.updateScore(a);
            } 
            gameText.setText(gameText.getText() + login.userName + " has died....... good going." +  "\n" + login.userName + "'s score is: " + a.getPoints() + "\n");
            ContextObject cO = new ContextObject(a);
            Dispatcher dispatcher = new Dispatcher();
            ConcreteInterceptor IC = new ConcreteInterceptor(cO);
            dispatcher.register(IC);
            dispatcher.dispatch("test");
        }
        updateGuiStats();
    }
    
    private void printBoard()
    {
        for(int i =0; i< player.length;i++)
            player[i] = "-";
        player[a.getPosition()] = "p";
        if(roomSize == "Small")
        {
        gameScreenText.setText(" x x x x\n" +
            " x " +player[0]+ "  " + player[1] +  " x\n" +
            " x " +player[2]+ "  " + player[3] +  " x\n" +
            " x x x x\n");
        }
        else if(roomSize == "Medium")
        {
            gameScreenText.setText("  x x x x x\n" +
            " x " + player[0] + "  " + player[1] + "  " + player[2] + " x\n" +
            " x " + player[3] + "  " + player[4] + "  " + player[5] + " x\n" +
            " x " + player[6] + "  " + player[7] + "  " + player[8] + " x\n" +
            "  x x x x x\n");
        }
        else if(roomSize == "Large")
        {
            gameScreenText.setText("   x x x x x x\n" +
            " x " + player[0] + "  " + player[1] + "  " + player[2] + "  " + player[3] + " x\n" +
            " x " + player[4] + "  " + player[5] + "  " + player[6] + "  " + player[7] + " x\n" +
            " x " + player[8] + "  " + player[9] + "  " + player[10] + "  " + player[11] + " x\n" +
            " x " + player[12] + "  " + player[13] + "  " + player[14] + "  " + player[15] + " x\n" +
            "   x x x x x x\n");
        }
    }

    private void restartGame(Boolean redo) {
        upButton.setVisible(true);
        downButton.setVisible(true);
        leftButton.setVisible(true);
        rightButton.setVisible(true);
        runButton.setVisible(false);
        attackButton.setVisible(false);
        startButton.setVisible(false);
        reStartButton.setVisible(true);
        tryButton.setVisible(false);
        if(redo)
        {
            a.getState(checkPoint.getLastAvatar());
        }
        else
        {
        a = new Avatar();
        gameText.setText("You restarted the Game \n");
        a.setPosition(1);
        }
        
        updateGuiStats();
        
        CreateMaze.AbstractFactory roomFactory;
        roomFactory = CreateMaze.FactoryProducer.getFactory("room");
        CreateMaze.Room room = roomFactory.getRoom(roomSize);
        t = room.createTiles();
        w = room.createWalls();
        CreateMaze.Assembler x = null;

        player = new String[t.size()];
        printBoard();
    }
    //check for moving up a floor
    private void doorCheck(CreateMaze.Assembler x)
    {
         if(x.getParts().get(1).name() == "Destructable"||x.getParts().get(1).name() == "Door")
        {
            CreateMaze.Room room = roomFactory.getRoom(roomSize);
            t = room.createTiles();
            w = room.createWalls();
            a.setFloor(a.getFloor()+1);
            gameText.setText(gameText.getText() + "You have moved up a floor.\n");
            checkPoint.addAvatar(a.saveState());
        }
    }
    //updating UI stats
    private void updateGuiStats()
    {
        healthText.setText("Health: " + a.getHP());
        scoreText.setText("Coins: " + a.getScore());
        floorText.setText("Floor: " + a.getFloor());
    }
}
