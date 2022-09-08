package com.example.demo.math;

import org.springframework.web.bind.annotation.*;

import java.util.*;

public class MathService {

    public static String calculate(int x, int y, String operation) {

            return switch (operation) {
                case "add" -> String.format("%d + %d = %d", x, y, x + y);
                case "subtract" -> String.format("%d - %d = %d", x, y, x - y);
                case "multiply" -> String.format("%d * %d = %d", x, y, x * y);
                case "divide" -> String.format("%d / %d = %d", x, y, x / y);
                default -> operation;
            };
//            return MathService.calculate(x, y, operation);
    }}

//    public static String sum(List<Integer> n) {
//        int sum = 0;
//        StringBuilder sb = new StringBuilder(); //empty string waiting for information
//
//        for (String number : n.get("n")) {
//            sb.append(number);
//            sb.append(" + ");
//            sum += Integer.parseInt(number);
//
//        }
//        sb.replace(sb.length() - 3, sb.length() -1, " =");
//        sb.append(sum);
//
//
//
//        return sb.toString();
//
//    }
//}
