import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    for (int i = 0; i < word.length(); i++)
    {
      String L = word.substring(i, i+1);
      // REPEAT N TIMES
      for (int j = 0; j < N; j++)
      {
        System.out.println(L);
      }
    }
  }

  public static void printNTimes(String word, int N)
  {
    for (i = 10; i > 0; i--)
    {
      for j = 0; j < i; j++
      {
        System.out.println(i);
      }
    }
  }

  public static void printNums()
  {
    
  }

  public static void uprightNumberTriangle(int N)
  {
    for (int row = 1; row <= N; row++)//at some row
    {
      for (int num = 1; num <= row; num++) // print all numbers in that row
      {
        System.out.println(num + " ");
      }
      System.out.println(); //blank line in between rows
    }

  }

  public static void starTree()
  {
    // code solution here
  }

  public static void multTable()
  {
    for (int row = 1; row <= 10; row++)
    {
      for (int num = 1; num <= 10; num++)
      {
        System.out.println(row * (num + 1));
      }
      System.out.print(" ")
    }


  }
}
