package ru.web;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Tcp {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8090);
        Socket accept = serverSocket.accept();// сохранение того, кто соединил с нами соединение + принятие данных (открыть)
        Scanner scanner = new Scanner(accept.getInputStream());

        OutputStreamWriter writer = new OutputStreamWriter(accept.getOutputStream());
        writer.write("DRUGdiller");
        writer.flush(); // сохраняем запись на отправку обратно и отправляем на сервер
        while (scanner.hasNext()) {
            System.out.println(scanner.next()); // некст - читаем до пробела (выводим данные)
            // можно в браузере в ссылке забить 127,0,0,1:порт
        }
    }
}
