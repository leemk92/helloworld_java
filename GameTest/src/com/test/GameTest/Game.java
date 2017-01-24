package com.test.GameTest;
import java.util.Random;
import java.util.Scanner;
 
public class Game{
   public static void main(String[] args) {
      
      Scanner scanner = new Scanner(System.in);
      Random random = new Random();
      
      System.out.println("==== 주사위 게임 ====");
      
      int user[] = new int[20];
      int Com[] = new int[20];
      int dice = 1;
      int userSum = 0;
      int ComSum = 0;
      
      System.out.println("y키를 눌러 주사위를 굴려주세요");
      
      while(dice<=10) {
         if(scanner.nextLine().equals("y")){
            while(true) {
               int userDice = (int)(Math.random()*10);
               
               if ((userDice >= 1 && userDice < 7)) {
                  System.out.println("--------------------------");
                   System.out.print("사용자 주사위 값:"+ userDice); 
                   userSum += userDice;
                   System.out.println("  사용자 총합:"+ userSum);
                   System.out.println("--------------------------");
                   break;
               }   
            }
            while(true) {
               int comDice = (int)(Math.random()*10);
               if ((comDice >= 1 && comDice < 7)) {
                  System.out.println("--------------------------");
                   System.out.print("컴퓨터 주사위 값:"+ comDice); 
                   ComSum += comDice;
                   System.out.println("  컴퓨터 총합:"+ ComSum);
                   System.out.println("--------------------------");
                   break;
               }   
            }
    
            if(userSum==1) {
               System.out.println("*-------------------|");
            } else if(userSum==2) {
               System.out.println("-*------------------|");
            } else if(userSum==3) {
               System.out.println("--*-----------------|");
            } else if(userSum==4) {
               System.out.println("---*----------------|");
            } else if(userSum==5) {
               System.out.println("----*---------------|");
            } else if(userSum==6) {
               System.out.println("-----*--------------|");
            } else if(userSum==7) {
               System.out.println("------*-------------|");
            } else if(userSum==8) {
               System.out.println("-------*------------|");
            } else if(userSum==9) {
               System.out.println("--------*-----------|");
            } else if(userSum==10) {
               System.out.println("---------*----------|");
            } else if(userSum==11) {
               System.out.println("----------*---------|");
            } else if(userSum==12) {
               System.out.println("-----------*--------|");
            } else if(userSum==13) {
               System.out.println("------------*-------|");
            } else if(userSum==14) {
               System.out.println("-------------*------|");
            } else if(userSum==15) {
               System.out.println("--------------*-----|");
            } else if(userSum==16) {
               System.out.println("---------------*----|");
            } else if(userSum==17) {
               System.out.println("----------------*---|");
            } else if(userSum==18) {
               System.out.println("-----------------*--|");
            } else if(userSum==19) {
               System.out.println("------------------*-|");
            } else if(userSum==20) {
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
            
            user[dice] = userSum;
            
            if(userSum>=20 && userSum>ComSum){
               System.out.println("<플레이어가 이겼습니다!!>"
                     + "게임을 종료합니다.");
               break;
            }
            else if(userSum>=20 && userSum == ComSum){
               System.out.println("<비겼습니다!!"
                     + "게임을 종료합니다.");
               break;
            }
            else if(ComSum>=20 && ComSum>userSum){
               System.out.println("<플레이어가 졌습니다!!>"
                     + "게임을 종료합니다.");
               break;
            }
      
      }
         } 
         dice++; 
         
            }
         } 

   