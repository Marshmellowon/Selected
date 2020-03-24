package com.company;

/**
 * Select
 */
public class Select {

    public void sel(int n, String[] a) {
        int[] selected = new int[n]; // 출력할 배열
        print(n, a, 0, selected);
    }

    /*
     * n = 뽑는 개수 String[]a = main에 선언된 배열 r = 시작하는 위치 selected = 뽑은 String 저장
     */
    public void print(int n, String[] a, int r, int[] selected) {
        if (n == 0) { // 뽑을개수가 0이 되었을때
            for (int i = 0; i < selected.length; i++) {
                System.out.println(a[selected[i]] + " ");
            }
            System.out.println();
            return;
        } else {
            for (int i = r; i < a.length; i++) {
                selected[selected.length - n] = i;
                print(n - 1, a, i + 1, selected);

            }
        }
    }
}

// 총 7가지의 경우의 수가 나온다.