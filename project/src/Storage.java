import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class Storage implements Serializable{
	/*public static Vector<Teacher> vecT;
	public static Vector<Manager> vecM;
    public static Vector<Student> vecS;
    public static Vector<Executor> vecE;*/

    public static Vector<Course> courses = new Vector<Course>();
    public static Vector<String> newsVec = new Vector<String>();
    public static LinkedHashMap<Student, Integer> marks = new LinkedHashMap<Student, Integer>();
    public static Vector<Order> orders = new Vector<Order>();
    //public static HashMap<Course, Vector<Student>> regedStu = new HashMap<Course, Vector<Student>>();

    public static LinkedHashMap<Integer, Teacher> mapT = new LinkedHashMap<Integer, Teacher>();
    public static LinkedHashMap<Integer, Manager> mapM = new LinkedHashMap<Integer, Manager>();
    public static LinkedHashMap<Integer, Student> mapS = new LinkedHashMap<Integer, Student>();
    public static LinkedHashMap<Integer, Executor> mapE = new LinkedHashMap<Integer, Executor>();
    static FileInputStream fis;
    static FileOutputStream fos;
    static ObjectOutputStream oos;
    static ObjectInputStream oin;

    public static Map<Integer, String> idPass=  new LinkedHashMap<Integer,String>();
    //public static LinkedHashMap<Teacher, regedStu> regedTeach = new LinkedHashMap<Teacher, regedStu>();


    public static String ViewManager() {
        String s = "";
        int cnt = 1;
        for(Manager value:mapM.values()) {
            s += cnt +" "+value;
            cnt++;
        }
        return s;
    }

    public static String ViewExecutor() {
        String s = "";
        int cnt = 1;
        for(Executor value:mapE.values()) {
            s += cnt +" "+value;
            cnt++;
        }
        return s;
    }


    public static String viewTeacher() {
        String s = "";
        int cnt = 1;
        for(Teacher value:mapT.values()) {
            s += cnt +" "+value;
            cnt++;
        }
        return s;
    }
    public static boolean showOrders(){
        if(orders.size()==0) {
            System.out.println("No orders yet...");
            return false;
        }
        for(int i=0; i<orders.size(); i++)
            System.out.println(i+1+ ")" +orders.get(i));
        return true;
    }
    public static boolean showCourses(){
        if(courses.size()==0) {
            System.out.println("No courses yet...");
            return false;
        }
        for(int i=0; i<courses.size(); i++)
            System.out.println(i+1+ ")" +courses.get(i));
        return true;
    }
    public static boolean showNews(){
        if(newsVec.size()==0) {
            System.out.println("No news yet...");
            return false;
        }
        for(int i=0; i<newsVec.size(); i++)
            System.out.println(i+1+ ")" +newsVec.get(i));
        return true;
    }
    public static boolean showStudent(){
        if(mapS.values().size()==0) {
            System.out.println("No student yet...");
            return false;
        }
        String s = "";
        int cnt = 1;
        for(Student value:mapS.values()) {
            //s+=cnt +" "+value;
            System.out.println(cnt+" "+value);
            cnt++;
        }
        return true;
    }
    public static boolean showTeacher(){
        if(mapT.values().size()==0) {
            System.out.println("No teachers yet...");
            return false;
        }
        String s = "";
        int cnt = 1;
        for(Teacher value:mapT.values()) {
            //s+=cnt +" "+value;
            System.out.println(cnt+" "+value);
            cnt++;
        }
        return true;
    }
    public static boolean showExecutor(){
        if(mapE.values().size()==0) {
            System.out.println("No orders yet...");
            return false;
        }
        String s = "";
        int cnt = 1;
        for(Executor value:mapE.values()) {
            s+=cnt +" "+value;
            System.out.println(s);
            cnt++;
        }
        return true;
    }
    
    /*public static void regOnCourse(Course c, Student s) {
    	for(Entry<Course, Vector<Student>> entry : regedStu.entrySet()) {
    		if(c.equals(entry.getKey()))
    			entry.getValue().add(s);
    	}
    }*/

    public static boolean checkPassword(int id,String pass){
        if(idPass.values().size()==0) {
            System.out.println("No users yet...");
            return false;
        }
        for(Entry<Integer, String> entry : idPass.entrySet()) {
            if(entry.getKey()==id && pass.equals(entry.getValue()));
            return true;
        }

        return false;
    }

    public static void desStudents() throws IOException, ClassNotFoundException{
        fis = new FileInputStream("students.out");
        oin = new ObjectInputStream(fis);
        mapS=  (LinkedHashMap<Integer, Student>) oin.readObject();
    }
    public static void serStudents()throws IOException{
        fos = new FileOutputStream("students.out");
        oos = new ObjectOutputStream(fos);
        oos.writeObject(mapS);
        oos.close();
    }
    public static void desExecutor() throws IOException, ClassNotFoundException{
        fis = new FileInputStream("executors.out");
        oin = new ObjectInputStream(fis);
        mapE=  (LinkedHashMap<Integer, Executor>) oin.readObject();
    }
    public static void serExecutor()throws IOException{
        fos = new FileOutputStream("executors.out");
        oos = new ObjectOutputStream(fos);
        oos.writeObject(mapE);
        oos.close();
    }
    public static void desManager() throws IOException, ClassNotFoundException{
        fis = new FileInputStream("managers.out");
        oin = new ObjectInputStream(fis);
        mapM=  (LinkedHashMap<Integer, Manager>) oin.readObject();
    }
    public static void serManager()throws IOException{
        fos = new FileOutputStream("managers.out");
        oos = new ObjectOutputStream(fos);
        oos.writeObject(mapM);
        oos.close();
    }
    public static void desTeacher() throws IOException, ClassNotFoundException{
        fis = new FileInputStream("teachers.out");
        oin = new ObjectInputStream(fis);
        mapT=  (LinkedHashMap<Integer, Teacher>) oin.readObject();
    }
    public static void serTeacher()throws IOException{
        fos = new FileOutputStream("teachers.out");
        oos = new ObjectOutputStream(fos);
        oos.writeObject(mapT);
        oos.close();
    }
    public static void desIdPass() throws IOException, ClassNotFoundException{
        fis = new FileInputStream("idAndPass.out");
        oin = new ObjectInputStream(fis);
        idPass=  (LinkedHashMap<Integer, String>) oin.readObject();
    }
    public static void serIdPass()throws IOException{
        fos = new FileOutputStream("idAndPass.out");
        oos = new ObjectOutputStream(fos);
        oos.writeObject(idPass);
        oos.close();
    }
    public static void desCourses() throws IOException, ClassNotFoundException{
        fis = new FileInputStream("courses.out");
        oin = new ObjectInputStream(fis);
        courses=  (Vector<Course>) oin.readObject();
    }
    public static void serCourses()throws IOException{
        fos = new FileOutputStream("courses.out");
        oos = new ObjectOutputStream(fos);
        oos.writeObject(courses);
        oos.close();
    }
    public static void desNews() throws IOException, ClassNotFoundException{
        fis = new FileInputStream("news.out");
        oin = new ObjectInputStream(fis);
        newsVec=  (Vector<String>) oin.readObject();
    }
    public static void serNews()throws IOException{
        fos = new FileOutputStream("news.out");
        oos = new ObjectOutputStream(fos);
        oos.writeObject(newsVec);
        oos.close();
    }
    public static void desMarks() throws IOException, ClassNotFoundException{
        fis = new FileInputStream("marks.out");
        oin = new ObjectInputStream(fis);
        marks=  (LinkedHashMap<Student, Integer>) oin.readObject();
    }
    public static void serMarks()throws IOException{
        fos = new FileOutputStream("marks.out");
        oos = new ObjectOutputStream(fos);
        oos.writeObject(marks);
        oos.close();
    }
    public static void desOrders() throws IOException, ClassNotFoundException{
        fis = new FileInputStream("orders.out");
        oin = new ObjectInputStream(fis);
        orders=  (Vector<Order>) oin.readObject();
    }
    public static void serOrders()throws IOException{
        fos = new FileOutputStream("orders.out");
        oos = new ObjectOutputStream(fos);
        oos.writeObject(orders);
        oos.close();
    }

	/*public static void regedStu(Course course, Student s) {
		for(Entry<Course, Vector<Student>> entry : regedStu.entrySet()) {
    		if(course.equals(entry.getKey()))
    			entry.getValue().add(s);
		}
	}
	public static boolean getRegStu(Course c) {
		for(Entry<Course, Vector<Student>> entry : regedStu.entrySet()) {
    		if(c.equals(entry.getKey()))
    			System.out.println(entry.getValue());
		}
		return true;
	}*/
 
    
    /*public void serialize(Vector<Object> v) { // to store all vectors
    	try {
    		FileOutputStream f = new FileOutputStream("store.out");
    		ObjectOutputStream o = new ObjectOutputStream(f);
    		o.writeObject(v);
    		o.flush();
    		o.close();
    		f.close();
    	}catch(IOException e) {
    		e.printStackTrace();
    	}
    }*/
}