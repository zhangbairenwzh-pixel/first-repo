package com.gaspament.prac;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Card {
private String name;
private int car_num;
private int phone;
private int value;

//存金额
    public void save(int value) {
        this.value += value;
    }

    public void pay(int value) {
        this.value -= value;
    }
}
