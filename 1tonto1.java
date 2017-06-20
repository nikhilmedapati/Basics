import java.io.*;
import java.lang.*;
import java.util.*;

class onetontoone{
  static void method(int m,int n){
    if(m<n){
      System.out.print(m+" ");
      method(m+1,n);
    }
    System.out.print(m+" ");
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    method(1,n);
  }
}
