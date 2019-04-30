import java.util.HashMap;
import java.util.Scanner;

/*
 * Day 8: Dictionaries and Maps
 */

class PhoneBook {
  public static void main(String[] args) {
    HashMap<String, Integer> phoneBook = new HashMap<>();
    Scanner scanner = new Scanner(System.in);
    int amountOfEntries = scanner.nextInt();

    for (int i = 0; i < amountOfEntries; i++) {
      String name = scanner.next();
      int phone = scanner.nextInt();
      phoneBook.put(name, phone);
    }
    while (scanner.hasNext()) {
      String nameForSearch = scanner.next();
      if (phoneBook.containsKey(nameForSearch)) {
        System.out.println(nameForSearch + "=" + phoneBook.get(nameForSearch));
      }
      else {
        System.out.println("Not found");
      }
    }
    scanner.close();
  }
}