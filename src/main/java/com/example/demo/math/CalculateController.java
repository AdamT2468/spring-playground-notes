package com.example.demo.math;

import org.springframework.util.*;
import org.springframework.web.bind.annotation.*;

import java.text.*;
import java.util.*;g

@RestController

public class CalculateController {

    @GetMapping("/math/calculate")

    public String getCalculation(@RequestParam(required = false, defaultValue = "add") String operation, int x, int y) {
        return switch (operation) {
            case "add" -> String.format("%d + %d = %d", x, y, x + y);
            case "subtract" -> String.format("%d - %d = %d", x, y, x - y);
            case "multiply" -> String.format("%d * %d = %d", x, y, x * y);
            case "divide" -> String.format("%d / %d = %d", x, y, x / y);
            default -> operation;
        };

    }
//
//    @PostMapping ("/math/sum")
//    public String getSum(@RequestParam List<String> n) {
//        int sum = 0;
//
//        StringBuilder sb = new StringBuilder(); //empty string waiting for information
//
//        for (String number : n.get("n")) {
//            sb.append(number);
//            if (number.equals(n.get(n.size() - 1))) {
//                sb.append(number).append("=").append(sum);
//            }
//            else sb.append(number).append("+");
//            sum += Integer.parseInt(number);
//        }
//
//
//        return sb.toString();
//    }

//    StringBuilder builder = new StringBuilder();
//for (int i = 0; i < words.length; i++) {
//        String word = words[i];
//        if (i == 0) {
//            word = word.isEmpty() ? word : word.toLowerCase();
//        } else {
//            word = word.isEmpty() ? word : Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
//        }
//        builder.append(word);
//    }
//return builder.toString();

    @PostMapping ("/math/sum")
    public String getSum(@RequestParam MultiValueMap<String, String> requestParams) {
        int sum = 0;

        StringBuilder sb = new StringBuilder(); //empty string waiting for information

        for (String number : requestParams.get("n")) {
            sb.append(number);
            sb.append(" + ");
            sum += Integer.parseInt(number);

        }
        sb.replace(sb.length() - 3, sb.length() -1, " =");
        sb.append(sum);



        return sb.toString();
    }
    Double pi = Math.PI;
    DecimalFormat df = new DecimalFormat("0.######");


//        double pi = Math.PI;
    @PostMapping("/math/area")
    public String getArea(@ RequestParam String type,
                          @RequestParam (required = false) Integer radius,
                          @RequestParam (required = false) Integer width, Integer height){
        if (type.equals("rectangle") && radius != null) {
            return ("Invalid");
        }


            return switch (type) {

                case "rectangle" -> String.format("Area of a %dx%d rectangle is %d.", width, height, width * height);
                case "circle" -> String.format("Area of a circle with a radius of %d is %.5f.", radius, (pi * (radius * radius)));
                default -> "";
            };
        }



    }





