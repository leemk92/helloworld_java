package com.test.diceGame;
import java.util.Random;
import java.util.Scanner;
 
public class diceGame{
   public static void main(String[] args) {
      
      Scanner scanner = new Scanner(System.in);
      Random random = new Random();
      
      System.out.println("==== 주사위 게임 ====");
      
      int Player[] = new int[20];
      int Com[] = new int[20];
      int i = 1;
      int PlayerSum = 0;
      int ComSum = 0;
      
      System.out.println("y키를 눌러 주사위를 굴려주세요");
      
      while(i<=10) {
      if(scanner.nextLine().equals("y")){
         double ComDouble_number = Math.random();
         int ComInt_Number = (int)(ComDouble_number*10+1); 
         int ComDiceNo = ComInt_Number%6+1;
         System.out.println("--------------------------");
         System.out.print("COM 주사위 값:"+ ComDiceNo);   
         ComSum += ComDiceNo;
         System.out.println("  COM 총합:"+ ComSum);
         System.out.println("--------------------------");
         
         double PlayerDouble_number = Math.random();
         int PlayerInt_Number = (int)(PlayerDouble_number*10+1); 
         int PayerDiceNo = PlayerInt_Number%6+1;
         System.out.print("유저 주사위 값:"+ PayerDiceNo);   
         PlayerSum += PayerDiceNo;
         System.out.println("  유저 총합:"+ PlayerSum);
         System.out.println("================");

         if(PlayerSum==1) {
            System.out.println("*-------------------|");
         } else if(PlayerSum==2) {
            System.out.println("-*------------------|");
         } else if(PlayerSum==3) {
            System.out.println("--*-----------------|");
         } else if(PlayerSum==4) {
            System.out.println("---*----------------|");
         } else if(PlayerSum==5) {
            System.out.println("----*---------------|");
         } else if(PlayerSum==6) {
            System.out.println("-----*--------------|");
         } else if(PlayerSum==7) {
            System.out.println("------*-------------|");
         } else if(PlayerSum==8) {
            System.out.println("-------*------------|");
         } else if(PlayerSum==9) {
            System.out.println("--------*-----------|");
         } else if(PlayerSum==10) {
            System.out.println("---------*----------|");
         } else if(PlayerSum==11) {
            System.out.println("----------*---------|");
         } else if(PlayerSum==12) {
            System.out.println("-----------*--------|");
         } else if(PlayerSum==13) {
            System.out.println("------------*-------|");
         } else if(PlayerSum==14) {
            System.out.println("-------------*------|");
         } else if(PlayerSum==15) {
            System.out.println("--------------*-----|");
         } else if(PlayerSum==16) {
            System.out.println("---------------*----|");
         } else if(PlayerSum==17) {
            System.out.println("----------------*---|");
         } else if(PlayerSum==18) {
            System.out.println("-----------------*--|");
         } else if(PlayerSum==19) {
            System.out.println("------------------*-|");
         } else if(PlayerSum==20) {
            System.out.println("-------------------*|");
         } else {
           System.out.println("--------------------|*"); 
         }
         
         if(ComSum==1) {
            System.out.println("@-------------------|");
         } else if(ComSum==2) {
            System.out.println("-@------------------|");
         } else if(ComSum==3) {
            System.out.println("--@-----------------|");
         } else if(ComSum==4) {
            System.out.println("---@----------------|");
         } else if(ComSum==5) {
            System.out.println("----@---------------|");
         } else if(ComSum==6) {
            System.out.println("-----@--------------|");
         } else if(ComSum==7) {
            System.out.println("------@-------------|");
         } else if(ComSum==8) {
            System.out.println("-------@------------|");
         } else if(ComSum==9) {
            System.out.println("--------@-----------|");
         } else if(ComSum==10) {
            System.out.println("---------@----------|");
         } else if(ComSum==11) {
            System.out.println("----------@---------|");
         } else if(ComSum==12) {
            System.out.println("-----------@--------|");
         } else if(ComSum==13) {
            System.out.println("------------@-------|");
         } else if(ComSum==14) {
            System.out.println("-------------@------|");
         } else if(ComSum==15) {
            System.out.println("--------------@-----|");
         } else if(ComSum==16) {
            System.out.println("---------------@----|");
         } else if(ComSum==17) {
            System.out.println("----------------@---|");
         } else if(ComSum==18) {
            System.out.println("-----------------@--|");
         } else if(ComSum==19) {
            System.out.println("------------------@-|");
         } else if(ComSum==20) {
            System.out.println("-------------------@|");
         } else {
            System.out.println("--------------------|@"); 
         } 
         
         System.out.println("y키를 눌러 주사위를 굴려주세요");
         
         Player[i] = PlayerSum;
         
         if(PlayerSum>=20 && PlayerSum>ComSum){
            System.out.println("<플레이어가 이겼습니다!!>"
                  + "게임을 종료합니다.");
            break;
         }
         else if(PlayerSum>=20 && PlayerSum == ComSum){
            System.out.println("<비겼습니다!!"
                  + "게임을 종료합니다.");
            break;
         }
         else if(ComSum>=20 && ComSum>PlayerSum){
            System.out.println("<플레이어가 졌습니다!!>"
                  + "게임을 종료합니다.");
            break;
         }
   
   }
      } 
      i++; 
      
         }
      }                        