/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author eduardo.xerxenevsky
 */
public class QueueMultiplier {

    public void findMultiplier(int n) {
        Queue<String> fila = new LinkedList<>();
        fila.add("9");
        int passo = 0;
        while (Integer.parseInt(fila.peek()) % n != 0) {
            fila.add(fila.peek() + "0");
            fila.add(fila.peek() + "9");
            fila.remove();
            passo++;
        }
        System.out.println("O multiplo eh de " + n + " eh " + fila.peek() + " em " + passo + " passos");
    }

    public int writeNum() {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        n = sc.nextInt();
        sc.close();
        return n;
    }

}
