package lesson2.hw.server.task2;

import java.sql.SQLOutput;

public class Developer implements FullStack{

    @Override
    public void createServer() {
        System.out.println("сделали сервер");
    }

    @Override
    public void createFront() {
        System.out.println("сделали фронт");
    }
}
