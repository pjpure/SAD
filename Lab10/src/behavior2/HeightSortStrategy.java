package behavior2;

import java.util.Comparator;
import java.util.List;

public class HeightSortStrategy implements SortStrategy {
    @Override
    public void customSort(List<Person> people) {
        people.sort(Comparator.comparingInt(Person::getHeight));
    }
}
