package ArdrunoContrlol;
import java.awt.AWTException;
import java.awt.Robot;
import java.math.BigDecimal;

/**
 * Created by user on 21.12.2015.
 */
public class ActionsFromArdruino {
    void Actions(String IRcode) {
        //System.out.println("Recive:" + IRcode);
            KeyPresser keyPresser=new KeyPresser();
            switch (IRcode)//Get code from ardruino
            {
                case "34 30 30 31 39 31 38 33 33 35 0D 0A":
                    //CH+
                    System.out.println("working");
                    break;
                case "35 33 31 36 30 32 37 0D 0A"://CH

                    break;
                case "3810010651"://CH-

                    break;
                case ("1386468383")://Prew

                    break;
                case ("3622325019")://Next

                    break;
                case "35 35 33 35 33 36 39 35 35 0D 0A"://Play/Pause
                    keyPresser.Press(116,50);
                    break;
                case "4034314555"://vol-

                    break;
                case "2747854299"://vol+

                    break;
                case "3855596927"://EQ

                    break;
                case "3238126971"://0

                    break;
                case "2538093563"://+100

                    break;
                case "4039382595"://+200

                    break;
                case "2534850111"://1

                    break;
                case "1033561079"://2

                    break;
                case "1635910171"://3

                    break;
                case "2351064443"://4

                    break;
                case "1217346747"://5

                    break;
                case "71952287"://6

                    break;
                case "851901943"://7

                    break;
                case "465573243"://8

                    break;
                case "1053031451"://9

                    break;
                default:
                    //System.out.println(IRcode);
            }


        }
    }





