package lesson1.Marathon.competitors;

public class Human implements Competitor{
    String name;
    int maxRunDistance;
    int maxJumpHeight;
    int maxSwimDistance;
    boolean onDistance;

    public boolean isOnDistance() {
        return onDistance;
    }

    public Human(String name) {
        this.name = name;
        this.maxRunDistance = 700;
        this.maxJumpHeight = 2;
        this.maxSwimDistance = 30;
        this.onDistance = true;
    }

    public void run(int distance){
        if (distance <=maxRunDistance){
            System.out.println(name + " " + " успешно пробежал!");
        } else {
            System.out.println(name + " " + " не прошел испытание!");
            onDistance = false;
        }
    }

    public void jump(int height){
        if (height <=maxJumpHeight){
            System.out.println(name + " " + "  успешно прыгнул!");
        } else {
            System.out.println(name + " " + " не прошел испытание!");
            onDistance = false;
        }
    }

    public void swim(int distance){
        if (distance <=maxSwimDistance){
            System.out.println(name + " " + " успешно проплыл!");
        } else {
            System.out.println(name + " " + " не прошел испытание!");
            onDistance = false;
        }
    }

    public void showResult(){
        System.out.println(name + ": " + onDistance);
    }

}
