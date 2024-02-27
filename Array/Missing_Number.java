class Missing_Number{
    public static void main(String []args){
        int []nums ={1,2,3,5};
        System.out.println("Find Missing Number from given array");
        for(int i=0; i<nums.length; i++)
        {
            System.out.print(nums[i]+"");
        }
        System.out.print("\n");
        System.out.println("Total sum of array");
        int n= nums.length+1;
        int totalsum=(n*(n+1)/2);
        System.out.println(totalsum);

        System.out.println("The missing number in array is");
        int sum =0; 
        for(int j=0; j<nums.length; j++)
        {
            sum+=nums[j];
        }
        System.out.println(totalsum-sum);
        

        
    }
}