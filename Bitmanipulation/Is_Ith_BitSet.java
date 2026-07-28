class Main {
    public static boolean isIthBitSet(int num,int i)
    {
        return (num & (1<<i))!=0;
        // return ((num>>i) & 1)==1;


    }
    public static void main(String[] args) {
        int num=13;
        int i=2;
        if(isIthBitSet(num,i))
        {
            System.out.println("Bit is Set");
        }else{
            System.out.println("Bit is Not Set");
        }
    }
}