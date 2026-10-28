public class PartnerPractice{

  createArray(15,15)
}
public int[][] createArray(int xSize, int ySize){
	int[][] array = new int[xSize][ySize];

  for(int i =0; i<xSize; i++){
    for(int j=0; i<ySize;j++){
      array[i][j]= ((int)Math.random*10)+1;
        }
  }
  return array;
	} 
public int analyzeArr(int[][] arr){
  for(int i =0; i< arr.length();i++){
     for(int j =0; j< arr.length();j++){
       if(arr[i][j]%2==0)
		   return arr[i][j];
     }
  }
}
