public class a_shift_zero
{
	public static void shift_zero(int arr[])
	{
		int count = 0;
		for(int x =0;x<arr.length;x++)
		{
			if(arr[x]!=0)
			{
				arr[count] = arr[x];
				count++;
			}
		}
		while(count<arr.length)
		{
			arr[count] = 0;
			count++;
		}
		for (int y :arr ) 
		{
			System.out.print(y+" ");	
		}
	}
	public static void main(String[] args) {
		int num[] = {0,1,0,3,12};
		shift_zero(num);
	}
	
}