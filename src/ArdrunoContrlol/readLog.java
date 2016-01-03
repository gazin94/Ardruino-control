package ArdrunoContrlol;
/*подключаем библиотеку для созддания апплетов и независимых
приложений с графическим интерфейсом*/
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Scanner;
/*Импорт классов библиотеки jssc*/
import jssc.*;

import javax.swing.*;

class readLog extends Frame
 {
     public String IR;//Создаем подкласс Log_window класса Frame
    //public static String data;
    static Label myLabel = new Label("Вывод данных логгера"); /*Надпись будет выводиться в начале.
    Создаем текстовое поле. Объявляем статик, т.к. обращаемся в классе события*/

    public readLog() {
        super("Логгер");/*Выз\ывает конструктор суперкласса.Всегда должен первым оператором,
		внутри конструктора подкласса*/
        setSize(400,400);//Метод суперкласса, для установкиразмеров окна, в пикселях
        //Создаем объекты
        Button myButton = new Button("Мониторинг");//Надпись на кнопке
        add(myLabel, BorderLayout.NORTH);// Label будет расположен вверху в Серной части
        add(myButton, BorderLayout.SOUTH);//Внизу в южной части

        myButton.addActionListener(new ActionListener() { /*Обработка события по нажатию
		на кнопку*/
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                String[] getedPortsArray= SerialPortList.getPortNames();

                JFrame frame = new JFrame("Input Dialog Example");
                String deafultPort=(String)JOptionPane.showInputDialog(frame,
                        "вберите порт",
                        "Выбор порта",JOptionPane.QUESTION_MESSAGE,
                        null,
                        getedPortsArray,
                        getedPortsArray[0]);
                //System.out.println(s);
                //System.out.print("Введите номер  СОМ порта: ");
                //Scanner SCN= new Scanner(System.in);//Сканирроание консоли
                //int COM= SCN.nextInt();//Прием значениия
                //String port="COM"+COM;






                serialPort = new SerialPort(deafultPort);/*Передаем в конструктор суперкласса имя
				порта с которым будем работать*/
                try {
                    serialPort.openPort();/*Метод открытия порта*/
                    serialPort.setParams(SerialPort.BAUDRATE_9600, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);/*Задаем основные параметры протокола UART*/
                    serialPort.setEventsMask(SerialPort.MASK_RXCHAR);/*Устанавливаем маску или список события на которые
		             будет происходить реакция. В данном случае это приход данных в буффер порта*/
                    serialPort.addEventListener(new EventListener());/*Передаем экземпляр класса EventListener порту, где будет обрабатываться события.
		            Ниже описан класс*/
                }
                catch (SerialPortException ex) {
                    System.out.println(ex);
                }
            }
        });
    }
    private static SerialPort serialPort;/*Создаем объект типа SerialPort*/

    public static void main(String[] args){/* Точка входа в программу*/
        readLog log = new readLog();//Создаем обхект своего созданного класса
        log.setVisible(true);//устанавливаем вмдиость
        //этихдвух строк достатоно для запуска окна, но оно не закрыватся
        //Для работы с меню окна используется слушатель window, а за закрытие отвечает адаптер.
        //Прочитала, что событие WindowClosing отвечает за закрытие окна на крестик.
        //А чтобы окно закрывалось используют команду dispose().
        //Button myButton;

        //вешаем событие на созданный объект
        log.addWindowListener(new WindowAdapter() { //для закрытия окна используется слушатель window
            public void windowClosing(WindowEvent e) {//WindowClosing отвечает за закрытие окна на крестик

                //вызывается родитель с методом Закрыть окно,
                //в качестве аргумента отправляют Событие(event), с которым нужно дальше работать для реализации метода.
                //super.windowClosing(e);
                e.getWindow().dispose();//уничтожает объект Frame
            }
        });
    }

    private static class EventListener implements SerialPortEventListener  {

        /*Слушатель срабатывающий по появлению данных на COM-порте*/
        public void serialEvent(SerialPortEvent event) {
            if(event.isRXCHAR() && event.getEventValue() > 0){/*Если происходит событие установленной маски и количество байтов в буфере более 0*/
                try {
                    String data = serialPort.readHexString(event.getEventValue());/*Создаем строковую переменную  data, куда и сохраняем данные*/
                    myLabel.setAlignment(Label.CENTER);
                    myLabel.setText(data);
                    ActionsFromArdruino ActionsFromArdruino=new ActionsFromArdruino();
                    ActionsFromArdruino.Actions(data);
                    //System.out.print(data);

                }
                catch (SerialPortException ex) {
                    System.out.println(ex);
                }
            }
        }
    }
}