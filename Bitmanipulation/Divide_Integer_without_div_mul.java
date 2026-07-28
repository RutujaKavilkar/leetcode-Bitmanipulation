class Main {
    public static int divide(int dividend,int divisor)
    {
        if(dividend==Integer.MIN_VALUE && divisor==-1)
        {
            return Integer.MAX_VALUE;
        }
        int sign=((dividend<0)^(divisor<0))?-1:1;
        long n=Math.abs((long) dividend);
        long d=Math.abs((long) divisor);
        int ans=0;
        while(n>=d)
        {
            int count=0;
            while(n>=d*Math.pow(2,count+1))
            {
                count++;
            }
            ans+=Math.pow(2,count);
            n-=d*Math.pow(2,count);

        }
        return sign*ans;
    }
    public static void main(String[] args) {
        System.out.println(divide(22,3));
    }
}