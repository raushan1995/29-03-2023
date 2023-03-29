package com.cg.raushan;

import java.util.*;

class Main
{
 public static void main(String args[])
 {
 Scanner k=new Scanner(System.in);
 int n,score,target;         //n is number of format
 float overs;
 System.out.println("Enter the Cricket Format\n1.ODI\n2.T20\n3.Test");
 n=k.nextInt(); 
 if(n<1||n>3)
 {
 System.out.println("Invalid Format type");
 System.exit(0);
 }
 System.out.println("Enter the Current Score");
 score=k.nextInt();
 System.out.println("Enter the Current over");
 overs=k.nextFloat();
 System.out.println("Enter the Target");
 target=k.nextInt();
 int balls=0;
 float rr=0;
 switch(n)
 {
 case 1:   //for ODI format
 ODI obj=new ODI(score,overs,target);
 balls=obj.calculateBalls();
 rr=obj.calculateRunrate();
 break;
 case 2:    //for T20 format
 T20 obj1=new T20(score,overs,target);
 balls=obj1.calculateBalls();
 rr=obj1.calculateRunrate();
 break;
 case 3:    //for Test format
 Test obj2=new Test(score,overs,target);
 balls=obj2.calculateBalls();
 rr=obj2.calculateRunrate();
 break;
 default:   //for other format
 System.out.println("Invalid format type");
 break;
 }
 // for all the needs print
 System.out.println("Requirements:");       
 if(balls==1&&(target-score)>1)
	 System.out.println("Need "+(target-score)+" Runs in "+balls+" ball");
 else if ((target-score)==1&&balls>1)
 System.out.println("Need "+(target-score)+" Run in "+balls+" balls");
 else if(balls==1&&(target-score)==1)
 System.out.println("Need "+(target-score)+" Run in "+balls+" ball");
 else
 System.out.println("Need "+(target-score)+" Runs in "+balls+" balls");

 System.out.printf("Require Run Rate - %.2f",rr);
}
}

