package com.example.springboottutorial.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {

    public static void main(String[] args) {

        String input = "111114444226675539";

        char[] arr = input.toCharArray();
        int count=0;
        for(int i=0; i<arr.length; i++){
            char first = arr[i];    //1
            if(arr[i] == first){
               count++;
            }else{
                System.out.println(arr[i--]+count);
                first = arr[i];
            }
        }

//
//        List<String> array = new ArrayList<>(Arrays.asList(arr));
//        array.stream().map(x -> x.toString()).forEach(System.out::println);
//
//        input 11111 4444 22 66 7 55 39 output 1544226271523191
    }
}
