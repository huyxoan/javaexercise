package Sep01;

public class ThapRua {
    public static void main(String[] args) {
        int n = 10;
        move("A", "B", "C", n);
    }

    static void move(String source, String target, String temp, int count){
        if(count == 1){
            System.out.println("Move 1 from " + source + " to " + target);
        }else{
            move(source, temp, target, count - 1);
            move(source, target, temp, 1);
            move(temp, target, source, count - 1);
        }
    }
}
