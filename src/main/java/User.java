
public class User {
    //members - methods and properties.
    private String name;  // property
    private int age;
    private String talk;  // property.

    // Constructor.
    public User(){

    }
    public User(String name, int age, String talk){
        this.name = name;
        this.age = age;
        this.talk = talk;
    }

    // Getters and Setters.
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getTalk(){
        return talk;
    }
    public void setTalk(String talk){
        this.talk = talk;
    }

}
