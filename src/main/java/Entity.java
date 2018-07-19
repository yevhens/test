public class Entity {

    private String name;
    private int age;
    private int id;
    private boolean likeshotdogs;


    public Entity(String name, int age, int id, boolean likeshotdogs) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.likeshotdogs = likeshotdogs;
    }

    public Entity changeAge(int newage){
        this.age=newage;
        return  this;
    }

    public Entity doesnotlikehotdogs(){
        if (this.age>50){
            this.likeshotdogs=false;
        }
        return this;
    }

    @Override
    public String toString() {
        return "Entity{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", likeshotdogs=" + likeshotdogs +
                '}';
    }
}

