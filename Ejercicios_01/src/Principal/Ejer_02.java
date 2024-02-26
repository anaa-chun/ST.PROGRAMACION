package Principal;

import java.util.ArrayList;

public class Ejer_02 {

	public static void main(String[] args) {
		int tb[] = { 1, 2, 3, 4, 5 };
		ArrayList<String> lista = new ArrayList<String>();

		lista.add("angel");
		lista.add("maria");
		lista.add(1, "miguel");
		lista.add("mata");
		lista.add("jose manuel");

		for (int i = 0; i < lista.size(); i++)
			System.out.println(lista.get(i));

		for (String ele : lista) System.out.println(ele);

		for (int n : tb) System.out.println(n);

		for (int i = 0; i < tb.length; i++)
			System.out.println(tb[i]);

	}

}
