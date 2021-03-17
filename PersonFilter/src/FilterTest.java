import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * Modify Information:
 * Author        Date          Description
 * ============ =========== ============================
 * jiyukun     2021年03月17日    Create this file
 * </pre>
 */
public class FilterTest {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            if (i%2==0){
                personList.add(new Person(String.valueOf(i),"man"));
            }else {
                personList.add(new Person(String.valueOf(i),"woman"));
            }
        }
        BoyFilter boyFilter = new BoyFilter();
        List<Person> boyList = boyFilter.filterList(personList);
        for (Person person : boyList) {
            System.out.println(person);
        }

    }
}