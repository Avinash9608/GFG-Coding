package FGFCoding;
public class GreaterOnRightSide {
    public static void main(String[] args) {
        int n=6;
        int arr[]={16,17,4,3,5,2};
        int gtr=-1;
        int[] res=new int[n];
        res[n-1]=-1;
        for(int i=n-1;i>=1;i--)
        {
            int temp=arr[i];
           gtr=Math.max(gtr,temp);
           res[i-1]=gtr;
        }
        for(int x:res)
            System.out.print(x+" ");
    }
}
