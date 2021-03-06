package ch04_array2;

import java.util.Arrays;

public class ArrayCopyExam4 {
	public static void main(String[] args) {
		String[] oldStrArray = {"java","array","copy"};
		String[] newStrArray = new String[5];//[null][null][null][null][null]
		
		//deep copy
		//Arrays클래스의 copyof(소스배열, 복사할 길이) => 새로운 배열 객체 생성
		String[] arr2 = Arrays.copyOf(oldStrArray, oldStrArray.length);
		for(int i=0;i<arr2.length;i++) 
			System.out.print(arr2[i]+" ");
		
		System.out.println();
		arr2[0] = "hi";
		for(int i=0;i<arr2.length;i++) 
			System.out.print(arr2[i]+" ");
		System.out.println();
		for(int i=0;i<oldStrArray.length;i++) 
			System.out.print(oldStrArray[i]+" ");
		
		
	/*	System.out.println("\n-------------------------");
		//java.lang.ArrayIndexOutOfBoundsException : 소스의 갯수가 2개인데 타겟배열의 인덱스번호를 초과시 오류발생 (3이아닌 4일때)
		System.arraycopy(oldStrArray, 1, newStrArray, 3, oldStrArray.length-1);
		for(int i=0;i<newStrArray.length;i++) 
			System.out.print(newStrArray[i]+" ");
		
		System.out.println("\n-------------------------");
		int srcPos = 1;
		int num = oldStrArray.length - srcPos;//3-1=2
		System.arraycopy(oldStrArray, 1, newStrArray, 3, num);
		for(int i=0;i<newStrArray.length;i++) 
			System.out.print(newStrArray[i]+" ");
			*/
	}

}
