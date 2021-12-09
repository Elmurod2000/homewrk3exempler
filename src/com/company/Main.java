package com.company;

public class Main {

    public static void main(String[] args) {
        double[] numbers = {1, 2, 3, -4, 5, 6, 7, 8, -9, 10, 12, 13, 14, 45};
        double phone=0;
        int today=0;
        boolean result=false;
        for (double can: numbers)
        if (can<0){
            result=true;
        }
        else{
            if(result)
            {
                today++;
                phone += can;
            }
        }
            System.out.println("Средное апифметическое "+phone/today);
    }
}
