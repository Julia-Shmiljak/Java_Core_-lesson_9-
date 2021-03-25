/*
 * LOGOS IT Academy. Java Core task-9.1.
 */
package ua.lviv.lgs;

import java.util.Scanner;

/**
 * @author Ju
 * @since Java 1.8
 * @version 1.1
 */

public class Main {
	/**
	 * @see jva code convension
	 * @exception WrongInputConsoleParametersException
	 */

	enum Season {
		WINTER, SPRING, SUMMER, FALL;
	}

	enum Months {
		JANUARY(31, Season.WINTER), FEBRUARY(28, Season.WINTER), MARCH(31, Season.SPRING), APRIL(30, Season.SPRING),
		MAY(31, Season.SPRING), JUNE(30, Season.SUMMER), JULY(31, Season.SUMMER), AUGUST(31, Season.SUMMER),
		SEPTEMBER(30, Season.FALL), OCTOBER(31, Season.FALL), NOVEMBER(30, Season.FALL), DECEMBER(31, Season.WINTER);

		Season season;

		/* name to class */
		private int day;

		/* this is constructor */
		private Months(int day, Season season) {
			this.day = day;
			this.season = season;
		}

		public Season getSeason() {
			return season;
		}

		public int getDay() {
			return day;
		}
	}

	/* description the application menu */
	static void menu() {
		System.out.println("�������� 1, ��� ��������� �� � ����� �����");
		System.out.println("�������� 2, ��� ������� �� ����� � ����� � ����� ����");
		System.out.println("�������� 3, ��� ������� �� ����� �� ����� ���� ���� ������� ���");
		System.out.println("�������� 4, ��� ������� �� ����� �� ����� �� ����� ����� ������� ���");
		System.out.println("�������� 5, ��� ������� �� ����� �� ����� �� ����� ����� ������� ���");
		System.out.println("�������� 6, ��� ������� �� ����� �������� ���� ����");
		System.out.println("�������� 7, ��� ������� �� ����� ��������� ���� ����");
		System.out.println("�������� 8, ��� ������� �� ����� �� ����� �� ����� ����� ������� ���");
		System.out.println("�������� 9, ��� ������� �� ����� �� ����� �� ����� ������� ������� ���");
		System.out.println("�������� 10, ��� ������� �� ����� �� �������� � ������ ����� �� ����� ������� ���");
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) throws WrongInputConsoleParametersException {
		Season[] arraySes = Season.values();
		Months[] arrayMos = Months.values();

		Scanner sc = new Scanner(System.in);

		/* creates that calls the menu method */
		while (true) {
			menu();

			switch (sc.next()) {
			case "1": {
				System.out.println("������ �����: ");
				sc = new Scanner(System.in);
				String mounths = sc.next().toUpperCase();
				boolean flag = ifMounthExists(arrayMos, mounths);
				if (flag) {
					System.out.println("����� ����� ����");
				} else {
					String description = "����� ����� �� ����";
					throw new WrongInputConsoleParametersException(description);
				}
				break;
			}

			/*Checks if the season exists */
			case "2": {
				System.out.println("������ ���� ����: ");
				sc = new Scanner(System.in);
				String sea = sc.next().toUpperCase();

				boolean flag = false;
				for (Months m : arrayMos) {
					if (m.getSeason().name().equals(sea)) {
						flag = true;
					}
				}
				if (flag) {
					Season s2 = Season.valueOf(sea);
					for (Months mons : arrayMos) {
						if (mons.getSeason().toString().equalsIgnoreCase(sea)) {
							System.out.println(mons);
						}
					}
				} else {
					String description = "���� ���� ���� �� ����";
					throw new WrongInputConsoleParametersException(description);
				}
				break;
			}
			case "3": {
				sc = new Scanner(System.in);
				System.out.println("������ ������� ��� : ");
				int numberOfDays = sc.nextInt();

				boolean flag = false;

				for (Months months : arrayMos) {
					if (months.getDay() == numberOfDays) {
						flag = true;
					}
				}

				if (flag) {
					System.out.println("���� ������� ��� - " + numberOfDays + " �������� � ��������� ������:");

					for (Months months2 : arrayMos) {
						if (months2.getDay() == numberOfDays) {
							System.out.println(months2);
						}
					}
				} else {
					String description = "����� ����� �� ����";
					throw new WrongInputConsoleParametersException(description);
				}

				break;
			}

			case "4": {
				sc = new Scanner(System.in);
				System.out.println("������ ������� ��� : ");
				int minCountDay = sc.nextInt();
				boolean flag = false;
				for (Months months : arrayMos) {
					if (months.getDay() == minCountDay) {
						flag = true;
					}
				}
				if (flag) {
					System.out.println("�������� ������� ��� �������� � ��������� ������:");
					for (Months months2 : arrayMos) {
						if (months2.getDay() < 30) {
							System.out.println(months2);
						}
					}
				} else {
					String description = "̳����� � ����� ������� ��� �� ����";
					throw new WrongInputConsoleParametersException(description);
				}

				break;
			}

			case "5": {
				sc = new Scanner(System.in);
				System.out.println("������ ������� ��� : ");
				int maxCountDay = sc.nextInt();
				boolean flag = false;
				for (Months months : arrayMos) {
					if (months.getDay() == maxCountDay) {
						flag = true;
					}
				}
				if (flag) {
					System.out.println("�������� ������� ��� �������� � ��������� ������:");
					for (Months months2 : arrayMos) {
						if (months2.getDay() > 30) {
							System.out.println(months2);
						}
					}
				} else {
					String description = "̳����� � ����� ������� ��� �� ����";
					throw new WrongInputConsoleParametersException(description);
				}

				break;

			}
			case "6": {
				System.out.println("������ ���� ����: ");
				sc = new Scanner(System.in);
				String seasoNext = sc.next().toUpperCase();
				boolean flag = false;

				for (Season seasons : arraySes) {
					if (seasons.name().equalsIgnoreCase(seasoNext)) {
						flag = true;
					}
				}
				if (flag) {
					System.out.println("�������� ���� ����: ");
					Season seson = Season.valueOf(seasoNext);
					int i = seson.ordinal();

					if (i == (arraySes.length - 1)) {
						i = 0;
						System.out.println(arraySes[i]);
					} else {
						System.out.println(arraySes[i + 1]);
					}
				}

				else {
					String description = "���� ���� ���� �� ����";
					throw new WrongInputConsoleParametersException(description);
				}
				break;

			}
			case "7": {
				System.out.println("������ ���� ����: ");
				sc = new Scanner(System.in);
				String seasonBef = sc.next().toUpperCase();
				boolean flag = false;
				for (Season seasons : arraySes) {
					if (seasons.name().equalsIgnoreCase(seasonBef)) {
						flag = true;
					}
				}
				if (flag) {
					System.out.println("�������� ���� ����: ");
					Season seson = Season.valueOf(seasonBef);
					int i = seson.ordinal();

					if (i == 0) {
						i = (arraySes.length - 1);
						System.out.println(arraySes[i]);
					} else {
						System.out.println(arraySes[i - 1]);
					}
				} else {
					String description = "���� ���� ���� �� ����";
					throw new WrongInputConsoleParametersException(description);
				}
				break;

			}
			case "8": {
				System.out.println("����� ������� ��� �������� � ��������� ������:");
				for (Months months2 : arrayMos) {
					if (months2.getDay() % 2 == 0) {
						System.out.println(months2);
					}
				}
				break;
			}
			case "9": {
				System.out.println("�� ����� ������� ��� �������� � ��������� ������:");
				for (Months months2 : arrayMos) {
					if (months2.getDay() % 2 != 0) {
						System.out.println(months2);
					}
				}
				break;
			}
			case "10": {
				System.out.println("������ �����: ");
				sc = new Scanner(System.in);
				String mounths = sc.next().toUpperCase();

				boolean flag = ifMounthExists(arrayMos, mounths);
				if (flag) {
					Months mon10 = Months.valueOf(mounths);
					if (mon10.getDay() % 2 == 0) {
						System.out.println("� ��������� ����� ����� ������� ���: " + mon10.getDay());
					} else {
						System.out.println("� ��������� ����� �� ����� ������� ���: " + mon10.getDay());
					}
				}
				if (!flag) {
					String description = "����� ����� �� ����";
					throw new WrongInputConsoleParametersException(description);
				}
				break;
			}
			}

		}
	}
	/**
	 * Checks if the month exists and returns a boolean expression
	 * 
	 * @param arrayMonths, month
	 * @return boolean expression
	 * 
	 */

	private static boolean ifMounthExists(Months[] arrayMos, String months) {
		boolean flag = false;
		for (Months m : arrayMos) {
			if (m.name().equals(months)) {

				flag = true;
			}
		}
		return flag;
	}

}
