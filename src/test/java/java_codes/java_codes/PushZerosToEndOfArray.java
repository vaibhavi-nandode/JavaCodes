package java_codes.java_codes;

public class PushZerosToEndOfArray {

	public void pushzeros(int arr[]) {
		int index=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				int temp=arr[i];
				arr[i]=arr[index];
				arr[index]=temp;
				
				index++;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[]= {1,3,0,2,5,0,6,0};
		int arr[]= {0,0,0,0,5,3,6,4};
		PushZerosToEndOfArray p=new PushZerosToEndOfArray();
		p.pushzeros(arr);
		for(int num:arr) {
			System.out.println(num);
		}

	}

}
