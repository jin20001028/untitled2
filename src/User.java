public class User {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
    public  boolean pay(int money) {
        if(money>0){
            return true;
        }else{
            return false;
        }



    }
    public static void main(String arg[]){
        User u=new User();
        boolean b=u.pay(10);
        User i=new User();


    }
    public void i(){
        for(int a=0; a<=100; a++){
            if(a%2==0) {
                System.out.println(a);
            }
        }






    }
}



