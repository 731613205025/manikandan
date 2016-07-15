/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Fact {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    int f=a;
    for(int i=(a-1);i>1;i--)
    {
        f=f*i;
    }
        System.out.println("fact is"+f);

}
}

    
