public class GrandParent extends People implements Walkable {
    //GrandParent 클래스는 People의 멤버들을 상속받고 선언만한 Walkable을 오버라이딩하여 사용하겠다.
    public GrandParent(String name, int age) { //이름과 나이만 입력하여 생성하고 기본속도는 1
        super(name, age, 1);
    }

    @Override
    public void walk(int x, int y) {
        printWhoAmI();
        System.out.println("walk speed: " + speed);
        this.x = x;
        this.y = y;
        System.out.println("walked to " + getLocation());
    }
}
