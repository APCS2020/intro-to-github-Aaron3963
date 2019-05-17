public class test_tools{
    public static void main(String[] args) {
        int side_length = tools.getLine("How long do you want to print in each line:");
        int column = tools.getColumn();
        String str = tools.getchar();
        int num = tools.getNum();
        tools.printNumRectangle(num, column, side_length, str);
    }
}