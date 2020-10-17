package OCT17;

public class Test {
    public static void main(String[] args) {

        Employee employee = new Employee() {




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


        };
        employee.setName("Le Hoang", " Ba");
        employee.setAge(20);
        employee.setEmail("abc123@gmail.com");
        employee.setAddress("123 Ho Bac");
        employee.setPhonenumber("0946829922");
        employee.setRatio(2);
        employee.print();
        System.out.println("====================");



        Manager manager = new Manager();
        manager.setName("Le Thi" ," A");
        manager.setAge(21);
        manager.setEmail("bcd123@gmail.com");
        manager.setAddress("223 Cam Le");
        manager.setPhonenumber("09842227792");
        manager.setRatio1(2);
        manager.print();
        System.out.println("====================");


        Director director = new Director();
        director.setName("Tran Le ", "Danh");
        director.setAge(49);
        director.setEmail("danh1234@gmail.com");
        director.setAddress("124 Le Duan");
        director.setPhonenumber("09387592223");
        director.setRatio2(2);
        director.print();
        System.out.println("====================");



        TrialEmployee trialEmployee = new TrialEmployee();
               trialEmployee.setName("Do Ba", " Hoang");
               trialEmployee.setAge(19);
               trialEmployee.setEmail("HoangBa123@gmail.com");
               trialEmployee.setAddress("235 Nguyen Van Linh");
               trialEmployee.setPhonenumber("092820842774");
               trialEmployee.setRatio3(1);
               trialEmployee.print();
        System.out.println("====================");


    }
}
