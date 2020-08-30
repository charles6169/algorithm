package Algorithm.Search;

/**
 * 创建人： 张秦
 * 创建时间：
 * 描述：
 */

public class SearchDemo {
    //    顺序查找
    public int sequentialSearch(int[] arr, int key) {
        for (int i = 0, length = arr.length; i < length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }



    //    二分查找
//    1. 循环的判定条件是：low <= high
//    2. 为了防止数值溢出，mid = low + (high - low)/2
//    3. 当 A[mid]不等于target时，high = mid - 1或low = mid + 1
    public int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
//            找到目标
            if (arr[mid] == target) {
//                注意返回mid
                return mid - 1;
            }
            if (arr[mid] > target) {
//                大于则挪high
                high = mid - 1;

            }
            if (arr[mid] < target) {
//                小于则挪low
                low = mid + 1;
            }
        }
        return -1;
    }

    //    查找目标值区域的左边界/
//    查找与目标值相等的第一个位置/
//    查找第一个不小于目标值数的位置
//    A = [1,3,3,5, 7 ,7,7,7,8,14,14]
//    target = 7  return 4
    public int binarySearchLowerBound(int[] arr, int target) {
        int low = 0;
        int high = target;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (target <= arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
//        此时low已经大于high了
        if (low < arr.length && arr[low] == target) {
            return low;
        } else {
            return -1;
        }
    }

    public int binarySearchUpperBound(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
//        锁定位置
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if (high >= 0 && arr[high] == target) {
            return high;
        } else {
            return -1;
        }

    }

    public static int searchInsert1(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static int searchInsert2(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }


    public static int binaryLeftSearch(int[] nums,int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (right - left) / 2 + left;
            if (nums[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right;
    }

    public static int binaryRightSearch(int[] nums,int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (right - left) / 2 + left;
            if (nums[mid] <= target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return right;
    }





    public int insertValueSearch(int[] arr, int low, int high, int target) {
        if (low > high || target < arr[0] || target > arr[arr.length - 1]) {
            return -1;
        }
        // 求出自适应的 mid
        int mid = low + (high - low) * (target - arr[low]) / (arr[high] - arr[low]);

        if (target > arr[mid]) {
            return insertValueSearch(arr, mid, high, target);
        } else if (target < arr[mid]) {
            return insertValueSearch(arr, low, mid, target);
        } else {
            return mid;
        }

    }

    public static int binSearch(int[] arr, int tar) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while (start + 1 < end) {
            int mid = (end - start) /  2 + start;
            if (arr[mid] == tar) {
                start = mid;
            } else if (arr[mid] > tar) {
                end = mid;
            } else {
                start = mid;
            }
        }
        if (arr[start] == tar) {
            return start;
        }
        if (arr[end] == tar) {
            return end;
        }
        return -1;


    }


}
