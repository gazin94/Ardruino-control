package ArdrunoContrlol;
import java.awt.AWTException;
import java.awt.Robot;


/**
 * Created by user on 26.12.2015.
 */
 class KeyPresser {
    void Press(int keyKode ,int delay)
    {
        try
        {
            Robot robot=new Robot();
            robot.keyPress(keyKode);
            robot.delay(delay);
            System.out.println("Pressed");
            robot.keyRelease(keyKode);
        }
        catch(AWTException e)
        {
            e.printStackTrace();
        }
    }

    void Press(int keyKode,int keyKode2 ,int delay)
    {
        try
        {
            Robot robot=new Robot();
            robot.keyPress(keyKode);
            robot.keyPress(keyKode2);
            robot.delay(delay);
            System.out.println("Pressed");
            robot.keyRelease(keyKode);
            robot.keyRelease(keyKode2);

        }
        catch(AWTException e)
        {
            e.printStackTrace();
        }
    }


    void Press(int keyKode,int keyKode2,int keyKode3 ,int delay)
    {
        try
        {
            Robot robot=new Robot();
            robot.keyPress(keyKode);
            robot.keyPress(keyKode2);
            robot.keyPress(keyKode3);
            robot.delay(delay);
            System.out.println("Pressed");
            robot.keyRelease(keyKode);
            robot.keyRelease(keyKode2);
            robot.keyRelease(keyKode3);

        }
        catch(AWTException e)
        {
            e.printStackTrace();
        }
    }
}
