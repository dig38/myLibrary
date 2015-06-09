package BinarySearch;
/*
 * Daniel Gorman
 * Binary Search
 * 29/05/2015 DD/MM/YYYY
 */
public class BinarySearch {
	public static void first(String[] args){
		int 	my_number = 4,
				array_length = 20;
		
		//add get my_number
		//add get array_length
		//add alternate way of creating the array
		
		//error checking array_length
		if (array_length < my_number)
			array_length+= my_number;
		
		//Initialize number_array
		int[] number_array = new int[array_length];
		
		//Populates number_array
		for(int i = 0; i< 20; i++){
			number_array[i] = i + 1;
			System.out.println(number_array[i]);
		}//END for
		System.out.println();
		
		//Searches for my_number
		biSearch(my_number, array_length, number_array);
		
	}//END static void main()
	
	public static void biSearch(int my_number, int array_max, int[] number_array){
		//Initializes and Sets variables. 
		int 	lower_index = 0,
				upper_index = array_max,
				middle_point = (lower_index + upper_index)/2;
		
		
		//Search Function
		if (my_number >= middle_point){ //outerIf
			for(; middle_point < array_max - 1; middle_point = (lower_index + upper_index)/2){ //for1
				//If exit condition
				if (number_array[middle_point] == my_number){
	            	System.out.println("Your number, \"" + my_number + "\" was found.");
	            	array_max = 0;
				}//END if
				else if (number_array[middle_point] < my_number)
					upper_index = middle_point;
				else
					lower_index = middle_point; //updates the lower_index	
				//END if, else if, else
			}//END for1
		} else{
			array_max = middle_point;
			upper_index = middle_point;
			middle_point = (lower_index + upper_index)/2;
			
			for(; middle_point < array_max - 1; middle_point = (lower_index + upper_index)/2){ //for2
				if (my_number == number_array[middle_point])
				{
	            	System.out.println("Your number, \"" + my_number + "\" was found.");
	            	array_max = 0;
	            }//END if
				else if (my_number > number_array[middle_point])
					lower_index = middle_point; //updates the lower_index
				else
					upper_index = middle_point;
				//END if, else if, else
			}//END for2
		}//END outerIf
		
	}
	
}//END Class
