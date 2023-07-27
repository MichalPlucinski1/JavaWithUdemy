package LearningPackages.GenericsExtrasV2.util;


import java.util.ArrayList;
import java.util.List;

public class QueryList extends ArrayList {



    public static <S extends QueryItem> List<S> getMatches(List<S> items,
                                                           String field, String value) {

        List<S> matches = new ArrayList<>();
        for (var item : items) {
            if (item.matchFieldValue(field, value)) {
                matches.add(item);
            }
        }
        return matches;
    }


}
