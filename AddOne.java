public class AddOne
{
	public static int[] addOne(int[] input)
	{
		int[] result = input;
		int carryOver = 1; 
		int position = input.length - 1; //the position to add to

		while(carryOver != 0) 
		{
			if((position == 0) && (result[position] == 9))
			{
				//if the first element is 9-> then expand the array 
				int [] expandedArray = new int[result.length + 1];
				expandedArray[0] = 0; 
				for(int i = 0; i < result.length; i++) 
				{
					//add a 0 to the front and then transfer the rest of the array 
					expandedArray[i+1] = result[i]; 
				}
				result = expandedArray; 
				position++;
			}

			else if(result[position] == 9)
			{
				result[position] = 0; 
				//you still have 1 to carry over 
				position--;
			}
			
			else
			{
				result[position] += 1; 
				carryOver--; 
			}
		}

		return result;
	}

	public static void main(String [] args)
	{
		int [] input = {1, 2, 9, 9}; 

		int [] solution = addOne(input);

		for(int i = 0; i < solution.length; i++)
		{
			System.out.print(solution[i] + " ");
		}
	}

}