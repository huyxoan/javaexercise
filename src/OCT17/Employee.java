package OCT17;

public abstract class Employee {
    private String name ;
    private int age ;
    private String email;
    private String address;
    private String phonenumber;
    private int ratio;

    public Employee() {

    }

    public Employee(String name , int age , String email , String address , String phonenumber , int ratio){
        this.name = name;
        this.age  = age ;
        this.email = email;
        this.address = address;
        this.phonenumber = phonenumber;
        this.ratio = ratio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setName(String firstname , String lastname){
        this.name = firstname + lastname ;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public int getRatio() {
        return ratio;
    }

    public void setRatio(int ratio) {
        this.ratio = ratio;
    }


    public int getsalary() {

        return  (5000000 * ratio + 1000000);

    }

    public void print(){
        System.out.println("Ten toi la " + getName() + " " + getAge() +" tuoi");
        System.out.println("Dia chi email " + getEmail() + ".Dia chi nha " + getAddress() + ".So dien thoai " + getPhonenumber());
        System.out.println("He so luong cua toi la " + getRatio());
        System.out.println("Luong cua toi la " + getsalary());
    }




    public abstract void setName();

    public abstract void setAge();

    public abstract void setEmail();

    public abstract void setAddress();

    public abstract void setPhonenumber();

    public abstract void setRatio();
}
