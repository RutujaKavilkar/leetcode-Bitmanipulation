
class Main {

    public static int function(int n)
    {
        if(n%4==1) return 1;
        else if(n%4==2) return n+1;
        else if(n%4==3) return 0;
        else return n;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(function(n));
    }
}

//    N=1            1^2             1
//   N=2             1^2^3           3
//   N=3             1^2^3^4         0
//   N=4             1^2^3^4         4

//   N=5             1^2^3^4^5       1
//  N=6              1^2^3^4^5^6     7
//  N=7              1^2^3^4^5^6^7   0
//  N=8              1^2^3^4^5^6^7^8 8
