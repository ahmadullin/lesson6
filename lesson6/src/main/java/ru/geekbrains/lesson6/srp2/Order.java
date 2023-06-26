package ru.geekbrains.lesson6.srp2;

import java.util.Scanner;

public class Order {
    private String clientName;
    private String product;
    private int qnt;
    private int price;

    public Order(String clientName, String product, int qnt, int price) {
        this.clientName = clientName;
        this.product = product;
        this.qnt = qnt;
        this.price = price;
    }

    public String getClientName() {
        return clientName;
    }

    public String getProduct() {
        return product;
    }

    public int getQnt() {
        return qnt;
    }

    public int getPrice() {
        return price;
    }

    public void inputFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Имя клиента: ");
        clientName = scanner.nextLine();
        System.out.print("Товар: ");
        product = scanner.nextLine();
        System.out.print("Количество: ");
        qnt = scanner.nextInt();
        System.out.print("Цена: ");
        price = scanner.nextInt();
    }
}

