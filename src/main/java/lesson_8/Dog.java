package lesson_8;


public class Dog  implements Runnable_and_Jumpable {
    private int maxRunDist;
    private int maxJumpHeight;

    public Dog(int maxRunDist, int maxJumpHeight){
        this.maxRunDist = maxRunDist;
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
    public void run(int length) {
        if (length>maxRunDist){
            System.out.println("Собака столько не пробежит");
        } else {
            System.out.println("Собака пробежала дистанцию");
        }
    }

    @Override
    public void jump(int height) {
        if (height>maxJumpHeight){
            System.out.println("Собака столько не прыгнет");
        } else {
            System.out.println("Собака перепрыгнула");
        }
    }
    public int getMaxRunDist() {
        return maxRunDist;
    }

}