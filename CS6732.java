import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class CS6732 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the first list (e.g., [a,b,c]): ");
            String firstListInput = scanner.nextLine();
            System.out.print("Enter the second list (e.g., [1,2,3]): ");
            String secondListInput = scanner.nextLine();

            List<String> firstList = parseList(firstListInput);
            List<String> secondList = parseList(secondListInput);

            if (firstList.size() != secondList.size()) {
                System.out.println("Error: The lists are not of equal length.");
            } else {
                List<String> combinedList = combineLists(firstList, secondList);
                System.out.println("Combined List: " + combinedList);
            }

            scanner.close();
        }

        private static List<String> parseList(String input) {
            List<String> list = new ArrayList<>();
            String[] items = input.replaceAll("\\[|\\]", "").split(",");
            for (String item : items) {
                list.add(item.trim());
            }
            return list;
        }

        private static List<String> combineLists(List<String> list1, List<String> list2) {
            List<String> combinedList = new ArrayList<>();
            for (int i = 0; i < list1.size(); i++) {
                combinedList.add(list1.get(i));
                combinedList.add(list2.get(i));
            }
            return combinedList;
        }
    }

