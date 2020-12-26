/*input
6
4 1
2 3 5 4
5 6
1 1 3 4 4
1 10
2
2 10
11 9
2 10
12 11
5 18
81 324 218 413 324

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
			int n = sc.nextInt();
            int x = sc.nextInt();
            int arr[] = new int[n];
            iIA(sc, arr);
            int count=0;
            int ans=0;
            boolean possible = false;
            for(int i=0; i<n; i++){
            	count=0;
            	for(int j=0; j<n-1; j++){
            		if(arr[j] <= arr[j+1])
            			count++;
            	}
            	if(count == n-1){
            		possible = true;
            		break;
            	}
            	else{
            		if(arr[i]>x){
            			arr[i]^=x;
            			x^=arr[i];
            			arr[i]^=x;
            			ans++;
            		}

            	}

            }
            if(possible)
               	out.println(ans);
            else
            	out.println(-1);
        }
		out.close();
	}
}
