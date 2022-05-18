public class Child extends People implements Walkable, Runnable, Swimmable {
    //Child 클래스는 People의 멤버들을 상속받고 Walkable, Runnable, Swimmable을 오버라이딩하여 사용
    public Child(String name, int age) {
        super(name, age, 5);
    }

    @Override
    public void run(int x, int y) {
        printWhoAmI();
        System.out.println("run speed: " + (speed + 2));
        this.x = x;
        this.y = y;
        System.out.println("Ran to " + getLocation());
    }

    @Override
    public void swim(int x, int y) {
        printWhoAmI();
        System.out.println("swimming speed: " + (speed + 1));
        this.x = x;
        this.y = y;
        System.out.println("swum to " + getLocation());
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
