/*input
*/
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	static PrintWriter out;
	static int MOD = 1000000007;
     /*-------- for output ---------------------*/
     static void iPA(int arr []){
     	 StringBuilder output = new StringBuilder();
	     for(int i=0; i<arr.length; i++)output.append(arr[i] + " ");System.out.println(output);
	}
	static void lPA(long arr []){
	     StringBuilder output = new StringBuilder();
	     for(int i=0; i<arr.length; i++)output.append(arr[i] + " ");System.out.println(output);
	}
	static void sPA(String arr []){
	     StringBuilder output = new StringBuilder();
	     for(int i=0; i<arr.length; i++)output.append(arr[i] + " ");System.out.println(output);
	}
	static void dPA(double arr []){
	     StringBuilder output = new StringBuilder();
	     for(int i=0; i<arr.length; i++)output.append(arr[i] + " ");System.out.println(output);
	}
    /*-------------- for input ---------------------*/
	static void iIA(FastReader reader, int arr[]){
	     for(int i=0; i<arr.length; i++)arr[i] = reader.nextInt(); 
	}
	static void lIA(FastReader reader, long arr[]){
	     for(int i=0; i<arr.length; i++)arr[i] = reader.nextLong(); 
	}
	static void sIA(FastReader reader, String arr[]){
	     for(int i=0; i<arr.length; i++)arr[i] = reader.next(); 
	}
	static void dIA(FastReader reader, double arr[]){
	     for(int i=0; i<arr.length; i++)arr[i] = reader.nextDouble();
	}
	/*------------ for taking input faster ----------------*/
     static class FastReader
	{
		BufferedReader br;
		StringTokenizer st;

		public FastReader()
		{
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next()
		{
			while (st == null || !st.hasMoreElements())
			{
				try
				{
					st = new StringTokenizer(br.readLine());
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt()
		{
			return Integer.parseInt(next());
		}

		long nextLong()
		{
			return Long.parseLong(next());
		}

		double nextDouble()
		{
			return Double.parseDouble(next());
		}

		String nextLine()
		{
			String str = "";
			try
			{
				str = br.readLine();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
			return str;
		}
	}

	// Method to check if x is power of 2
    static boolean isPowerOfTwo (int x) 
    { 
        return x!=0 && ((x&(x-1)) == 0);     
    }
    //Method to return lcm of two numbers
    static int gcd(int a, int b)
    {
        return a==0?b:gcd(b % a, a); 
    }
    // method to return LCM of two numbers
    static int lcm(int a, int b)
    {
        return (a / gcd(a, b)) * b;
    }
    //Method to find the max in an array
    public static int findMax(int arr[]){
    	int max = arr[0];
    	for(int i=0; i<arr.length; i++){
    		max = arr[i]>max?arr[i]:max;
    	}
    	return max;
    }
    //Method to find the min in an array
    public static int findMin(int arr[]){
    	int min = arr[0];
    	for(int i=0; i<arr.length; i++){
    		min = min>arr[i]?arr[i]:min;
    	}
    	return min;
    }
    private static int countDigits(long l) {
			if (l >= 1000000000000000000L) return 19;
			if (l >= 100000000000000000L) return 18;
			if (l >= 10000000000000000L) return 17;
			if (l >= 1000000000000000L) return 16;
			if (l >= 100000000000000L) return 15;
			if (l >= 10000000000000L) return 14;
			if (l >= 1000000000000L) return 13;
			if (l >= 100000000000L) return 12;
			if (l >= 10000000000L) return 11;
			if (l >= 1000000000L) return 10;
			if (l >= 100000000L) return 9;
			if (l >= 10000000L) return 8;
			if (l >= 1000000L) return 7;
			if (l >= 100000L) return 6;
			if (l >= 10000L) return 5;
			if (l >= 1000L) return 4;
			if (l >= 100L) return 3;
			if (l >= 10L) return 2;
			return 1;
		}



	public static void main (String[] args) throws java.lang.Exception
	{
		OutputStream outputStream =System.out;
        out =new PrintWriter(outputStream);
        FastReader sc =new FastReader();
		//for fast output sometimes
		StringBuilder sb = new StringBuilder();
		int t = sc.nextInt();
		while(t-->0){
            
        }
		out.close();
	}
	
}
