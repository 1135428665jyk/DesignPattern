import java.util.List;

/**
 * <pre>
 * Modify Information:
 * Author        Date          Description
 * ============ =========== ============================
 * jiyukun     2021年03月17日    Create this file
 * </pre>
 */
public interface PersonFilter {
    public List<Person> filterList(List<Person> persons);
}