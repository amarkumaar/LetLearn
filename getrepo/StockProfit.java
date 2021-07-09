package CoreDSA;
public class StockProfit {
    static int profit(int a[],int n){
        int maxProfit =0;
        for(int i=1;i<n;i++)
      
        {
            if(a[i]>a[i-1])
            {
                maxProfit+=(a[i]-a[i-1]);
            }

        }
        return maxProfit;
    } 
    public static void main(String[] args) {
        
        int a[]={8,1,2,9,7,10};
        int n= a.length;
        System.out.println(profit(a, n));
    }
}