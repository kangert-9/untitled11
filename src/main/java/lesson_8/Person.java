package lesson_8;

public class Person implements Runnable_and_Jumpable {
    private int maxRunDist;
    private int maxJumpHeight;

    public Person(int maxRunDist, int maxJumpHeight){
        this.maxRunDist=maxRunDist;
        this.maxJumpHeight=maxJumpHeight;
    }

    @Override
    public void run(int length) {
        if (length>maxRunDist){
            System.out.println("Человек столько не пробежит");
        } else {
            System.out.println("Человек пробежал ");
        }
    }

    @Override
    public void jump(int height) {
        if (height>maxJumpHeight){
            System.out.println("Человек столько не прыгнет");
        } else {
            System.out.println("Человек перепрыгнул ");
        }
    }

    public int getMaxRunDist() {
        return maxRunDist;
    }

}