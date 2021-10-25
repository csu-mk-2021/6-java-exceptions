package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        /*
        new Task06Main().printMethodName();
         */
    }

    void printMethodName() {
        StackTraceElement[] trace = Thread.currentThread().getStackTrace();
        System.out.print(trace[2].getMethodName());
    }

}