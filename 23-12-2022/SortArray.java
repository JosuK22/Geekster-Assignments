
class Solution {
    
    public void merge(int[] arr, int l, int mid , int r) {

        int[] a = new int[mid - l + 1];
        int[] b = new int[r - mid];
        int x = mid - l + 1;
        int y = r - mid;
        for(int i = 0 ; i <x ; i ++){
            a[ i] = arr[i +  l];
        }
        
        for(int j = 0; j < y ; j++) {
         
            b[j] = arr[j + mid + 1];
        }
        
        int i = 0 ;
        int j = 0 ;
        
        int st = l ;
        
        while(i < x && j < y) {
            
            if(a[i] < b[j]) {
                arr[st++] = a[i++];
            }
            else 
                arr[st++] = b[j++];
        }
        
        while(i < x) {
             arr[st++] = a[i++];
        }
        
        while(j < y) {
            arr[st++] = b[j++];
        }
    }
    public void mergeSort(int[] arr, int l ,int r) {
        
        if( l < r) {
            
            int mid = l + ( r - l) /2;
            this.mergeSort(arr, l, mid);
            this.mergeSort(arr, mid + 1, r);
            this.merge(arr, l, mid , r);
        }
    }
    public int[] sortArray(int[] nums) {
            
        this.mergeSort(nums, 0, nums.length-1);
        return nums;
    }
}