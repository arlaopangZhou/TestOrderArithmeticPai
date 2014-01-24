package atithmatic.test.com;

import java.awt.List;
import java.util.ArrayList;

public class BubbleOrder {

	/**
	 * @param args
	 */
	static ArrayList<Integer> list;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] src = {21,443,353,332,2,5,24,434353,324,245,242};
		BubbleOrder bu = new BubbleOrder();
		bu.doBubbleSort(src);
		for (int i = 0; i <list.size() ; i++) {
			System.out.println("list====="+list.get(i).toString());
		}
	}

	//由大到小排序
	public void doBubbleSort(int[] src) {
		list = new ArrayList<Integer>();
		int len = src.length;
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				int temp;
				if (src[i] < src[j]) { //此处改为src[i] > src[j]就是由小到大排序
					temp = src[j];
					src[j] = src[i];
					src[i] = temp;
				}
			}
			list.add(src[i]);
			System.out.println(src[i]);
		}
	}

}
