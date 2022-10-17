package com.tp;

public class GoodNumber {

	
	public static boolean isGoodNumber(int N){
		
			if( N < 0 )
				return isGoodNumber( -N );

			if( N == 0 || N == 7 )
				return true;
			if( N < 10 )
				return false;

			return isGoodNumber( N / 10 - 2 * ( N - N / 10 * 10 ) );
		}
		
		public static void main (String[] args)
		{
			int N = 616;
			if(isGoodNumber(N))
				System.out.println("Divisible");
			else
				System.out.println("Not Divisible");
		}
	}


