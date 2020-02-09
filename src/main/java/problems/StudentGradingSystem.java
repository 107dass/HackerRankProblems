package problems;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class StudentGradingSystem {
    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> finalGrades = new ArrayList();
//        for (Integer num : grades) {
//            int curGrade = 0;
//            if (num < 38 || num%5 == 0 || (5 - num%5) > 2)
//                curGrade = num;
//            else
//                curGrade = num+ (5 - num%5);
//            finalGrades.add(curGrade);
//        }
        //return finalGrades;

        return grades.stream().map(num -> {
            if (num < 38 || num%5 == 0 || (5 - num%5) > 2)
                return num;
            else
                return num+ (5 - num%5);
        }).collect(toList());
    }

    public static void main(String[] args) throws IOException {
       List<Integer> grades = Arrays.asList(44,49);
        grades.forEach(System.out::println);
        System.out.println("After grading process");
        List<Integer> result = gradingStudents(grades);
        result.forEach(System.out::println);
    }
}
