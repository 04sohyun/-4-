package ch04_array2;

public class ArrayCopyExam {
	public static void main(String[] args) {
		String[] oldStrArray = {"java","array","copy"};
		String[] newStrArray = new String[5];//[null][null][null][null][null]
		
		//for(int i=0;i<oldStrArray.length;i++) 
			//newStrArray[i] = oldStrArray[i];//[java][array][copy][null][null]
			
		

		//system.arrayCopy() - ���� copy, ���ο� �迭�� ������ �Ŀ� ���
		//arraycopy(�ҽ�, �ҽ��� ����index, Ÿ��, Ÿ���� ����index, �����ұ���)
		System.arraycopy(oldStrArray, 0, newStrArray, 0, 0);
		
		for(int i=0;i<newStrArray.length;i++) 
			System.out.print(newStrArray[i]+" ");
		
		
		System.out.println("\n-------------------------");
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		for(int i=0;i<newStrArray.length;i++) 
			System.out.print(newStrArray[i]+" ");
		
		
	}

}