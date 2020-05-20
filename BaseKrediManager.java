/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odev3;

import java.util.Scanner;


/**
 *
 * @author user
 */
public class BaseKrediManager {
   
    public void hesapla(double tutar){
        Scanner scanner=new Scanner(System.in);
        
        double faiz=2.0;
        
        System.out.println("Ne kadar kredi çekilecek ?");
        int Çekilecektutar = scanner.nextInt();
        System.out.println(tutar);
        
        double kredi=tutar*faiz;
        System.out.println("Faiz sonrası ödenecek tutar:"+kredi);
        
    }
    
}

