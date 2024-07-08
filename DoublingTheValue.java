package FGFCoding;

import java.util.HashSet;
import java.util.Set;

public class DoublingTheValue {
    public static void main(String[] args) {
        int N = 5, B = 3;
        int arr[] = {1,2,3,4,8};
        Set<Integer> store=new HashSet<>();
        for(int i=0;i<N;i++)
        {
            store.add(arr[i]);
        }
//        int i=1;
        int result=0;
        for (int i=0;i<store.size();i++)
        {

            if(!store.contains(B))
            {
                result=B;
                break;
            }
            B=B*(2);
        }
        System.out.println(result);
    }
}
