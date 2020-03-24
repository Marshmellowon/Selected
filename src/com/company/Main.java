package com.company;

public class Main {

    public static void main(String[] args) {
        // F를 받을 경우의 수 구하기
        String[] arr = { "부정행위", "1시간씩 15회", "5일 결석" };
        Select se = new Select();
        se.sel(1, arr);
        se.sel(2, arr);
        se.sel(3, arr);
    }
}
