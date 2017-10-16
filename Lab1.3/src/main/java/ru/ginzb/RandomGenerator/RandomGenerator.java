package ru.ginzb.RandomGenerator;
import java.util.Arrays;
import java.util.Random;

class RandomGenerator {
   public static void main(String[] args) throws Throwable {
      if (args.length < 2) {
         throw new Error("Lack of arguments, input format must be: <password length> <possible symbols>");
      }
      final Random random = new Random();
   	int length = Integer.valueOf(args[0]);
   	String stringOfPossibleSymbols = args[1];
      String[] possibleSymbols = stringOfPossibleSymbols.split("");
   	String[] password = new String[length];
      String passwordstring = "";
   	if (length <= 0) {
   		throw new Error("Password can not be 0 or less symbols");
   	}
   	if (possibleSymbols.length == 0) {
   		throw new Error("More than 0 symbols needed");
   	}
   	for(int i = 0; i < length; i++) {
   		password[i] = possibleSymbols[random.nextInt(possibleSymbols.length)];
   	}
   	for(int i = 0; i < password.length; i++) {
   		passwordstring += password[i];
   	}
      System.out.println(passwordstring);
   }
}