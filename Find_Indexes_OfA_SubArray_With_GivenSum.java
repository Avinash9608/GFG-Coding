package FGFCoding;

import java.util.ArrayList;
import java.util.Scanner;

public class Find_Indexes_OfA_SubArray_With_GivenSum {
    private static boolean Zero(int[] arr)
    {
        for(int x:arr)
        {
            if(x!=0)
                return false;
        }
        return true;
    }
    private static ArrayList<Integer>SumArray(int[] arr, int n, int s)
    {
        ArrayList<Integer> result=new ArrayList<>();
        int start=0;
        int end=0;
        int sum=0;
        if(s==0 && n>=1 && Zero(arr))
        {
            result.add(1);
            result.add(1);
            return result;
        }
        System.out.println(Zero(arr));

        if (s == 0) {
            for (int i = 0; i < n; i++) {
                if (arr[i] == 0) {
                    result.add(i + 1);
                    result.add(i + 1);
                    return result;
                }
            }
        }
        if(s==0 && n>=1 && !Zero(arr))
        {
            result.add(-1);
            return result;
        }
        while(end<n)
        {
            sum+=arr[end];
            while (sum>=s)
            {
                if(sum==s)
                {
                    result.add(start+1);
                    result.add(end+1);
                    return result;
                }
                sum-=arr[start];
                start++;
            }
            end++;
        }
        result.add(-1);
        return result;
    }
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter n");
        int n=kb.nextInt();
        System.out.println("Enter sum ");
        int s=kb.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter element ");
        for (int i=0;i<n;i++)
        {
            arr[i]=kb.nextInt();
        }
        ArrayList<Integer> recived=SumArray(arr,n,s);
        System.out.println(recived);
    }
}
