package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner in = new Scanner (System.in);
        System.out.println("Введите моему роботу строку и он ее проверит на правильную скобочную последовательность");
	    String var=in.nextLine();
	    RightSign FirstChecker=new RightSign();
        System.out.println(FirstChecker.check(var));
        //
        //
        //
        System.out.println("Пришло время ввести второю строку и робот проверет правильная ли это числовая последовательность");
        var=in.nextLine();
        RightNumber SecondChecker=new RightNumber();
        System.out.println(SecondChecker.check(var));
    }
}
