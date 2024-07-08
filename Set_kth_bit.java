package FGFCoding;

public class Set_kth_bit {
    public static void main(String[] args) {
        int n=384;
        int k=7;
        String binaryForm=Integer.toString(n,2);
        char[] charArr=binaryForm.toCharArray();
        charArr[k-1]='1';
        String res=new String(charArr);
        int x=Integer.parseInt(res);
        System.out.println(x);
        int sum=0;
        int i=0;
        while (res.length()>i)
        {
            int digit=(res.charAt(res.length()-1-i)-'0');
            sum+=digit*Math.pow(2,i);
            i++;
        }
        System.out.println(sum);
    }
}
