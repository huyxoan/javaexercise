package OCT17;

public class TrialEmployee extends Employee {
    private int Ratio3;

    public TrialEmployee(){

    }

    @Override
    public String toString(){

        return "He so luong" + Ratio3;

    }

    public TrialEmployee(int radio){
        this.Ratio3 = radio;

    }

    public int getRatio3() {
        return Ratio3;
    }

    public void setRatio3(int ratio3) {
        Ratio3 = ratio3;
    }

    public int getsalary()
    {

        return (int)(5000000* Ratio3 *(0.8));
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

