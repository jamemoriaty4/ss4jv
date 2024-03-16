package entity;

import java.util.Date;

public class information {
//    biến instance
    private int id;

    private String fullName;
    private Date birthDay;
    private String address;
    private String phoneNumber;
    private float salary;
    private float rate;

//    Constructor methods - dùng để khởi tạo đối tượng


    public information(int id, String fullName, Date birthDay, String address, String phoneNumber, float salary, float rate) {
        this.id = id;
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.rate = rate;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }


    @Override
    public String toString() {
        return "information{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", birthDay=" + birthDay +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", salary=" + salary +
                ", rate=" + rate +
                '}';
    }

    //    Các phương thức khác
//    tính lương
    public float calSaraly(){
        return salary*rate;
    }
}
