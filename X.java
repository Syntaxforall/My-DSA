public class X {
    public static void main(String[] args) {
        int[] nums={2,0,2,1,1,0};
        sortColors(nums);
    }
    public static void sortColors(int[] nums) {
        int t=0;
        int b=nums.length-1;
        int mid=(t+b)/2;
        for(int i=0;i<nums.length;i++){
            int temp=0;
            if(nums[i]==0){
                temp=nums[i];
                nums[i]=nums[t];
                nums[t]=temp;
                t++;
            }
            if(nums[i]==2){
                temp=nums[i];
                nums[i]=nums[b];
                nums[b]=temp;
                System.out.println(nums[b]+" ");
                b--;
            }
            if(nums[i]==1){
                temp=nums[i];
                nums[i]=nums[mid];
                nums[mid]=temp;
                System.out.println(nums[mid]+" "+mid);
                mid++;
            }
        }
        for(int i:nums){
            System.out.print(i+" ");
        }
    }
}
