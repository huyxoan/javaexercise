package OCT17;

public class Manager extends Employee {

    private int Ratio1;


    public Manager() {

    }

    @Override
    public String toString()

    {
        return "He so luong " + Ratio1;

    }

    public Manager(int ratio1){
        this.Ratio1 = ratio1;
    }

    public int getRatio1() {
        return Ratio1;
    }

    public void setRatio1(int ratio1) {
        Ratio1 = ratio1;
    }

    public int getsalary()

    {

        return (5000000* Ratio1 *2 + 10000000);

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
    public void setRatio(){

    }


    }


