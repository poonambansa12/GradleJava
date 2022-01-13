package Problems;

public class RotateArray {

    public static void main(String[] args) {
        rotate(new int[]{2,10,3,20,1},2);
    }

    public static void rotate(int[] nums, int k) {
        int[] arr=new int[nums.length];

        for (int i=0;i<nums.length;i++)
        {
            System.out.println("Inside 1st loop");
            System.out.println((i+k)%arr.length);
            arr[(i+k)%arr.length]=nums[i];
        }
        System.arraycopy(arr, 0, nums, 0, arr.length);

        for (int j : arr) {
            System.out.println(j);
        }
    }
}
