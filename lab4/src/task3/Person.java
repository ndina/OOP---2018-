package task3;

    public class Person {
        public String name;

        public Person(){} // чтобы в Employee вызвать пустой конструктор
        public Person(String name){
            this.name = name;
        }
        public void setName(String newName){
            name = newName;
        }
        public String getName(){
            return name;
        }
        public String toString(){
            return "Person's name is " + name;
        }

        public boolean equals(Person person){
            return name.equals(person.name);
        }
    }

