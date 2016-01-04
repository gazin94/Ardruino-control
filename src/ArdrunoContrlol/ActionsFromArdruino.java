package ArdrunoContrlol;


import java.awt.*;

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
                    keyPresser.Press(116,50);//F5
                    //System.out.println("working");
                    break;
                case "35 33 31 36 30 32 37 0D 0A"://CH
                    keyPresser.Press(32,50);//Space
                    break;
                case "33 38 31 30 30 31 30 36 35 31 0D 0A"://CH-
                    keyPresser.Press(17,9,50);//Ctrl+Tab
                    break;
                case "31 33 38 36 34 36 38 33 38 33 0D 0A"://Prew:
                    keyPresser.Press(37,50);//Left
                    break;
                case "33 36 32 32 33 32 35 30 31 39 0D 0A"://Next:
                    keyPresser.Press(39,50);//Rigth
                    break;
                case "35 35 33 35 33 36 39 35 35 0D 0A"://Play/Pause
                    keyPresser.Press(16,116,50);//Shift+F5
                    break;
                case "34 30 33 34 33 31 34 35 35 35 0D 0A"://vol-:
                    keyPresser.Press(40,50);//Down
                    break;
                case "32 37 34 37 38 35 34 32 39 39 0D 0A"://vol+
                    keyPresser.Press(38,50);//Up
                    break;
                case "33 38 35 35 35 39 36 39 32 37 0D 0A"://EQ
                    keyPresser.Press(27,50);//Esc
                    break;
                case "33 32 33 38 31 32 36 39 37 31 0D 0A"://0
                    keyPresser.Press(17,87,50);//02.
                    break;
                case "32 35 33 38 30 39 33 35 36 33 0D 0A"://+100
                keyPresser.Press(17,16,9,50);//Ctrl+Shift+Tab
                    break;
                case "34 30 33 39 33 38 32 35 39 35 0D 0A"://+200
                    keyPresser.Press(18,9,9,50);
                    break;
                case "32 35 33 34 38 35 30 31 31 31 0D 0A"://1
                    keyPresser.Press(17,16,121,50);//Ctrl+Shift+F10
                    break;
                case "31 30 33 33 35 36 31 30 37 39 0D 0A"://2
                    keyPresser.Press(16,120,50);//Shift+F9
                    break;
                case "31 36 33 35 39 31 30 31 37 31 0D 0A"://3
                    keyPresser.Press(17,16,84,50);//Ctrl+Shift+T Last 10 closet links
                    break;
                case "32 33 35 31 30 36 34 34 34 33 0D 0A"://4
                    keyPresser.Press(122,50);//F11
                    break;
                case "31 32 31 37 33 34 36 37 34 37 0D 0A"://5
                    keyPresser.Press(16,27,50);//Shift+Esc TaskManager
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
            }   //Ardruino code
        /*
        #include <Keyboard.h>
#include <IRremote.h>

int RECV_PIN = 11;
IRrecv irrecv(RECV_PIN); //Создаем объект получения сигнала с определнного порта
decode_results results; //Переменная, хранящая результат
void setup()
{
  Serial.begin(9600);
  irrecv.enableIRIn(); // Начинаем прием
}
void loop() {
  if (irrecv.decode(&results)) //При получении сигнала...
  {
    Serial.println(results.value); //…выводим его значение в последовательный порт
    irrecv.resume(); // Получаем следующее значение
  }
}

         */


        }
    }





