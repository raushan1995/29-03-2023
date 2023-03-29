package com.cg.raushan;

abstract class Match                 //Abstract class
{
 int currentScore,target;           //Parameter
 float currentOver;
 abstract float calculateRunrate();
 abstract int calculateBalls();           //method for calculate balls
}
