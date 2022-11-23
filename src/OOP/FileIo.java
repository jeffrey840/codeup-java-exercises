package OOP;

public class FileIo {

//    asList status method :

//    List<String> groceryList = Arrays.asList("coffee", "milk", "sugar");
//    Path filepath = Paths.get("data", "groceries.txt");
//Files.write(filepath, groceryList);

//    After running the file data/groceries.txt
//coffee
//milk
//sugar

//===✅✅✅✅✅✅===✅✅✅✅✅✅===✅✅✅✅✅✅

//    Print out each line in an existing file, along with the line number :

//    Path groceriesPath = Paths.get("data", "groceries.txt");
//List<String> groceryList = Files.readAllLines(groceriesPath);
//
//for (int i = 0; i < groceryList.size(); i += 1) {
//    System.out.println((i + 1) + ": " + groceryList.get(i));
//}

//===✅✅✅✅✅✅===✅✅✅✅✅✅===✅✅✅✅✅✅

//    Add a line to an existing file

//    Files.write(
//    Paths.get("data", "groceries.txt"),
//    Arrays.asList("eggs"), // list with one item
//    StandardOpenOption.APPEND
//);

//===✅✅✅✅✅✅===✅✅✅✅✅✅===✅✅✅✅✅✅

//    Replace "milk" with "cream"

//    List<String> lines = Files.readAllLines(Paths.get("data", "groceries.txt"));
//List<String> newList = new ArrayList<>();
//
//for (String line : lines) {
//    if (line.equals("milk")) {
//        newList.add("cream");
//        continue;
//    }
//    newList.add(line);
//}
//
//Files.write(Paths.get("data", "groceries.txt"), newList);


}
