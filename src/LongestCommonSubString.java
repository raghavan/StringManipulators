

public class LongestCommonSubString {
	
	
	public static void main(String args[]) {
      String str1 = "texter";
      String str2 = "text";
      String smallString,largeString;
      Integer maxSet=0;
      String maxMatchStr=new String();
      
      if(str1.length() <= str2.length()){
    	 smallString = str1;
    	 largeString = str2;
     }else{
    	 smallString = str2;
    	 largeString = str1;
     }
     	 
      Integer strMatrix[][] = new Integer[largeString.length()+1][smallString.length()+1];
      
     for(int i = 0;i<largeString.length()+1;i++){
    	 for(int j=0;j<smallString.length()+1;j++){
    		 strMatrix[i][j] = 0;
    	 }
     }
      
     for(int i = 0;i<largeString.length();i++){
    	 for(int j=0;j<smallString.length();j++){
    		 if(largeString.charAt(i) == smallString.charAt(j)){    			 
    			 strMatrix[i+1][j+1] =  strMatrix[i][j] +1;    			
    			 if(strMatrix[i+1][j+1]>maxSet){
    				 maxSet = strMatrix[i+1][j+1];
    				 //printMatrix(strMatrix,largeString.length(), smallString.length());
    				 maxMatchStr = alterSetValue(strMatrix, i+1,j+1,largeString);
    			 }
    		 }
    	 }
     }
     System.out.println("Longest Common Sub Sequence is = "+maxMatchStr);
	}
	
	private static void printMatrix(Integer matrix[][],int row,int col){
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}

	private static String alterSetValue(Integer strMatrix[][], int i,int j,
			String largeStr) {
		int currentval =  strMatrix[i][j];		
		StringBuilder maxMatchStrBuilder = new StringBuilder();
		while(currentval>0){
			i--;
			currentval --;
			//System.out.println("concating = "+largeStr.charAt(i));
			maxMatchStrBuilder.append(String.valueOf(largeStr.charAt(i)));;
		}
		//System.out.println("Max str ="+maxMatchStrBuilder);
		//System.out.println("-------------");
		return maxMatchStrBuilder.reverse().toString();
		
	}
}
