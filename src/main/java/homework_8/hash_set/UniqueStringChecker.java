    package homework_8.hash_set;

    import java.util.ArrayList;
    import java.util.HashSet;
    import java.util.List;
    import java.util.Set;

    public class UniqueStringChecker {
                /*
            Задача 3:
            Реализуйте метод, который принимает
            List<String> и возвращает Set<String> без дубликатов.
             */

        private List<String> nonUniqueItemsList;

        public UniqueStringChecker() {
            this.nonUniqueItemsList = new ArrayList<>();
        }

        public void addElementToList(String e) {
            nonUniqueItemsList.add(e);
        }

        public void removeDupes() {
            HashSet<String> uniqueItemsList = new HashSet<>();
            uniqueItemsList.addAll(nonUniqueItemsList);
            System.out.println(uniqueItemsList);
        }
    }
