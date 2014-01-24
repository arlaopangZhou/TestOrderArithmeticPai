package atithmatic.test.com;

public class QuickOrderArithmetic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuickOrderArithmetic qui = new QuickOrderArithmetic();
		int [] src = {21,443,353,332,2,5,24,434353,324,245,242};
		int [] src4 = {21,443,353,332};

		qui.doInsertSort1(src4);
	}

	
    /**
     *插入排序(WHILE循环实现)
     *@paramsrc待排序数组
     */
    void doInsertSort1(int[] src)
    {
       int len=src.length;
       for(int i=1;i<len;i++)
       {  
           int temp=src[i];
           int j=i;
          
           while(src[j-1]>temp)
           {
              src[j]=src[j-1];
              j--;
              if(j<=0)
                  break;
           }
           src[j]=temp;
           System.out.println(src[j]);
          
       }
    }
}
