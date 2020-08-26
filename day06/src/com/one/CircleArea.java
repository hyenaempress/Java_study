package com.one;

import com.one.Circle;

public class CircleArea {
    public static void main(String[] args) {
     Circle[] c;
     c = new Circle[5];

     for (int i=0; i<c.length ; i++)
         c[i] = new Circle(i); //i번째 원소 객체 생성

        for (int i=0; i<c.length; i++)//배열의 모든 circle 객체의 면적 출력
            System.out.println((int)(c[i].getArea())+" ");
    }
}
