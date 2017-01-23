 
package com.test.diceGame2;
import java.util.Random;
import java.util.Scanner;
 
public class diceGame2{
   public static void main(String[] args) {
      
      Scanner scanner = new Scanner(System.in);
      Random random = new Random();
      
      System.out.println("==== 주사위 게임 ====");
      
      int dice = 0;
      int userSum = 0;
      int comSum = 0;
      
      System.out.println("y키를 눌러 주사위를 굴려주세요");
      
      while(true) {
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
                   comSum += comDice;
                   System.out.println("  컴퓨터 총합:"+ comSum);
                   System.out.println("--------------------------");
                   break;
               }   
            }
            
            String[] userLine = new String[30];
            String[] comLine = new String[30];
            
            for (int i=0; i<20; i++) {
               userLine[i] = ".";
               comLine[i] = ".";
            }
            
            userLine[userSum] = "*";
            comLine[comSum] = "@";   
            
            for (int i=1; i<20; i++) {
               System.out.print(userLine[i]);
            }
            System.out.println();
            for (int i=1; i<20; i++) {
               System.out.print(comLine[i]);
            }

             System.out.println("\n y키를 눌러 주사위를 굴려주세요");
            
             if(userSum>=20 && userSum>comSum) {
                System.out.println("<플레이어가 이겼습니다!!>"+"게임을 종료합니다.");
                break;
             } else if(userSum>=20 && userSum == comSum) {
                  System.out.println("<비겼습니다!!"+"게임을 종료합니다.");
                  break;
             } else if(comSum>=20 && comSum>userSum) {
                System.out.println("<플레이어가 졌습니다!!>"+"게임을 종료합니다.");
                break;
            }
         }
      }
     dice++;
   }
}
         
      

   