import java.util.Collections;
import java.util.List;

public class StreamServise {
    private List<StudentGroup> st;

    public List SortListStream(StudentGroup o1, StudentGroup o2) {
        List st = Collections.singletonList(new StreamComparator());
        Collections.sort(st);
        return st;
    }

}





