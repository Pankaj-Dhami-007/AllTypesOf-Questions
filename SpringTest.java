import java.util.HashMap;
import java.util.List;
import java.util.Map;

class JournalEntry{
    long id;
    String title;
    String content;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    
    @Override
    public String toString() {
        return "JournalEntry{" +
               "id=" + id +
               ", title='" + title + '\'' +
              ", content='" + content + '\'' +
              '}';
}

}


class JournalEntryController{

    Map<Long, JournalEntry> journalEntries = new HashMap<>();
    boolean createEntry(JournalEntry myEntry){

        journalEntries.put(myEntry.getId(),myEntry);
        return true;
    }

    String createContent(JournalEntry myEntry) {
        journalEntries.put(myEntry.getId(), myEntry);
        return myEntry.getContent();
    }
}
public class SpringTest {
    public static void main(String[] args) {
        
        JournalEntry myEntry = new JournalEntry();
        myEntry.setId(101);
        myEntry.setTitle("Topic");
        myEntry.setContent("Tell me about Yourself");
        JournalEntryController controller = new  JournalEntryController();
        boolean test = controller.createEntry(myEntry);

       System.out.println(test);
       System.out.println(myEntry);

    }
}
