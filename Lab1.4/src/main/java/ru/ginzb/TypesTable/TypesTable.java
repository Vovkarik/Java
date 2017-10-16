package ru.ginzb.TypesTable;

class TypesTable {

	public static void main(String[] args) {
		System.out.printf("%-10s %-50s %-50s %-4s \n", "Type", "Min", "Max", "Size");
		printLineFor("Byte", Byte.MIN_VALUE, Byte.MAX_VALUE, Byte.BYTES);
		printLineFor("Character", Character.MIN_VALUE, Character.MAX_VALUE, Character.BYTES);
		printLineFor("Short", Short.MIN_VALUE, Short.MAX_VALUE, Short.BYTES);
		printLineFor("Integer", Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.BYTES);
		printLineFor("Long", Long.MIN_VALUE, Long.MAX_VALUE, Long.BYTES);
		printLineFor("Float", -Float.MAX_VALUE, Float.MAX_VALUE, Float.BYTES);
		System.out.printf("%-10s %-50.0e %-50.0e %-4d \n", "Double", -Double.MAX_VALUE, Double.MAX_VALUE, Double.BYTES);
	}

	public static void printLineFor(String typeName, double minval, double maxval, int size){
		System.out.printf("%-10s %-50.0f %-50.0f %-4d \n", typeName, minval, maxval, size);
	}
}