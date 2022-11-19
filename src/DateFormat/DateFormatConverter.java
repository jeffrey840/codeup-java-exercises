package DateFormat;

import java.util.Scanner;

/*
* **Take in the following format:**

```MM/DD/YYYY```

**Output the following:**

```MonthName DD, YYYY```

**Example:**

input - ```12/01/1999```

output - ```December 12, 1999```
* */

public class DateFormatConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        System.out.println("Enter an integer: ");
        String nextLn = scanner.nextLine();
        System.out.println("MM/DD/YYYY");
    }





}
