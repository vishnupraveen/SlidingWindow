package fixedlength;

public class MaxSumSubArrayK {


    static int maxSum(int[] arr, int k)
    {

        int runningSum=0;
        int maxValue=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            runningSum+=arr[i];

            if(i>=k-1)
            {
                maxValue=Math.max(runningSum,maxValue);

                runningSum-=arr[i-(k-1)];
            }
        }
        return maxValue;


    }
    public static void main(String[] args) {

        System.out.println(maxSum( new int[] {4,2,1,7,8,1,2,8,1,0},3));

    }
}
