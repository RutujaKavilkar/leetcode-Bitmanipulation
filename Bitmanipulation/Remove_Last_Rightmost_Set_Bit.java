class Main {
    public static int removeLastSetBit(int n)
    {
        return n & (n-1);

    }
    public static void main(String[] args) {
        int n=13;
        System.out.println(removeLastSetBit(n));
    }
}