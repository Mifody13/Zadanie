import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class Zad1Test {
    @DisplayName("Тест массива, у которого нет повторяющихся элементов")
    @Test
    void noDobleNonRepeatTest() {
        int[] nonRepeat = new int[]{-1, 0, 1, 8, 12345};
        Assertions.assertArrayEquals(Zad1.noDoble(nonRepeat), nonRepeat);
    }

    @DisplayName("Тест массива, у которого элементы повторяются два раза")
    @Test
    void noDobleDoubleRepeatTest() {
        int[] doubleRepeat = new int[]{-1, 0, 1, 8, 0, 8, 9, 298};
        int[] result = new int[]{-1, 1, 9, 298};
        Assertions.assertArrayEquals(Zad1.noDoble(doubleRepeat), result);
    }

    @DisplayName("Тест массива, у которого все элементы повторяются")
    @Test
    void noDobleDoubleEmptyTest() {
        int[] empty = new int[]{-1, 0, 1, 8, 0, 8, 9, 298, -1, 1, 298, 9};
        int[] result = new int[0];
        Assertions.assertArrayEquals(Zad1.noDoble(empty), result);
    }

    @DisplayName("Тест массива, у которого элементы повторяются n кол-во раз")
    @Test
    void noDobleMultiRepeatTest() {
        int[] multiRepeat = new int[]{-1, 0, 1, 8, 0, 8, 9, 298, -1, 1, 298, 9, -1, 13, -298, 0, 0, -1, 9, -1, 0};
        int[] result = new int[]{13, -298};
        Assertions.assertArrayEquals(Zad1.noDoble(multiRepeat), result);
    }

    @DisplayName("Тест метода на заполнение массива")
    @Test
    void generateArrTest() {
        int arrLength = 18;
        int[] generateArr = Zad1.generateArr(arrLength);
        Assertions.assertEquals(generateArr.length, arrLength);
        for (int j : generateArr) {
            Assertions.assertTrue(j < 10 && j >= 0);
        }
    }

}
