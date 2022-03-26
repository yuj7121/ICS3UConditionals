/*
Name: Yujin Bae
Teacher: mr. guglielmi
Date: October 13, 2020
Describtion: ICS 3U 10B Conditional Structures in Java
This program will allow the user to input 3 integers.
It will determine which value is the smallest and output it to the user.
*/

import java.awt.*;
import hsa.Console;

public class Conditionals
{
    Console c;
    int num1;
    int num2;
    int num3;

    public void askData ()
    {
	drawTitle ();

	c.println ("please input the first integer");
	num1 = c.readInt ();
	c.println ("please input the second integer");
	num2 = c.readInt ();
	c.println ("please input the third integer");
	num3 = c.readInt ();

    }


    public void displayData ()
    {
	if (num1 < num2 && num1 < num3)
	    c.println ("The smallest integer is: " + num1);
	else if (num2 < num1 && num2 < num3)
	    c.println ("The smallest integer is: " + num2);
	else
	    c.println ("The smallest integer is: " + num3);


    }


    private void drawTitle ()
    {
	c.print (' ', 34);
	c.println ("Conditionals");
	c.println ();
    }


    public Conditionals ()
    {
	c = new Console ();
    }


    public static void main (String[] args)
    {
	Conditionals m;
	m = new Conditionals ();
	m.askData ();
	m.displayData ();
    } // Main Method
} // Conditionals Method

