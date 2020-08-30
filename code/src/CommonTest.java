import java.util.*;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class CommonTest {
    public static void main(String[] args) {
        String address = "255.100.50.0";
//        System.out.println(defangIPaddr(address));
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
//        System.out.println(canPartition(nums));

//        System.out.println(numberOfSteps(14));


//        System.out.println(subtractProductAndSum(234));
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {0};
//        canBeEqual(arr1, arr2);
//        missingNumber();


    }


    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int res=0;
        for(int i=0;i<nums[nums.length-1];i++){
            if(!set.contains(i)){
                res= i;
            }
        }
        return res;
    }



    public static boolean canBeEqual(int[] target, int[] arr) {
        sort(arr);
        sort(target);

        int n = target.length;
        int m = arr.length;
        if (m != n) {
            return false;
        }
        for (int i = 0; i < n; i++) {
            if (target[i] != arr[i]) {
                return false;
            }
        }
        return true;
    }

    public static void sort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 1; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j - 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                }
            }
        }
    }

    public static int subtractProductAndSum(int n) {
        String temp = String.valueOf(n);
        char[] chars = temp.toCharArray();
        int a = 1;
        int b = 0;
        for (char c : chars) {
            a *= Integer.valueOf(c - '0');
            b += Integer.valueOf(c - '0');
        }
        return a - b;
    }

    public static int findNumbers(int[] nums) {
        int res = 0;
        for (int num : nums) {
            String temp = String.valueOf(num);
            if (temp.length() % 2 == 0) {
                res++;
            }
        }
        return res;
    }

    public static int numberOfSteps(int num) {
        int res = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num -= 1;
            }
            res++;
        }
        return res;
    }

    public static String defangIPaddr(String address) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.') {
                stringBuffer.append("[.]");
            } else {
                stringBuffer.append(address.charAt(i));
            }
        }
        return stringBuffer.toString();
    }


    public static boolean canPartition(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
        for (int num : nums) {
            sum += num;
        }
        if (sum % 2 == 1) {
            return false;
        }
        int temp = 0;
        int i = 0;
        if (sum % 2 != 1) {
            int half = sum / 2;
            while (temp < half) {
                temp += nums[i++];
            }
            if (temp == half) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }

    }
}
