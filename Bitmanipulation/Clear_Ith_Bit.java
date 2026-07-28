class Main {
    public static int clearIthBit(int num,int i)
    {
        return num & ~(1<<i);
    }
    public static void main(String[] args) {
        int num=123;
        int i=2;
        int result=clearIthBit(num,i);
        System.out.println(result);
    }
}