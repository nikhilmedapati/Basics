import java.io.*;
import java.lang.*;
import java.util.*;

class ntooneton{
  static void method(int m){
    if(m>1){
      System.out.print(m+" ");
      method(m-1);
    }
    System.out.print(m+" ");
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    method(n);
  }
}
