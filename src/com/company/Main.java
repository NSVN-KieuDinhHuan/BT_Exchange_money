package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double VND, USD;
        double rate=23000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số tiền usd");
        USD=scanner.nextDouble();
        VND=USD*rate;
        System.out.println("Giá trị VND là: "+VND);

    }
}
