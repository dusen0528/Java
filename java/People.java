public class People {
    int age;
    String name;
    int x, y;
    int speed;

    public People(String name, int age, int spped, int x, int y) { //이름 나이 속도와 좌표를 입력받는 생성자
        this.name = name;
        this.age = age;
        this.speed = spped;
        this.x = x;
        this.y = y;
    }

    public People(String name, int age, int speed) { //이름 나이 속도만 입력해서 생성할경우 기본 좌표 0,0
        this(name, age, speed, 0, 0);
    }

    public String getLocation() { //현재 위치 출력하는 메소드
        return "(" + x + "," + y + ")";
    }

    public void printWhoAmI() { //현재 내가 누구인지 출력하는 메소드
        System.out.println("My name is " + name + " age:" + age);
    }


}
