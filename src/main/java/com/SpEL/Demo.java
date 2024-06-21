package com.SpEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
    @Value("#{22+11}")
    private int x;
    @Value("#{10+10+10}")
    private int y;

    @Value("#{ T(java.lang.Math).sqrt(25) }")
    private double z;

    @Value("#{ T(java.lang.Math).PI }")
    private double PI;

    @Value("#{ new java.lang.String('Rutvik Jasani') }")
    private String name;

    @Value("#{3>2}")
    private boolean status;

    @Override
    public String toString() {
        return "Demo{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", PI=" + PI +
                ", name='" + name + '\'' +
                ", status=" + status +
                '}';
    }
}
