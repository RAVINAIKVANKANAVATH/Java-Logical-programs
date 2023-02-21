/*
Write a Java program that takes input from the user in the form of a string and checks whether it is a palindrome or not. Your program should use exception handling to handle the following situations:If the user inputs a non-string value, the program should catch the exception and display an error message to the user.
*/

import java.util.*;
class Exception3
{
Scanner sc=new Scanner(System.in);
  

void palindrom() {
  try{
    System.out.println("enter your string:");
    s=sc.nextLine();
    