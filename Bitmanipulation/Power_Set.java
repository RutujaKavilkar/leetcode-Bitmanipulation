import java.util.*;

class Main {

    public static List<List<Integer>> powerSet(int[] arr) {

        List<List<Integer>> ans = new ArrayList<>();

        int n = arr.length;

        int total = 1 << n;   // 2^n subsets

        for(int num = 0; num < total; num++) {

            List<Integer> list = new ArrayList<>();

            for(int i = 0; i < n; i++) {

                // check if ith bit is set
                if((num & (1 << i)) != 0) {
                    list.add(arr[i]);
                }
            }

            ans.add(list);
        }

        return ans;
    }


    public static void main(String[] args) {

        int arr[] = {1,2,3};

        System.out.println(powerSet(arr));
    }
}