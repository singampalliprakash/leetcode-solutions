class Solution {
    public double myPow(double x, int n) {
        // if(n==0) return 1.0;
        // if(n==1) return x;
        // if(x==1.0) return x; 
        // if(n<=Integer.MIN_VALUE || n>=Integer.MAX_VALUE) return 0;
        // //if(n<0) return myPow(1/x,n);
        // double result=1;boolean negative = false;

        // if(n<0) {negative=true;n=-n;}
        // for(int i=0;i<n/2;i++)
        // {
        //     result*=x;
        // }
        // result = result * result;
        // if(n%2!=0)
        // {
            
        //     result*=x;
        // }
        // if(negative) result = 1.0/result;
        // return result;

        return binExp( x, (long) n);
    }
    private double binExp(double x,long n)
    {
        if(n==0)
        {
            return 1;
        }

        if(n<0)
        {
            return 1.0/binExp(x,-n);
        }

        if(n%2==1)
        {
            return x*binExp(x*x,(n-1)/2);
        }
        else
        {
            return binExp(x*x,n/2);
        }

    }
}