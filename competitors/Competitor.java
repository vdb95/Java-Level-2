package lesson1.Marathon.competitors;

public interface Competitor {
    void run(int distance);
    void swim(int distance);
    void jump(int height);
    boolean isOnDistance();
    void showResult();
}

