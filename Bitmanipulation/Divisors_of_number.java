
class Main {
    public static void divisors(int n)
    {
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.println(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        divisors(36);
    }
}

import java.util.*;
class Main{
    public static void divisors(int n)
    {
        List<Integer> list=new ArrayList<>();
        for(int i=1;i*i<=n;i++)
        {
            if(n%i==0)
            {
                list.add(i);
                if(i!=n/i)
                {
                    list.add(n/i);
                }
            }
        }

        Collections.sort(list);
        for(int num:list)
        {
            System.out.println(num+" ");
        }}
    public static void main(String[] args)
    {
        divisors(36);
    }
}