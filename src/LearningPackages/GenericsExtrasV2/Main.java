package LearningPackages.GenericsExtrasV2;

import LearningPackages.GenericsExtrasV2.model.LPAStudent;
import LearningPackages.GenericsExtrasV2.model.LPAStudentComparator;
import LearningPackages.GenericsExtrasV2.util.QueryList;

import java.util.Comparator;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        QueryList<LPAStudent> queryList = new QueryList<>();

        for(int i = 0; i < 25; i++){
            queryList.add(new LPAStudent());
        }

        System.out.println("-".repeat(20) +" Ordered " + "-".repeat(20) );

        queryList.sort(Comparator.naturalOrder());
        printList(queryList);

        System.out.println("-".repeat(20) + " Matches " + "-".repeat(20) );
        var matches = queryList.getMatches("PercentComplete", "50").getMatches("Course", "Python");
        matches.sort(new LPAStudentComparator());

        printList(matches);


        System.out.println("-".repeat(20) + " Ordered " + "-".repeat(20) );

        matches.sort(null);
        printList(matches);
    }

    public static void printList(List<?> students ){
        for(var student:students){
            System.out.println(student);
        }
    }
}