package FGFCoding;
import java.util.ArrayList;
public class Find_Indexes_of_a_subarray_with_given_sum {
    public static void main(String[] args) {
//        int n=5;
//        int s=12;
//        int arr[] = {1,2,3,7,5};
        int n=10;
        int s=15;
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer> result=new ArrayList<>();
        int sum;
        for(int i=0;i<n;i++)
        {
            ArrayList<Integer> store=new ArrayList<>();
            sum=0;
            for(int j=i;j<n;j++)
            {
                sum+=arr[j];
                store.add(j);
                if(sum==s)
                {
                   result.add(i+1);
                   result.add(j+1);
                    System.out.println(result);
                   System.exit(0);
                }
            }
        }
    }
}
