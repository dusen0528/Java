public class Main {

    public static void main(String[] args) {
        People grandParent = new GrandParent("할아버지",70); //GrandParent 객체 생성
        People parent = new Parent("엄마",50);//Parent 객체 생성
        People child = new Child("나",20);//Child 객체 생성

        People[] peoples = {grandParent,parent,child}; //객체 배열 peoples 선언
        for(People people:peoples){ //배열 안의 요소들을 모두 출력
            System.out.println(people.name+ ",나이 "+people.age+",속도 "+people.speed+",위치 "+people.getLocation());
        }
        System.out.println("********활동시작******** ");
        for(People people:peoples){
            if (people instanceof Walkable) {
                //instanceof 연산자는 객체가 어떤 클래스인지, 상속받은 클래스가 어떤 것인지 확인할때 사용
                //people이 Walkable을 상속 받았을때
                ((Walkable) people).walk(1, 1);
                System.out.println(" - - - - - - ");
            }
            if (people instanceof Runnable) {
                //people이 Runnable을 상속 받았을때
                ((Runnable) people).run(2, 2);
                System.out.println(" - - - - - - ");
            }
            if (people instanceof Swimmable) {
                //people이 Swimmable을 상속 받았을때
                ((Swimmable) people).swim(3, -1);
                System.out.println(" - - - - - - ");
            }

        }
    }
}