package ArdrunoContrlol;


/**
 * Created by user on 21.12.2015.
 */
public class ActionsFromArdruino {
    void Actions(String IRcode) {
        //System.out.println("Recive:" + IRcode);
            KeyPresser keyPresser=new KeyPresser();
            switch (IRcode)//Get code from ardruino
            {
                case "34 30 30 31 39 31 38 33 33 35 0D 0A"://CH+
                    keyPresser.Press(116,50);
                    //System.out.println("working");
                    break;
                case "32 34 32 30 32 39 35 33 33 34 0D 0A"://CH

                    break;
                case "3810010651"://CH-

                    break;
                case "31 33 38 36 34 36 38 33 38 33 0D 0A"://Prew:
                    keyPresser.Press(37,50);
                    break;
                case "33 36 32 32 33 32 35 30 31 39 0D 0A"://Next:
                    keyPresser.Press(39,50);
                    break;
                case "35 35 33 35 33 36 39 35 35 0D 0A"://Play/Pause
                    keyPresser.Press(16,116,50);
                    break;
                case "4034314555"://vol-

                    break;
                case "2747854299"://vol+

                    break;
                case "33 38 35 35 35 39 36 39 32 37 0D 0A"://EQ
                    keyPresser.Press(27,50);
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





