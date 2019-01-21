package Easy.Challenges;

public class N_Queens_Validator {
    public static void rowChecker(int[] positions) {
        for (int i = 0; i <= positions.length; i++) {
            for (int j = i + 1; j < positions.length; j++)
                if (positions[i] == positions[j]) {
                    System.out.println("Test Failed: Same Row: " + positions[i]);
                }
        }
    }

    public static void diagnolChecker(int[] positions) {
        for (int i = 0; i <= positions.length; i++) {
            for (int j = i; j < positions.length; j++) {
                if (i - 1 >= 0) {
                    if (positions[i] - (j) == positions[j] - 1 && j != 1) {
                        System.out.println("Test Failed: Diagnol Fail " + positions[i] + " " + positions[j] + " " + (j - 1));
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] position = new int[]{4, 3, 1, 8, 1, 3, 5, 2};
        rowChecker(position);
        diagnolChecker(position);
    }
}
