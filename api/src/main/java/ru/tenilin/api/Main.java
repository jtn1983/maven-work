package ru.tenilin.api;

import ru.tenilin.db.MyEntity;
import ru.tenilin.service.MyService;

public class Main {
    public static void main(String[] args) {
        MyService myService = new MyService();
        System.out.println(myService.getMyEntity());
        System.out.println(myService.setMyEntity(new MyEntity("second")));
        System.out.println(myService.getMyEntity());
    }
}
