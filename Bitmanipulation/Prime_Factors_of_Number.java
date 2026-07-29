
 class Main {
     public static void primeFactors(int n)
     {
         for(int i=2;i<=n;i++)
         {
             while(n%i==0)
             {
                 System.out.println(i+" ");
                 n=n/i;
             }
         }
     }
     public static void main(String[] args) {
         primeFactors(36);
     }
 }

 class Main{
     public static void primeFactors(int n)
     {
         for(int i=2;i*i<=n;i++)
         {
             while(n%i==0)
             {
                 System.out.println(i+" ");
                 n=n/i;
             }
         }
         if(n>1)
         {
             System.out.println(n);
         }
     }

     public static void main(String[] args)
     {
         primeFactors(36);
     }
 }


 import java.util.*;
 class Main{
     public static List<Integer> primeFactors(int n)
     {
         List<Integer> list=new ArrayList<>();
         for(int i=2;i*i<=n;i++)
         {
             while(n%i==0)
             {
                 list.add(i);
                 n=n/i;
             }
         }
         if(n>1)
         {
             list.add(n);
         }
         return list;
     }
     public static void main(String[] args) {
         System.out.println(primeFactors(36));
     }
 }

import java.util.*;
class Main{
    public static Set<Integer> primeFactors(int n)
    {
        Set<Integer> set=new HashSet<>();
        for(int i=2;i*i<=n;i++)
        {
            while(n%i==0)
            {
                set.add(i);
                n=n/i;
            }
        }
        if(n>1)
        {
            set.add(n);
        }
        return set;
    }

    public static void main(String[] args) {
        System.out.println(primeFactors(36));
    }
}