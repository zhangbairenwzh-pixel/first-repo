package com.gaspament.prac;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Card gold = new Golden("张jin", 123, 123456789, 5000);
        Card silver = new Silver("张yin", 123, 123456789, 2000);
pay(gold);
    }
    public static void pay(Card card) {
        System.out.println("your value is?");
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        card.pay(money);
    }
}
