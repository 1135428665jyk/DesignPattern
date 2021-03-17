import java.util.List;
import java.util.stream.Collectors;

/**
 * <pre>
 * Modify Information:
 * Author        Date          Description
 * ============ =========== ============================
 * jiyukun     2021年03月17日    Create this file
 * </pre>
 */
public class BoyFilter implements PersonFilter{
    @Override
    public List<Person> filterList(List<Person> persons) {
        return persons.stream().filter(person->"man".equals(person.getSex())).collect(Collectors.toList());
    }
}