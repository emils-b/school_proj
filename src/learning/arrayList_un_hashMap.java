package learning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class arrayList_un_hashMap {

	public static void main(String[] args) {
		ListClass person1 = new ListClass("John", "Snow", 1400, 500);
		ListClass person2 = new ListClass("Jo", "Bush", 2400, 1000);
		ListClass person3 = new ListClass("Georg", "Red", 1000, 200);
		ListClass person4 = new ListClass("Owen", "Flow", 1200, 300);
		ListClass person5 = new ListClass("Jo", "Chi", 800, 100);
		ListClass person6 = new ListClass("Amp", "Shnee", 900, 200);
		
		//1.daļa
		/*ArrayList<ListClass> firstList = new ArrayList<ListClass>();
		firstList.add(person1);
		firstList.add(person2);
		firstList.add(person3);
		System.out.println(firstList.size());

		ArrayList<ListClass> secondList = new ArrayList<ListClass>();
		secondList.add(person4);
		secondList.add(person5);
		secondList.add(person6);
		firstList.addAll(secondList);
		System.out.println(firstList.size());
		System.out.println(secondList.size());
		secondList.clear();
		System.out.println(secondList.size());

		for (int i = 0; i < firstList.size(); i++) {
			System.out.println(firstList.get(i).getBruto());
			if (firstList.get(i).getBruto() < 0) {
				firstList.remove(i);
			}
		}
		
		for(ListClass i : firstList) {
			i.describe();
			if (i.isUnder1000()) System.out.println(i.name+"'s income is under 1000");
			if (!(i.isTaxed())) System.out.println(i.name+" hasn't paid taxes.");
			if(firstList.indexOf(i)==firstList.size()-1) ListClass.clientCount();
		}
		*/
		//2.daļa
		Map<String, ListClass> firstMap = new HashMap<String, ListClass>();
		firstMap.put("person1", person1);
		firstMap.put("person2", person2);
		firstMap.put("person3", person3);
		firstMap.put("person4", person4);
		System.out.println(firstMap.size());
		Map<String, ListClass> secondMap = new HashMap<String, ListClass>();
		secondMap.put("person5", person5);
		secondMap.put("person6", person6);
		System.out.println(secondMap.size());
		firstMap.putAll(secondMap);
		System.out.println(firstMap.size());
		firstMap.remove("person5");
		System.out.println(firstMap.size());
		firstMap.put("person6", person5);
		System.out.println(firstMap.size());
		System.out.println(firstMap.containsKey("person5"));
		System.out.println(firstMap.containsKey("person6"));
		System.out.println(firstMap.containsValue(person5));
		System.out.println(firstMap.containsValue(person6));
		
		for(String i : firstMap.keySet()) {
			firstMap.get(i).describe();
			//System.out.println(firstMap.get(i));
		}
		
		firstMap.clear();
		System.out.println(firstMap.size());

	}

}
