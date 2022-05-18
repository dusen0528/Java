import java.util.*;


public class Main{

    public static class Student{ //학생 객체 선언
        String studentName; //학생이름
        int money; //가진 돈

        public Student(){
            this.studentName="이름 없음";
            this.money=0;
        }

        public Student(String studentName, int money){
            this.studentName = studentName;
            this.money = money;
        }

        public void takeBus(Bus bus){ //버스를 탄다 버스에 돈이 증가하고 학생의 돈은 감소
            System.out.println(this.studentName+"님이 버스를 탑니다");
            bus.take(1000);
            this.money-=1000;
        }
        public void takeTaxi(Taxi taxi){//택시를 탄다 택시에 돈이 증가하고 학생의 돈은 감소
            System.out.println(this.studentName+"님이 택시를 탑니다");
            taxi.take(10000);
            this.money -= 10000;
        }
        public void takeSubway(Subway subway){ //지하철을 탄다 지하철에 돈이 증가하고 학생의 돈은 감소
            System.out.println(this.studentName+"님이 지하철을 탑니다");
            subway.take(1500);
            this.money -= 1500;
        }

        public void showInfo(){
            System.out.println(studentName+"님의 남은 돈은 "+money + "입니다");
        }

    }

    public static class Bus{
        int busNumber;
        int passengerCount;
        int money;
        public Bus(int busNumber){
            this.busNumber = busNumber;
        }
        public void take(int money){
            this.money += money;
            passengerCount++;
        }
        public void showInfo(){
            System.out.println(busNumber+"버스의 승객은 "+passengerCount+"명이고 수입은 "
                    + money + "입니다");
        }
    }

    public static class Taxi{
        int taxiNumber;
        int passengerCount;
        int money;
        public Taxi(int taxiNumber){
            this.taxiNumber=taxiNumber;
        }
        public void take(int money){
            this.money += money;
            passengerCount++;
        }
        public void showInfo(){
            System.out.println(taxiNumber+"택시의 승객은 "+passengerCount+"명이고 수입은 "
                    + money + "입니다");
        }
    }

    public static class Subway{
        String lineNumber;
        int passengerCount;
        int money;
        public Subway(String lineNumber){
            this.lineNumber = lineNumber;
        }
        public void take(int money){
            this.money += money;
            passengerCount++;
        }
        public void showInfo(){
            System.out.println(lineNumber+"호선 지하철의 승객은 "+passengerCount+"명이고 수입은 "
                    + money + "입니다");
        }
    }


    public static void main(String[] args) {

        Student James = new Student("James", 5000);
        Student Tomas = new Student("Tomas", 10000);
        Student Edward = new Student("Edward", 20000);

        Bus bus200 = new Bus(200); //200번 버스 객체 생성
        James.takeBus(bus200); //제임스가 200번 버스에 탑승
        James.showInfo();
        bus200.showInfo();

        Subway subwayGreen = new Subway("2호선"); //subwayGreen호선 지하철 객체 생성
        Tomas.takeSubway(subwayGreen); //토마스가 지하철에 탑승
        Tomas.showInfo();
        subwayGreen.showInfo();

        Taxi taxi4534 = new Taxi(4534); //4534번 택시 객체 생성
        Edward.takeTaxi(taxi4534); //에드워드가 택시 탑승
        Edward.showInfo();
        taxi4534.showInfo();

    }
}

