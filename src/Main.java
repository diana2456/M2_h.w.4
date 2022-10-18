import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.ListIterator;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> A = new ArrayList<>();
        A.add("���");
        A.add("�");
        A.add("�����");
        A.add("���������");
        A.add("�������");
        System.out.println(A);
        ArrayList<String> B = new ArrayList<>();
        B.add("��");
        B.add("��������");
        B.add("������");
        B.add("����");
        B.add("����������");
        Collections.reverse(B);
        ArrayList<String> C = new ArrayList<>();
        ListIterator<String> listIter = A.listIterator();
        ListIterator<String> listter = B.listIterator();
        while (listIter.hasNext()){
            C.add(listIter.next());
            C.add(listter.next());
        }
        System.out.println(C);
        C.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        System.out.println(C);
    }
}