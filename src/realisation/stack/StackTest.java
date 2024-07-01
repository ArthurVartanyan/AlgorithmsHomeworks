package realisation.stack;

public class StackTest {
    public static void main(String[] args) {

        Stack stack = new Stack(10);
        stack.add(0);
        stack.add(100);
        stack.add(-111);

        System.out.println(stack);

        int valueFromStack = stack.readTop();
        System.out.println(valueFromStack);

        System.out.println(stack);

        valueFromStack = stack.readTop();
        System.out.println(valueFromStack);

        System.out.println(stack);
    }
}
