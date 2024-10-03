import java.util.Arrays;
public class SquareAndSort {

    public static void main(String[]args){

	int[] numbers = {0,1,0,-10,5,0};

	System.out.print(Arrays.toString(sort(square(numbers))));

    }

    public static int [] square(int[] numbers){

	int counter = 0;

	int [] squares = new int [numbers.length];

	for(int count = 0; count < numbers.length; count++ ){

		squares[count] = numbers[count]*numbers[count];

	}

	return squares;

    }

    public static int [] sort(int [] squares){

	int largest = squares[0];

	int flag = 0;

	int [] sorted =  new int [squares.length];
	
	for(int count = 0 ; count < squares.length; count ++){


		for(int counter =0; counter <  squares.length; counter++ ){
			
			if(squares[counter]>largest){largest = squares[counter];flag = counter;}

		}

		sorted[(squares.length-1)-count]=largest;
		squares[flag] = 0;
		largest = 0;

	}

	return sorted;
    }

}