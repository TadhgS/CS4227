package Controller;

/**
 *
 * @author danie
 */
public class Button  
{
    public static void buttonRemote(String pressed)
    {
       
        Remote remote = new Remote();
        Movement movementPrimary = new Movement("Primary");
        Actions actionPrimary = new Actions("Primary");
        
        MovementUpCommand primaryUp = new MovementUpCommand(movementPrimary);
        MovementDownCommand primaryDown = new MovementDownCommand(movementPrimary);
        MovementLeftCommand primaryLeft = new MovementLeftCommand(movementPrimary);
        MovementRightCommand primaryRight = new MovementRightCommand(movementPrimary);
        
        ActionStartCommand primaryStart = new ActionStartCommand(actionPrimary);
        ActionAttackCommand primaryAttack = new ActionAttackCommand(actionPrimary);
        ActionRunCommand primaryRun = new ActionRunCommand(actionPrimary);
        
        switch(pressed)
        {
            case "Up":
                remote.setCommand(primaryUp);
                remote.buttonPressed();
                break;
                
            case "Down":
                remote.setCommand(primaryDown);
                remote.buttonPressed();
                break;
                
            case "Left":
                remote.setCommand(primaryLeft);
                remote.buttonPressed();
                break;
                
            case "Right":
                remote.setCommand(primaryRight);
                remote.buttonPressed();
                break;
                
            case "Attack":
                remote.setCommand(primaryAttack);
                remote.buttonPressed();
                break;
                
            case "Run":
                remote.setCommand(primaryRun);
                remote.buttonPressed();
                break;
                
            case "Start":
                remote.setCommand(primaryStart);
                remote.buttonPressed();
                break;
        }
    }
}
