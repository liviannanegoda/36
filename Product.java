package com.example.Sem4HomeWork4.domain;

import lombok.Data;

@Data
public class Product {
    private int id; // идентификатор
    private String phoneModel; // модель телефона
    private String manufacturer; // производитель
    private double price; // стоимость

}
