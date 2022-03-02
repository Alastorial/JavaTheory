package ru.web;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Main {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(5080);
        byte[] buffer = new byte[2048];
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length); // создаем пакет, в который кладем буффер и его размер
        while (true) {
            datagramSocket.receive(packet); // кладем в переменную для получения данных
//            System.out.println("лиза пышкина");
//            System.out.println(ds);
            System.out.println(packet.getLength());  // получаем длинну
            byte[] data = packet.getData();  // создаем второй массив как правило хорошего тона (получаем сообщение)
//            System.out.println(data);
            System.out.println(new String(packet.getData(), packet.getOffset(), packet.getLength()));  // Выводим через конструктор класса String сообщение в пакете (офсет - смещение, длина -
            System.out.println(packet.getAddress()); // полчили адрес отправителя
            // loopback address 127.0.0.1
            System.out.println(packet.getPort());  //получили порт
            packet.setLength(packet.getLength());
            datagramSocket.send(packet); // отправили обратно
        }

    }
}
