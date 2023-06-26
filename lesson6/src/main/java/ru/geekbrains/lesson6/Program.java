package ru.geekbrains.lesson6;

import ru.geekbrains.lesson6.srp2.JsonOrderSaver;
import ru.geekbrains.lesson6.srp2.Order;



    /**
     * TODO: Задача 1. Домашняя работа. Оптимизировать работу класса Order в  рамках принципа SRP.
     * @param args
     */

public class Program {
        public static void main(String[] args) {
            System.out.println("Введите заказ:");
            Order order = new Order("", "", 0, 0);
            order.inputFromConsole();
            JsonOrderSaver saver = new JsonOrderSaver();
            saver.save(order);
        }
    }