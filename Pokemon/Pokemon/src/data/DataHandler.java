package data;

public class DataHandler {

	public static String[] Concatenate(String[] list1, String[] list2) {
		
		int newLen = list1.length + list2.length;
		int tempLen = 0;
		String[] tempList = new String[newLen];
		
		for (int i = 0; i < list1.length; i++) {
			tempList[i] = list1[i];
			tempLen += 1;
		}
		
		for (int i = 0; i < list2.length; i++) {
			boolean check = true;
			
			for (String j : list1) {
				if (list2[i] == j) {
					check = false;
				}
			}
			
			if (check) {
				tempList[tempLen] = list2[i];
				tempLen += 1;
			}
		}
		
		for (String i : tempList) {
			if (i == null) {
				newLen -= 1;
			}
		}
		
		String[] returnList = new String[newLen];
		for (int i = 0; i < newLen; i++) {
			returnList[i] = tempList[i];
		}
		
		return returnList;
	}
}
