package com.gaspament.prac;

public class Silver extends Card{
    public Silver(String name, int car_num, int phone, int value) {
        super(name, car_num, phone, value);
    }
    @Override
    public void pay(int value) {
        setValue(getValue()-value);
    }
}
