package day8;

public class Task1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");

        long before = System.currentTimeMillis();

        for (int i = 0; i <= 20000; i++) {
            sb.append(i).append(" ");
        }

        long after = System.currentTimeMillis();
        System.out.println(sb.toString());
        System.out.println("Time with sb method: " + (after - before));


        long before1 = System.currentTimeMillis();

        for (int i = 0; i <= 20000; i++) {
            String string = i + " ";
            System.out.print(string);
        }
        System.out.println();

        long after1 = System.currentTimeMillis();
        System.out.println("Time with String method: " + (after1 - before1));

    }

}
