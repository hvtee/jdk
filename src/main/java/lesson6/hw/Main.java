package lesson6.hw;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int size = 1000;
        List<Integer> array = fillingTheArray(size);
        List<Integer> changesHisMind = new ArrayList<>();
        List<Integer> dontChangesHisMind = new ArrayList<>();
        changeSelect(size, array, changesHisMind);
        dontChangeSelect(size, array, dontChangesHisMind);

        System.out.println("Change decision");
        countingWinnings(changesHisMind);

        System.out.println("Do not change decision");
        countingWinnings(dontChangesHisMind);
    }

    public static int getRandomInt(int min, int max) {
        Random random = new Random();
        return random.ints(min, (max + 1)).findFirst().getAsInt();
    }

    public static List<Integer> fillingTheArray(int size) {
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            array.add(getRandomInt(1, 3));
        }
        return array;
    }

    public static int emptySlot(int prizeNumber, int rand) {
        int empty = 0;
        for (int i = 1; i < 4; i++) {
            if (i != prizeNumber && i != rand) {
                empty = i;
                break;
            }
        }
        return empty;
    }

    public static void changeSelect(int size, List<Integer> array, List<Integer> changesHisMind) {
        for (int i = 0; i < size / 2; i++) {
            int rand = getRandomInt(1, 3);
            int emptySlot = emptySlot(array.get(i), rand);
            for (int j = 1; j < 4; j++) {
                if (j == rand | j == emptySlot) {
                } else {
                    rand = j;
                    break;
                }
            }
            if (rand == array.get(i)) {
                changesHisMind.add(1);
            } else {
                changesHisMind.add(0);
            }
        }
        ;
    }

    public static void dontChangeSelect(int size, List<Integer> array, List<Integer> changesHisMind) {
        for (int i = size / 2; i < size; i++) {
            int rand = getRandomInt(1, 3);
            if (rand == array.get(i)) {
                changesHisMind.add(1);
            } else {
                changesHisMind.add(0);
            }
        }

    }

    public static void countingWinnings(List<Integer> array) {
        int countWin = 0;
        int countLoose = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) == 1) {
                countWin++;
            } else {
                countLoose++;
            }
        }
        System.out.println("Won: " + (countWin * 100) / array.size() + "%");
        System.out.println("Lose: " + (countLoose * 100) / array.size() + "%");
    }
}
