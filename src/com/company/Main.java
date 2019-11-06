package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        StopWatch st = new StopWatch();
        Main m = new Main();
        st.start();
        m.sort(m.createArray());
        st.stop();
        System.out.println("Thời gian thực thi là: " + st.getElapsedTime());
    }

    public int[] createArray() {
        Random rd = new Random();
        int[] arr = new int[100000];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(100000);
        }
        return arr;
    }

    public void sort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
