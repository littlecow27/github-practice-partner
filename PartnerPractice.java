import java.util.Scanner;
public class PartnerPractice{
	
public int[][] createArray(int xSize){
	int[][] array = new int[xSize][xSize];

  for(int i =0; i<xSize; i++){
      array[i][i]= ((int)Math.random*10)+1;
  }
  return array;
	} 
public int analyzeArr(int[][] arr){
  for(int i =0; i< arr.length();i++){
       if(arr[i][i]%2==1&&arr[i][i+1]+arr[i][i-1]+arr[i+1][i]+arr[i-1][i]>33){
		   return arr[i][i];
  }
}
	public static void main (String[]args){
		Scanner scan = new Scanner(System.in);
		System.out.println("pick square size")
		int x = scan.nextInt();
  		int[][] array = createArray(x,x);

		System.out.println(analyzeArr(array));
		
	}
}
