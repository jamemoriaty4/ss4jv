
import entity.information;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

import java.util.Date;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        information in4 = new information(1,"dang",new Date(),"099999999","2700000f",1200000,1.2f);
        System.out.println(in4);

//        Khởi tạodđôi tượng
        information employee2 = new information(2,"danggg",new Date(),"hanoi","09999999",2000f,1.2f);
//        information employee3 = new information();
        System.out.println(employee2);

//        truy cập các thuộc tính , phương thức có quyển
        System.out.println(employee2.calSaraly());

    }
}