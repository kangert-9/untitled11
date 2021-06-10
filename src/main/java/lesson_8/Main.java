package lesson_8;

import java.util.ArrayList;
import java.util.List;

    public class Main {
        public static void main(String[] args) {

            List<Runnable_and_Jumpable> allObjects = new ArrayList<>();
            List<Object> allObstacle = new ArrayList<>();

            Person person1 = new Person(200, 20);
            Person person2 = new Person(400,10);


             Dog dog1 = new Dog(1000,30);
             Dog dog2 = new Dog(700,40);

              Robot robot1 = new Robot(2000, 100);
              Robot robot2 = new Robot(3000, 200);


            allObjects.add(person1);
            allObjects.add(person2);
            allObjects.add(dog1);
            allObjects.add(dog2);
            allObjects.add(robot1);
            allObjects.add(robot2);


            Wall wall1 = new Wall();
            Wall wall2 = new Wall();
            Wall wall3 = new Wall();

            Treadmill treadmill1 = new Treadmill();
            Treadmill treadmill2 = new Treadmill();
            Treadmill treadmill3 = new Treadmill();

            allObstacle.add(wall1);
            allObstacle.add(wall2);
            allObstacle.add(wall3);
            allObstacle.add(treadmill1);
            allObstacle.add(treadmill2);
            allObstacle.add(treadmill3);



            for (Object someObject : allObstacle) {
                for (int i = 0; i < allObjects.size(); i++) {
                    if (someObject instanceof Wall) {
                        allObjects.get(i).jump(20);
                        //allObjects.get(i).run(allObstacle.get(j).getMax_dist());
                        //allObjects.get(i).jump(allObstacle.get(j).getMax_height());
                    } else if (someObject instanceof Treadmill){
                        allObjects.get(i).run(100);
                    }
                }
            }
        }
    }



