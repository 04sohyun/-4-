package ch03_array;

public class Ex03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = {78,98,54,76,87};
		System.out.println("¹è¿­ÀÇ °¹¼ö:"+score.length);
		//ÃÑÁ¡
		int total =0;
		for(int i=0; i<score.length;i++) {
			total += score[i];
		}
		System.out.println("ÃÑÁ¡:"+total);
		//Æò±Õ
		double avg = total/(double)score.length;
		System.out.println("Æò±Õ:"+avg);
		
		total =0;
		//Çâ»óµÈ for¹®À¸·Î ÃÑÁ¡±¸ÇÏ±â
		for(int s:score) {
			total += s;
			System.out.println("ÃÑÁ¡:"+s);
		}
	}

}
