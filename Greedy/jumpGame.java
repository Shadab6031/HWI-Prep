public class jumpGame
{
    public static boolean Check(int nums[])
    {
          int reach=0;
         for(int i=0;i<nums.length;i++)
         {
            if(i>reach) return false;
            reach= Math.max(reach, i+nums[i]);
         }
         return true;
    }
    public static void main(String[] args) {
        int nums[]={2,3,1,1,4};
        System.out.println(Check(nums));
    }
}