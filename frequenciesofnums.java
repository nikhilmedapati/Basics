import java.io.*;
import java.lang.*;
import java.util.*;

class Frequencies{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Number of elements : ");
    int n = sc.nextInt();
    int a[] = new int[n];
    int max = 0;
    int min = Integer.MAX_VALUE;
    for(int i=0;i<n;i++){
      a[i] = sc.nextInt();
      if(a[i]>max)
        max = a[i];
      if(a[i]<min)
        min = a[i];
    }
    int count[] = new int[max-min+1];
    for(int i=0;i<n;i++){
      count[a[i]-min]++;
    }
    for(int i=0;i<max-min+1;i++){
      if(count[i]!=0)
        System.out.println((i+min)+" : "+count[i]);
    }
  }
}
