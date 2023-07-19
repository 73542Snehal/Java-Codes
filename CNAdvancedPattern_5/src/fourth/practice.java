package fourth;

import java.util.Scanner;

public class practice {
		
		public static int[] takeinput() {
			Scanner sc = new Scanner(System.in);
			int n=sc.nextInt();
			int arr[] = new int[n];
			
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			 return arr;		
		}

		  public static int pairSum(int arr[], int x) {

		         int n=arr.length;
		         int count=0;
				    for(int i=0;i<n-1;i++){
				        for(int j=i+1;j<n;j++){
				            int pair= arr[i]+arr[j];
		                    if(pair==x){
		                    	count++;
								
							}
		                    
				        }
				        return count;
				        
				    }return 0;
				    }

			    
			   public static void main(String[] args) 
			    {
			        Scanner sr = new Scanner(System.in);
			        int t = sr.nextInt();
			        while(t > 0) 
			        {
			            int n=sr.nextInt();
			            int[] arr=new int[n];
			            for (int i =0 ; i<n;i++)
			            {
			                arr[i]=sr.nextInt();
			            }
			            int x =sr.nextInt();
			            System.out.println((pairSum(arr,x)));
			            
			            t -= 1;
			        }
			    }
			}

