package OCT17;

public class Department {
    private String NameofDepartment ;
    private String nameofManager;
    private String Listofemployee;

    public Department(){

    }

    public Department(String nameofDepartment, String nameofManager , String listofemployee){
        this.NameofDepartment = nameofDepartment;
        this.nameofManager   = nameofManager;
        this.Listofemployee = listofemployee;
    }

    public String getNameofDepartment() {

        return NameofDepartment;

    }

    public void setNameofDepartment(String nameofDepartment) {

        this.NameofDepartment = nameofDepartment;

    }

    public String getNameofManager() {

        return nameofManager;

    }

    public void setNameofManager(String nameofManager){

        this.nameofManager = nameofManager;

    }

    public String getListofemployee() {

        return Listofemployee;

    }

    public void setListofemployee(String listofemployee){

        this.Listofemployee = listofemployee;

    }
}
