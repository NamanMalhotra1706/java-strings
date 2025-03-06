// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

public class VowelsNConsonants {

   public static int[] vowelsAndConsonantsCount(String var0) {
      int var1 = 0;
      int var2 = 0;

      for(int var3 = 0; var3 < var0.length(); ++var3) {
         if (var0.charAt(var3) != ' ') {
            if (var0.charAt(var3) != 'A' && var0.charAt(var3) != 'E' && var0.charAt(var3) != 'O' && var0.charAt(var3) != 'I' && var0.charAt(var3) != 'U') {
               if (var0.charAt(var3) != 'a' && var0.charAt(var3) != 'e' && var0.charAt(var3) != 'i' && var0.charAt(var3) != 'o' && var0.charAt(var3) != 'u') {
                  ++var2;
               } else {
                  ++var1;
               }
            } else {
               ++var1;
            }
         }
      }

      return new int[]{var1, var2};
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter the string: ");
      String var2 = var1.nextLine();
      int[] var3 = vowelsAndConsonantsCount(var2);
      System.out.println("Vowel Count: " + var3[0]);
      System.out.println("Consonants Count: " + var3[1]);
   }
}

// Sample Cases
// Enter the string: Naman Malhotra
// Vowel Count: 5
// Consonants Count: 8