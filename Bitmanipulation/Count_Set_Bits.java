class Main {
    public static int countSetBits(int num)
    {
        int count=0;
        while(num>0)
        {
            if((num&1)==1) // num%2==1
            {
                count++;

            }
            num=num>>1; //n=n/2;
        }
        return count;
    }
    public static void main(String[] args) {
        int n = 13;
        System.out.println(countSetBits(n));
    }
}