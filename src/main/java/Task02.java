public class Task02 {
    public static void main(String[] args) {
        int[][] numbers = {{1,0}, {1,2}};
        System.out.println(calculateSum(numbers));
    }

    public static int calculateSum(int[][] numbers) {
        if (numbers == null) {
            throw new RuntimeException("Массив null");
        }
        if (numbers.length != numbers[0].length) {
            throw new RuntimeException("Массив не квадратный");
        }
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j<numbers[0].length; j++){
                valid(numbers[i][j]);
                sum += numbers[i][j];
            }
        }
        return sum;
    }

    private static void valid(int value) {
        if (value != 0 && value != 1) {
            throw new RuntimeException("Значение должно быть 0 или 1");
        }
    }
}