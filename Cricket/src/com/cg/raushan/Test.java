package com.cg.raushan;

class Test extends Match            //inheritance(extend match class)
{
 public Test(int score, float over, int target)        //parameter
 {
 super.currentScore=score;
 super.currentOver=over;
 super.target=target;
 }
 int calculateBalls()                    //calculate ball function
 {

 String k= new Float(super.currentOver).toString();
 String p=k.substring(k.indexOf('.')+1,k.length());
 int balls=Integer.parseInt(p);
 balls=540-(balls+((int)super.currentOver*6));      //to calculate ball remain
 return balls;
 }
 float calculateRunrate()              //to calculate run rate
 {

 int balls=this.calculateBalls();                   //to save in balls variable
 float rr=((super.target-super.currentScore)/(float)(balls)*6);           //formula to calculate run rate
 rr = Float.parseFloat(String.format("%.3f", rr));
 return rr;
 }
}
