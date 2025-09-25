public class Person {
    private String name;
    private int age;
    private String city;

    public Person(String name, int age, String city){
        setName(name);
        setAge(age);
        setCity(city);
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getCity(){
        return city;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setCity(String city){
        this.city = city;
    }

    public void quiVousEtes(){
        System.out.println("Vous avez " + getAge() + " ans et votre nom est " + getName());
        System.out.println("Vous habitez à " + getCity());
    }

    public void bonjour(){
        System.out.print("Bonjour " + getName() + ", ");
    }
}
