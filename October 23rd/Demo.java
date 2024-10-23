class Solution {
    private int countcondition(int[] nums,int val){
        int count=0;
        for(int x:nums){
            if (x>=val){
                count++;
            }
        }
        return count;
    }
    private int largest(int[] nums){
        int val = Integer.MIN_VALUE;
        for(int x:nums){
            val = Math.max(val,x);
        }
        return val;
    }
    public int specialArray(int[] nums) {
        int low = 0;
        int high = largest(nums);
        while (low<=high){
            int mid = low+(high-low)/2;
            int x = countcondition(nums,mid);
            System.out.printf("mid = %d  x = %d\n",mid,x);
            if (x==mid) {
                return mid;
            }
            else if(x>mid) low = mid+1;
            else high = mid-1;
        }
        return -1;
    }
}

/**
 * Demo
 */
public class Demo {

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {0,4,3,0,4};
        System.out.println(s.specialArray(arr));
    }
}