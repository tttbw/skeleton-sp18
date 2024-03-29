import static org.junit.Assert.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class TestArrayDequeGold {

    ArrayDequeSolution<Integer> correct = new ArrayDequeSolution<>();
    StudentArrayDeque<Integer> student = new StudentArrayDeque<>();
    public List<String> log = new ArrayList<>();
    @Test
    public void TestStudentDequeAddFirst() {
        int i = 0;
        int k = 0;
        while (i < 100) {
            int rand = StdRandom.uniform(30);
            correct.addFirst(rand);
            student.addFirst(rand);
            Integer correctAdd = correct.get(k);
            Integer studentAdd = student.get(k);
            assertEquals(correctAdd,studentAdd);
            i ++;
        }
        System.out.print("AddFirst Test pass!!\n" );
    }
    @Test
   public void TestStudentDequeAddLast() {
        int i = 0;
        int k = 0;
        while (i < 100) {
            int rand = StdRandom.uniform(30);
            correct.addLast(rand);
            student.addLast(rand);
            Integer correctAdd = correct.get(k);
            Integer studentAdd = student.get(k);
            assertEquals(correctAdd,studentAdd);
            i ++;
            k ++;
        }
        System.out.print("AddLast Test pass!!\n");
    }
    @Test
    public void TestStudentDequeRmFirst() {
        makeTwoSameDeque(correct,student);
        int i = 0;
        while (i < 20) {
            Integer correctRm = correct.removeFirst();
            Integer studentRm = student.removeFirst();
            assertEquals("\n RemoveFirst Test fail:"+"\n"+log.get(i) + "removeFirst()",correctRm,studentRm);
            i ++;
        }
        System.out.print("RemoveFirst Test pass!!\n" );
    }
    @Test
    public void TestStudentDequeRmLast() {
        makeTwoSameDeque(correct,student);
        int i = 19;
        while (i >= 0) {
            Integer correctRm = correct.removeLast();
            Integer studentRm = student.removeLast();
            assertEquals("\n RemoveLast Test fail:"+"\n"+log.get(i) + "removeLast()",correctRm,studentRm);
            i --;
        }
        System.out.print("RemoveLast Test pass!!\n" );
    }


    public void makeTwoSameDeque(Deque<Integer> a,StudentArrayDeque<Integer> b) {
        /** take in a Deque and StudentDeque
         * return two same Deque
         */
        int i = 0;
        while (i < 20) {
            int rand = StdRandom.uniform(30);
            log.add("addLast(" + rand +")\n");
            a.addLast(rand);
            b.addLast(rand);
            i ++;
        }
    }
}
