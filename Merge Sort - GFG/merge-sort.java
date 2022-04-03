// { Driver Code Starts
import java.util.*;

class Merge_Sort
{
    //method to print the elements of the array
	static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    

	public static void main(String args[])
	{
	    //taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking testcases
		int T = sc.nextInt();
		while(T>0)
		{
		    //taking elements count
			int n = sc.nextInt();
			
			//creating an object of class Merge_Sort
			Merge_Sort ms = new Merge_Sort();
			
			//creating an array of size n
			int arr[] = new int[n];
			
			//adding elements to the array
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

            
			Solution g = new Solution();
			
			//calling the method mergeSort
			g.mergeSort(arr,0,arr.length-1);

            //calling the method printArray
			ms.printArray(arr);
		T--;
		}
	}
}


// } Driver Code Ends




class Solution
{
    int[] arrays;
    void merge(int arr[], int l, int m, int r)
    {
        for(int n=l; n<=r;n++){
            arrays[n] = arr[n];
        }
        
        
        int i=l, j = m+1,  k=l;
        // if(l>=r) return ;
        while(i<=m&&j<=r){
            if(arrays[i]>arrays[j]){
                arr[k] = arrays[j];
                j++;
            }else{
                arr[k] = arrays[i];
                i++;
            }
            k++;
        }
        while(i<=m){
            arr[k]= arrays[i];
            i++;
            k++;
        }
        // while(j<=r){
        //     arr[k]= arrays[j];
        //     j++;
        //     k++;
        // }
       // return ;
         
    }
     void mergeSort(int arr[], int l, int r)
   {
       arrays= new int[arr.length];
       //code here
       divide(arr,l,r);
       
       
   }
   
   void divide(int[] arr, int l,int r){
       
       if(r>l){
            int m=l+(r-l)/2;
            divide(arr,l,m);
            divide(arr,m+1,r);
            merge(arr,l,m,r);
        }
   }
}
