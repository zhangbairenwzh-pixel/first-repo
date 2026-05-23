package com.gaspament.prac;

public class Golden extends Card{
    public Golden(String name, int car_num, int phone, int value) {
        super(name, car_num, phone, value);
    }

    @Override
    public void pay(int value) {
        System.out.println("使用金卡支付,优惠十块钱，当前金额为" + getValue());
        System.out.println("余额为" + getValue());
        setValue(getValue()-value+10);
        if(value > 100) printtic();
        else System.out.printf("当前消费不足一百");
        System.out.println("余额为" + getValue());
    }
public void printtic() {
    System.out.println("打印好了洗车票");
}
}
