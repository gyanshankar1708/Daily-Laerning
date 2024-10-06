
// Real life example -> Dictonary


// class Search{
//     //  Iterative Function
//     boolean binSearch(int[] arr,int search){
//         int l = 0,r = arr.length-1;
//         while (l<=r){
//             int mid = (l+r)/2;
//             if (arr[mid] == search){
//                 return true;
//             }
//             else if (arr[mid]>search){
//                 r = mid-1;
//             }
//             else{
//                 l = mid+1;
//             }
//         }
//         return false;
//     }

//     //  Recursive Function
//     boolean recBinSearch(int[] arr,int search,int l,int r){
//         if (l<=r){
//             int mid = (l+r)/2;
//             if (arr[mid]==search){
//                 return true;
//             }
//             else if (arr[mid]>search){
//                 return recBinSearch(arr, search, l, mid-1);
//             }
//             else{
//                 return recBinSearch(arr, search, mid+1, r);
//             }
//         }
//         return false;
//     }
// }
// public class Demo {
//     public static void main(String[] args) {
//         int[] arr = {3,4,6,7,9,12,16,17};
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();
//         Search s = new Search();
//         System.out.println(s.binSearch(arr,x));
//         System.out.println(s.recBinSearch(arr, x, 0, arr.length-1));
//         sc.close();
//     }    
// }


// //  Binary search for Lower bound and Upper bound

// class Search{
//     int lowerBound(int[] arr,int x){
//         int l = 0,r = arr.length-1;
//         int ans = arr.length;
//         // if (arr[arr.length-1]<x){
//         //     return ans;
//         // }
//         while(l<=r){
//             int mid = (l+r)/2;
//             if (arr[mid]>=x){     // In case of uppper bound we have to check arr[mid]>x
//                 ans = mid;
//                 r = mid-1;
                
//             }
//             else{
//                 l = mid+1;
//             }
//         }
//         return ans;
//     }
// }


// public class Demo {
//     public static void main(String[] args) {
//         Search s = new Search();
//         int[] nums = {1,2,3,3,7,8,9,9,9,11};
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         System.out.println(s.lowerBound(nums,a));
//     }
// }



// //  Ceil and Floor in sorted array 

// class CeilNFloor{
//     int ceil(int[] arr,int x){
//         int ans = -1;
//         int l=0,r = arr.length-1;
//         while (l<=r){
//             int mid = (l+r)/2;
//             if (arr[mid]>=x){
//                 ans = arr[mid];
//                 r = mid-1;
//             }
//             else{
//                 l = mid+1;
//             }
//         }
//         return ans;
//     }
//     int floor(int[] arr,int x){
//         int ans = 0;
//         int l = 0,r = arr.length-1;
//         while (l<=r){
//             int mid = (l+r)/2;
//             if (arr[mid]<=x){
//                 ans = arr[mid];
//                 l = mid+1;
//             }
//             else{
//                 r = mid-1;
//             }
//         }
//         return ans;
//     }
// }


// public class Demo {

//     public static void main(String[] args) {
//         CeilNFloor cf = new CeilNFloor();
//         int[] arr = {10,20,30,40,50};
//         System.out.println(cf.ceil(arr, 25));
//         System.out.println(cf.floor(arr, 25));
//     }
// }



//  First and last occurance

class Occurance{
    int firstOccurance(int[] arr,int x){
        int l = 0,r = arr.length-1;
        int ans = -1;
        while (l<=r){
            int mid = (l+r)/2;
            if (arr[mid]==x){
                ans = mid;
                r = mid-1;
            }
            else if (arr[mid]>x){
                r = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return ans;
    }
    int lastOccurance(int[] arr,int x){
        int ans = -1;
        int l = 0,r = arr.length-1;
        while (l<=r){
            int mid = (l+r)/2;
            if (arr[mid]==x){
                ans = mid;
                l = mid+1;
            }
            else if(arr[mid]<x){
                l = mid+1;
            }
            else{
                r = mid-1;
            }
        }
        return ans;
    }
}

public class Demo {
    public static void main(String[] args) {
        Occurance o = new Occurance();
        int[] nums = {2,4,6,8,8,8,11,13};
        System.out.println(o.firstOccurance(nums, 11));
        System.out.println(o.lastOccurance(nums, 11));
    }
}