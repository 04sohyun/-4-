package ch02_Calendar;

import java.util.TimeZone;

public class PrintTimaZoneID {
	public static void main(String[] args) {
		String[] availableIDs = TimeZone.getAvailableIDs();//������ timeZone id���
		for(String id:availableIDs) {
			System.out.println(id);
		}
		
		
	}

}
