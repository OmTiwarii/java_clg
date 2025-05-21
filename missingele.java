public class missingele {
    public static void main(String[] args) {
        
    int[] arr ={3,1,4};
    int max=0;
    int asum =0;
    for(int i=0;i<arr.length;i++){
        asum= asum +arr[i];
      if(arr[i]>max){
        max=arr[i];
      }
    
    }
    }
    //System.out.println(max);

    int sumofser = (max *(max +1))/2;
    int missing = sumofser - asum;
    System.out.println(missing);
    System.out.println(sumofser);
  
    }
    
}
