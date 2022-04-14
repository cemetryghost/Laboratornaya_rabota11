package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String reg = "((((25[0-5])|(2[0-4]\\d))|((1\\d{2})|(\\d{1,2})))\\.){3}(((25[0-5])|(2[0-4]\\d))|((1\\d{2})|(\\d{1,2})))";
        Scanner in = new Scanner(System.in);
        System.out.print("Enter IP address: ");
        String ip = in.nextLine();
        Pattern pat = Pattern.compile(reg);
        Matcher match = pat.matcher(ip);
        while(match.find()){
            System.out.printf("Correct IP address: %s", match.group());
        }
    }
}