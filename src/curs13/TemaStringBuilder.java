package curs13;

public class TemaStringBuilder {

	public static void main(String[] args) {

		String tema = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam consectetur odio ac quam commodo, eu eleifend felis imperdiet. Integer bibendum nunc quis sem faucibus, vitae laoreet mi dignissim. Praesent eget ligula nec lorem varius malesuada. Nulla neque lacus, euismod quis erat nec, convallis vestibulum augue. Nullam et aliquet justo. Aliquam erat volutpat. Nulla elementum urna in dolor viverra, in efficitur lectus mattis.";

//		duplicateNulla(tema);
		imparteInPropozitii(tema);
		stergeCaracter(tema);
		inlocuiesteCaracter(tema);

	}

	public static void duplicateNulla(String text) {

	}

	public static void imparteInPropozitii(String text) {
		StringBuilder sb = new StringBuilder(text);

		String[] splitString = sb.toString().split("\\.");
		for (String string : splitString) {
			System.out.println(string + ".");
		}

		System.out.println("********************************************************************");

	}

	public static void stergeCaracter(String text) {
		StringBuilder sb = new StringBuilder(text);

		for (int i = 0; i < sb.length(); i++) {
			if ((i != 0 && sb.charAt(i) == 'a') || i != 0 && sb.charAt(i) == 'A') {
				sb.deleteCharAt(i);
				i++;
			}

		}
		System.out.println(sb);

		System.out.println("*****************************************************************");

	}

	public static void inlocuiesteCaracter(String text) {
		StringBuilder sb = new StringBuilder(text);

		for (int i = 0; i < sb.length(); i++) {
			if (i != 0 && sb.charAt(i) == 'o') {
				sb.setCharAt(i, '#');
				i++;
			}

		}
		System.out.println(sb);

	}

}
