package Aug27;

/***
 * 6. Nhập vào một chuỗi có thể chứa các số nguyên trộn lẫn với các ký tự khác. Tính tổng các số nguyên xuất hiện:
 * Ví dụ: chuỗi = "123 abcd 4.5 def 77" --> Kết quả là 123 + 4 + 5 + 77 = 209
 */
public class Bai01 {
    public static void main(String[] args) {
        //123 abcd 234 223 as s
        System.out.println(sum("abcd 123 shuwh 22.22 818 1,2,3! h12t34"));
        System.out.println(sum("123 abcd 4.5 def 77"));//209
        //"123" --> 123
    }

    private static int sum(String str){
        int sum = 0;
        int number = 0;

        for(int i=0;i<=str.length(); i++){
            if(i < str.length() && Character.isDigit(str.charAt(i))){
                number = 10 * number + str.charAt(i) - '0';
            }else{
                sum = sum + number;
                number = 0;
            }
        }

        return sum;
    }
}
