package ArdrunoContrlol;
import java.awt.AWTException;
import java.awt.Robot;
import java.math.BigDecimal;

/**
 * Created by user on 21.12.2015.
 */
public class ActionsFromArdruino {
    void Actions(String IRcode) {
        System.out.println("Recive:" + IRcode);

            if("4001918335".equals(IRcode))
            {
                System.out.println("!!!!!!");
            }




            switch (IRcode)//Get code from ardruino
            {
                case "4001918335":
                    //CH+
                    System.out.println("working");
                    break;
                case "5316027"://CH

                    break;
                case "3810010651"://CH-

                    break;
                case ("1386468383")://Prew

                    break;
                case ("3622325019")://Next

                    break;
                case "553536955"://Play/Pause

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
                    System.out.println(IRcode);
            }


        }
    }





