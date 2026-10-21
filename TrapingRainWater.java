import java.util.*;

public class TrapingRainWater{

    public static void trapingRainWater(int height[]){

        int n = height.length;

        //left max boundary
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i=1; i<n; i++){
            if(height[i] > leftMax[i-1]){
                leftMax[i] = height[i];
            }else{
                leftMax[i] = leftMax[i-1];
            }
        }

        //right max boundary
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            if(height[i] > rightMax[i+1]){
                rightMax[i] = height[i];
            }else{
                rightMax[i] = rightMax[i+1];
            }
        }
        
        int WT = 0;

        //water level
        for(int i=0; i<n; i++){
            int WL = Math.min(leftMax[i],rightMax[i]);
            WT += WL - height[i];
        }

        System.out.print(WT);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int height[] = {4,2,0,6,3,2,5};
        trapingRainWater(height);
    }
}