package lesson1.Marathon.competitors;

public class Main {
    public static void main(String[] args) {

        Competitor[] competitors = {new Human("Jon"), new Cat("Cocos"), new Dog("Chaba")};
        Obstacle[] obstacles = {new Cross(1000), new Wall(2), new Water(3)};

        Team team = new Team("Дом 23", competitors);

        System.out.println("Придумайте команду:");
        System.out.println(team.getTeamName());

        System.out.println("Члены команды:");
        team.showResults();

        Cource course = new Cource(obstacles);

        System.out.println("Прохождение Марафона:");
        course.doIt(team);

        System.out.println("Результаты команды");
        team.showResults();

        System.out.println("Члены команды прошедшие марафон:");
        team.showMembersFinishedCourse();
    }
}
