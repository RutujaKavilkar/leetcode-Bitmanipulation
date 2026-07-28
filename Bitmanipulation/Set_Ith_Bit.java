class Main {
    public static int setIthBit(int num,int i)
    {
        return num | (1<<i);
    }
    public static void main(String[] args) {
        int num=10;
        int i=1;
        int result=setIthBit(num,i);
        System.out.println(result);
    }
}