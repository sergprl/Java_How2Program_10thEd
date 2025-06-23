package School;

public class Increment {
    public static void main(String[] args) {
        int c = 5;

        // post incrementing
        System.out.printf("-- Post incrementing --%n");
        System.out.printf("original c: %d%n", c);
        System.out.printf("postincrementing c: %d%n", c++);
        System.out.printf("after postincrementing c: %d%n",c);

        System.out.println();

        // pre incrementing
        System.out.printf("-- Pre incrementing --%n");
        System.out.printf("c before preincrementing: %d%n", c);
        System.out.printf("preincrementing c: %d%n", ++c);
        System.out.printf("c after preincrement: %d%n", c);

    }
}
