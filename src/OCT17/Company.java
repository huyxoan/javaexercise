package OCT17;

public class Company {
    private String NameofCompany ;
    private String Nameofmanager;
    private String Listofemployee;

    public Company(){

    }
    public Company(String nameofCompany, String nameofmanager, String listofemployee){

        this.NameofCompany = nameofCompany;
        this.Nameofmanager = nameofmanager;
        this.Listofemployee = listofemployee;

    }

    public String getNameofCompany() {

        return NameofCompany;

    }

    public void setNameofCompany(String nameofCompany) {

        this.NameofCompany = nameofCompany;

    }

    public String getNameofmanager()

    {
        return Nameofmanager;
    }

    public void setNameofmanager(String nameofmanager) {

        this.Nameofmanager = nameofmanager;

    }

    public String getListofemployee() {

        return Listofemployee;

    }

    public void setListofemployee(String listofemployee)

    {
        this.Listofemployee = listofemployee;
    }

}
