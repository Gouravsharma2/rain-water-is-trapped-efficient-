import java.util.*;
public class arrays {
  public static int trappedrainwater(int height []) {
    int n = height.length;
    int leftmax[]= new int[n];
    leftmax[0]=height[0];
    for (int i =1 ;i < n;i++ ) {
      leftmax[i]= Math.max(height[i], leftmax[i-1]);
    }
    int rightmax[]=new int [height.length];
    rightmax[n-1] = height[n-1];
    for (int i= n-2 ;i>=0;i--) {
      rightmax[i] = Math.max(height[i],rightmax[i+1]);
    }
    int trappedlevel=0;
    for(int i=0;i<n;i++) {
      int waterleavel = Math.min(leftmax[i],rightmax[i]);
       trappedlevel += waterleavel - height[i];
    }
    return trappedlevel;
  }
  public static void main (String args[]) {
    int height[] = {4,2,0,6,3,2,5};
    System.out.println(trappedrainwater(height));
  }
}