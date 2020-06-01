package dynamicvariant;

public class SmallestSumGreaterThanK {

    static int minSize(int[] arr, int k)
    {
        int minSize=Integer.MAX_VALUE;
        int windowStart=0;

        int currentWindowSum=0;

        for (int windowEnd = 0; windowEnd <arr.length ; windowEnd++) {

            currentWindowSum+=arr[windowEnd];

            while(currentWindowSum>=k)
            {
                minSize=Math.min(minSize, windowEnd-windowStart+1);
                currentWindowSum-=arr[windowStart];
                windowStart++;
            }
        }
        return minSize;

    }
    public static void main(String[] args) {

        System.out.println(minSize(new int[] {4,2,2,7,8,1,2,8,10},8));
    }
}
