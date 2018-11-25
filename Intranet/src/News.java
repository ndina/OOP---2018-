import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;
public class News {
    public Manager m;
    public Vector<String> newsVec;

    public News() {
        newsVec = new Vector<String>();
    }

    public Vector<String> getNews() {
        return newsVec;
    }

    public void setNews(Vector <String> newsVec) {
        this.newsVec = newsVec;
    }

    public String toString() {
        return "The news are: "+newsVec.toString();
    }

    public void serialize(Vector<News> n) {
        try {
            FileOutputStream f = new FileOutputStream("news.out");
            ObjectOutputStream o = new ObjectOutputStream(f);
            o.writeObject(n);
            o.flush();
            o.close();
            f.close();
        }catch(IOException e) {
            e.printStackTrace();
        }
    }

}