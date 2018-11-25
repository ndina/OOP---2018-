import java.io.*;
import java.util.*;

public class Tester {
    public static void save() throws IOException {
        Storage.serStudents();
        Storage.serExecutor();
        Storage.serManager();
        Storage.serTeacher();
        Storage.serIdPass();
        Storage.serMarks();
        Storage.serNews();
        Storage.serOrders();
        Storage.serCourses();
    }


    public static void main(String[] args) throws ClassNotFoundException, IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        if(new File("students.out").exists()) Storage.desStudents();
        if(new File("managers.out").exists()) Storage.desManager();
        if(new File("teachers.out").exists()) Storage.desTeacher();
        if(new File("executors.out").exists()) Storage.desExecutor();
        if(new File("idAndPass.out").exists()) Storage.desIdPass();
        if(new File("marks.out").exists()) Storage.desMarks();
        if(new File("news.out").exists()) Storage.desNews();
        if(new File("orders.out").exists()) Storage.desOrders();
        if(new File("courses.out").exists()) Storage.desCourses();

        Date t = new Date();
        int id;
        String password;

        save();
        try {
            exit:while(true) {
                System.out.println("\n1) Admin \n2) Manager \n3) Teacher \n4) Executor \n5) Student \n6) Exit ");
                int choice = Integer.parseInt(console.readLine());

                if(choice == 1) {
					/*BufferedReader ad1 = new BufferedReader(new FileReader("name.txt"));
					PrintWriter ad2 = new PrintWriter(new FileWriter("admin.txt"), true);*/

                    System.out.println("Enter your id");
                    id = Integer.parseInt(console.readLine()); // username console
                    while(id != 777) {
                        System.out.println("Bad id, try again!");
                        id = Integer.parseInt(console.readLine());
                    }

                    password = (console.readLine());
                    while(!password.equals("kbtu")) { // kbtu
                        System.out.println("Bad user password, try again!");
                        password = console.readLine();
                    }

                    admin:while(true) {
                        Admin ad = new Admin();
                        System.out.println("\n1) Add to system \n2) Remove from system \n3) Exit");
                        int adminChoice = Integer.parseInt(console.readLine());
                        if(adminChoice == 1) { // add to system
                            System.out.println("\n1) Manager \n2) Teacher \n3) Student \n4 Executor \n5) Exit");
                            int adminChoice1 = Integer.parseInt(console.readLine());
                            if(adminChoice1 == 1) {
                                System.out.println("Enter name, surname");//Manager
                                String name = console.readLine();
                                String sur = console.readLine();
                                id = Storage.mapM.size()+1000;
                                System.out.println("Manager's id "+id);
                                System.out.println("Type password");
                                String pass=console.readLine();
                                Storage.idPass.put(id, pass);
                                ad.addToSystem(name, sur, id, adminChoice1);
                                System.out.println(name+" manager is added");
                                save();
                            }
                            if(adminChoice1 == 2) {
                                System.out.println("Enter name, surname");//Teacher
                                String name = console.readLine();
                                String sur = console.readLine();
                                id = Storage.mapT.size()+100;
                                System.out.println("Teacher's id "+id);
                                System.out.println("Type password");
                                String pass=console.readLine();
                                Storage.idPass.put(id, pass);
                                ad.addToSystem(name, sur, id, adminChoice1);
                                System.out.println(name+" teacher is added");
                                save();
                            }
                            if(adminChoice1 == 3) {
                                System.out.println("Enter name, surname");//Student
                                String name = console.readLine();
                                String sur = console.readLine();
                                id = Storage.mapS.size()+1;
                                System.out.println("Student's id "+id);
                                System.out.println("Type password");
                                String pass=console.readLine();
                                Storage.idPass.put(id, pass);
                                ad.addToSystem(name, sur, id, adminChoice1);
                                System.out.println(name+" student is added");
                                save();
                            }
                            if(adminChoice1 == 4) {
                                System.out.println("Enter name, surname");//Executor
                                String name = console.readLine();
                                String sur = console.readLine();
                                id = Storage.mapE.size()+10000;
                                System.out.println("Executor's id "+id);
                                System.out.println("Type password");
                                String pass=console.readLine();
                                Storage.idPass.put(id, pass);
                                ad.addToSystem(name, sur, id, adminChoice1);
                                System.out.println(name+" executor is added");
                                save();
                            }
                            if(adminChoice1 == 5) {
                                continue admin;
                            }
                        }
                        if(adminChoice == 2) { // remove user from system
                            System.out.println("\n1) Manager \n2) Teacher \n3) Student \n4 Executor \n5) Exit");
                            int adminChoice1 = Integer.parseInt(console.readLine());
                            if(adminChoice1 == 1) {
                                System.out.println("Enter id");//Manager
                                id = Integer.parseInt(console.readLine());
                                ad.removeFromSystem(id, adminChoice1);
                                save();
                            }
                            if(adminChoice1 == 2) {
                                System.out.println("Enter id");//Teacher
                                id = Integer.parseInt(console.readLine());
                                ad.removeFromSystem(id, adminChoice1);
                                save();
                            }
                            if(adminChoice1 == 3) {
                                System.out.println("Enter id");//Student
                                id = Integer.parseInt(console.readLine());
                                ad.removeFromSystem(id, adminChoice1);
                                save();
                            }
                            if(adminChoice1 == 4) {
                                System.out.println("Enter id");//Executor
                                id = Integer.parseInt(console.readLine());
                                ad.removeFromSystem(id, adminChoice1);
                                save();
                            }
                            if(adminChoice1 == 5) { //exit
                                continue admin;
                            }
                        }
                        if(adminChoice == 3) { // exit
                            break admin;
                        }
                    }
                    //}
                }
                /////////////////////////////////////////////////////////////////////////
                ////////////////////////////////////////////////////////////////////////
                //Manager
                if(choice == 2) {
                    System.out.println("Enter your id and password");
                    id = Integer.parseInt(console.readLine()); // username console
                    password = console.readLine();

                    if(!Storage.checkPassword(id, password)) {

                        System.out.println("Bad id or password \n Try again");
                        id = Integer.parseInt(console.readLine()); // username console
                        password = console.readLine();
                    }

                    //if(name.equals(userName) && Integer.parseInt(pass) == password) {
                    manager:while(true) {
                        System.out.println(" \n1)  Create course \n2) Assign Course to Student \n3) Add news \n4) Assign salary \n5) Assign Teacher to Course \n6) Exit");
                        int adminChoice = Integer.parseInt(console.readLine());
                        if(adminChoice==1) { // create course
                            System.out.println("Enter course's title");
                            String title = console.readLine();
                            Course co = new Course(title);
                            Storage.courses.add(co);
                            System.out.println(title+" successfully added");
                            save();

                        }
                        if(adminChoice == 2) { // assign course
                            Vector ve = new Vector<Student>();
                            addCourseToStudent: while(true){
                                System.out.println("Choose course: (Enter number)");
                                if(!Storage.showCourses()) continue exit;
                                int i =Integer.parseInt(console.readLine())-1;

                                System.out.println("Choose teacher to which you want to add course: (Enter id)");
                                if(!Storage.showTeacher()) continue exit;
                                int in =Integer.parseInt(console.readLine());
                                Teacher r = Storage.mapT.get(in);
                                //Vector ve = new Vector<Student>();
                                System.out.println("Regeistered students");
                                //Storage.getRegStu(Storage.courses.get(i));
                                r.students.put(Storage.courses.get(i), ve);
                                System.out.println("Choose student to which you want to add course: (Enter id)");
                                if(!Storage.showStudent()) continue exit;
                                Student s = Storage.mapS.get(Integer.parseInt(console.readLine()));
                                ve.add(s);
                                //s.disciplines=new LinkedHashMap<Course,Integer>();
                                s.disciplines.put(Storage.courses.get(i),0);
                                System.out.println("Course "+Storage.courses.get(i) +" added to  "+s.getName());
                                System.out.println("\n 1) Add another course to some student  \n 2) Add Teacher \n 3) Return back \n 4) Exit");

                                save();
                                if(choice==1) continue addCourseToStudent;
                                if (choice==2) {
                                    //	ve.clear();


                                }
                                save();
                                if(choice==3) continue exit;
                                if(choice==4) {System.out.println("Bye!!!");
                                    save();
                                    break exit;}
                                break;
                            }

                        }
                        if(adminChoice == 3) { // add news
                            System.out.println("Enter news");
                            String s= console.readLine();
                            Manager.addNews(s);
                            save();
                        }
                        if(adminChoice == 4) { // assign salary
                            System.out.println("View executors");
                            if(!Storage.showExecutor()) continue manager;
                            save();
                        }
                        if(adminChoice == 5) {
                            if(!Storage.showCourses()) continue manager;
                            System.out.println("\nChoose course");
                            int choosedCourse = Integer.parseInt(console.readLine());
                            if(!Storage.showStudent()) continue manager;
                            System.out.println("\nChoose student");

                        }
                        if(adminChoice == 6) { // exit
                            break manager;
                        }
                    }
                    //}
                }

				/*
				////////////////////////////////////////////////////////////////////////
				//Teacher*/
                if(choice == 3) {
                    System.out.println("Enter your id and password");
                    id = Integer.parseInt(console.readLine()); // username console
                    password = console.readLine();
                    if(!Storage.checkPassword(id, password)) {

                        System.out.println("Bad user or password \n Try again");
                        id = Integer.parseInt(console.readLine()); // username console
                        password = console.readLine();
                    }

                    //if(name.equals(userName) && Integer.parseInt(pass) == password) {
                    teacher:while(true) {
                        Teacher t1 = Storage.mapT.get(id);
                        System.out.println("\n1) View Cources \n2) Add Order \n3)View news \n4) Exit");
                        int adminChoice = Integer.parseInt(console.readLine());
                        if(adminChoice == 1) { // view courses
                            List<Course> list = new ArrayList<Course>(t1.students.keySet());
                            int cnt = 1;
                            for(Course i: list) {
                                System.out.println(cnt+") "+i);
                                cnt++;
                            }
                            //print list 1. ... 2. ...
                            ///ask user to choose
                            // Course c = list.get(i-1);
                            // Vector <Student> studs = t1.students.get(c);
                            //Collections.sort(studs);
                            // print
                            System.out.println("\n Choose course");
                            int choosedCourse = Integer.parseInt(console.readLine());

                            System.out.println("\n1) View Student and add mark \n2) Add course file \n3) Exit");
                            int oper = Integer.parseInt(console.readLine());
                            if(oper == 1) { // view students
                                Course course = list.get(choosedCourse - 1);
                                Vector<Student> studs = t1.students.get(course);
                                //	Collections.sort(studs);
                                for(int i=0; i< studs.size();i++) {
                                    System.out.println(studs.get(i));
                                }
                                System.out.println("\n Choose student and put mark");
                                int chooseStud = Integer.parseInt(console.readLine());
                                int addMarks = Integer.parseInt(console.readLine());

                                t1.setGrade(chooseStud, course, addMarks);
                            }
                            if(oper == 2) { // add coursefile
                                Course course = list.get(choosedCourse - 1);
                                System.out.println("Enter bookTitle");
                                String s= console.readLine();
                                t1.addCourseFile(s, course);
                                System.out.println("Book is added");
                                //save();
                            }

                        }
                        if(adminChoice == 2) {// add order
                            System.out.println("What problem do you want to add? Enter problem and room");
                            String problem = console.readLine();
                            int roomNumb = Integer.parseInt(console.readLine());
                            Order order = new Order(problem, roomNumb);
                            Storage.orders.addElement(order);
                            System.out.println("Your order has been successfully added");
                            //save();
                        }
                        if(adminChoice == 3) {// view news
                            if(!Storage.showNews()) continue teacher;
                        }
                        if(adminChoice == 4) { // exit
                            break teacher;
                        }
                    }
                    //}
                }
                //////////////////////////////////////////////////////////////////
                /////////////////////////////////////////////////////////////////
                //Executor
                if(choice == 4) {
                    System.out.println("Enter your username and password");
                    id = Integer.parseInt(console.readLine()); // username console
                    password = console.readLine();
                    if(!Storage.checkPassword(id, password)) {

                        System.out.println("Bad user or password \n Try again \nEnter your id and password");
                        id = Integer.parseInt(console.readLine()); // username console
                        password = console.readLine();
                    }

                    //if(name.equals(userName) && Integer.parseInt(pass) == password) {
                    executor:while(true) {
                        Executor sasha = Storage.mapE.get(id);
                        System.out.println("\n1) Choose order \n2) View salary \n3) View news \n4) Exit");
                        int adminChoice = Integer.parseInt(console.readLine());
                        if(adminChoice == 1) { // choose order
                            if(!Storage.showOrders()) continue executor;// choose order
                            int chooseOrder= Integer.parseInt(console.readLine());
                            sasha.choose(Storage.orders.elementAt(chooseOrder-1));
                            //save();
                        }
                        if(adminChoice == 2) {
                            Manager.addExecutorSalary(sasha);
                            System.out.println(sasha.getSalary());// view salary
                            continue executor;
                        }
                        if(adminChoice == 3) {
                            if(!Storage.showNews()) continue executor; // view news
                        }
                        if(adminChoice == 4) { // exit
                            break executor;
                        }
                    }
                    //}
                }
                /////////////////////////////////////////////////////////////////////////
                ////////////////////////////////////////////////////////////////////////
                //Student
                if(choice == 5) {

                    System.out.println("Enter your username and password");
                    id = Integer.parseInt(console.readLine()); // username console

                    password = console.readLine();
                    if(!Storage.checkPassword(id, password)) {

                        System.out.println("Bad user or password \n Try again \nEnter your id and password");
                        id = Integer.parseInt(console.readLine()); // username console
                        password = console.readLine();
                    }
                    //if(name.equals(userName) && Integer.parseInt(pass) == password) {
                    student:while(true) {
                        Student st = Storage.mapS.get(id);
                        System.out.println("\n1) View courses \n2) View teachers \n3) View transcript \n4) View news \n5) Exit");
                        int adminChoice = Integer.parseInt(console.readLine());
                        if(adminChoice == 1) { // view courses
                            System.out.println(st.getDesciplines());
                        }
                        if(adminChoice == 2) { // view teachers
                            if(!Storage.showTeacher()) continue student;
                        }
                        if(adminChoice == 3) { // view transcript
                            System.out.println(st.getDesciplines());
                        }
                        if(adminChoice == 4) {
                            if(!Storage.showNews()) continue student; // view news
                        }
							/*if(adminChoice == 5) {  // register on course
								if(!Storage.showCourses()) continue exit;
								int i =Integer.parseInt(console.readLine())-1;

								System.out.println("Choose student to which you want to add course: (Enter number)");
								if(!Storage.showStudent()) continue exit;
								Student s = Storage.mapS.get(Integer.parseInt(console.readLine()));

								s.disciplines.put(Storage.courses.get(i),0);
								Storage.regedStu(Storage.courses.get(i), s);
								System.out.println("Course "+Storage.courses.get(i) +" added to  "+s.getName());
							}*/
                        if(adminChoice == 5) { // Exit
                            break student;
                        }
                    }
                    //}
                }
                if(choice == 6) {
                    System.out.println("Bye!!!");
                    break exit;
                }
            }
        }
        catch(IOException e1){
            e1.printStackTrace();
        }
		/*catch(IndexOutOfBoundsException e1) {
			System.out.println("No elements yet");
			continue ;
		}*/
    }

}