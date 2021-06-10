package lesson_8;


public class Robot implements Runnable_and_Jumpable {
    private int maxRunDist;
    private int maxJumpHeight;

    public Robot(int maxRunDist, int maxJumpHeight){
        this.maxRunDist = maxRunDist;
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
    public void run(int length) {
        if (length>maxRunDist){
            System.out.println("Робот столько не пробежит");
        } else {
            System.out.println("Робот пробежал дистанцию");
        }
    }

    @Override
    public void jump(int height) {
        if (height>maxJumpHeight){
            System.out.println("Робот столько не прыгнет");
        } else {
            System.out.println("Робот перепрыгнул");
        }
    }
    public int getMaxRunDist() {
        return maxRunDist;
    }

}
