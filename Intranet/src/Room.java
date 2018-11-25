import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Vector;

public class Room {
    public int numb;
    public Rooms roomType;
    public Vector<Room> roomVec = new Vector<Room>();
    public Room() {

    }
    public Room(int numb) {
        this.numb = numb;
    }
    public int getNumb() {
        return numb;
    }
    public void setNumb(int numb) {
        this.numb = numb;
    }

    public boolean isOpen(Room r) {
        if(roomVec.contains(r))
            return true;
        else
            return false;
    }
    public String toString() {
        return "Open rooms are: "+roomVec.toString();
    }

    public void serialize(Vector<Room> r) {
        try {
            FileOutputStream f = new FileOutputStream("room.out");
            ObjectOutputStream o = new ObjectOutputStream(f);
            o.writeObject(r);
            o.flush();
            o.close();
            f.close();
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}