package school.mjc.stage0.loops.task5;

public class Hourglass {

    public void printHourglassOfGivenSize(int height) {
        char eight = '8';
        int sub = (int) Math.floor(height / 2);
        int divider = height % 2 == 0 ? 0 : 1;
        int underLoop = height % 2 == 0 ? 1 : 2;

        for (int i = height - sub; i >= 1; i--) {
            for (int j = i; j < height - sub; j++)
                System.out.print(' ');
            for (int j = 1; j <= i * 2 - divider; j++)
                System.out.print(eight);
            for (int j = i; j < height - sub; j++)
                System.out.print(' ');
            System.out.println();
        }
        for (int i = underLoop; i <= height - sub; i++) {
            for(int j = i; j < height - sub; j++)
                System.out.print(' ');

            for(int j = 1; j <= i * 2 - divider; j++)
                System.out.print(eight);
            for(int j = i; j < height - sub; j++)
                System.out.print(' ');
            System.out.println();
        }
    }
}
