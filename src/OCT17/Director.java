package OCT17;

public class Director extends Employee {
    private int Ratio2;

    public Director(){

    }

    @Override
    public String toString() {

        return "He so luong " + Ratio2;

    }

   public Director(int radio) {

        this.Ratio2 = radio;

    }


    public int getRatio2() {

        return Ratio2;

    }

    public void setRatio2(int ratio2) {

        Ratio2 = ratio2;

    }

    public int getsalary() {

        return (5000000 * Ratio2 + 4000000);

    }



    @Override
    public void setName() {

    }

    @Override
    public void setAge() {

    }

    @Override
    public void setEmail() {

    }

    @Override
    public void setAddress() {

    }

    @Override
    public void setPhonenumber() {

    }

    @Override
    public void setRatio() {

    }
}





