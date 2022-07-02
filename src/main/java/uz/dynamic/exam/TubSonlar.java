package uz.dynamic.exam;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TubSonlar {

    void tub_sonlar(int n){
        boolean prime[] = new boolean[n+1];
        for(int i=0;i<n;i++)
            prime[i] = true;
        for(int p = 2; p*p <=n; p++){
            if(prime[p] == true){
                for(int i = p*2; i <= n; i += p) prime[i] = false;
            }
        }
        Integer result = 1;
        for(int i = 2; i <= n; i++){
            if(prime[i] == true) {
                result = result * i;
                System.out.print(i + " ");
            }
        }
        String tempStr = String.valueOf(result);
        System.out.println(tempStr);
        int countZero = 0;
        for(int i = 0 ; i < tempStr.length() ; i ++){
            countZero = tempStr.charAt(i)=='0' ? countZero+1 : 0;
        }
        System.out.println("Nollar soni: " + countZero);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("N sonini kiriting: ");
        int n = sc.nextInt();
        TubSonlar g = new TubSonlar();
        g.tub_sonlar(n);
    }
}