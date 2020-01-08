/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

    public static int[] roll(int numOfRolls){
        int max = 6;
        int min = 1;
        int range = max - min + 1;

        int returnArray[] = new int[numOfRolls];

        for (int i = 0; i < numOfRolls; i++){
            returnArray[i] = (int)(Math.random() * range) + min;
        }
        return returnArray;
    }

    public static boolean containsDuplicates(int[] array){
        for (int i = 0; i < array.length; i++){
            for (int j = i + 1 ; j < array.length; j++){
                if (array[i] == array[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int average(int[] array){
        int accumulator = 0;
        for(int value : array){
            accumulator += value;
        }
        return  accumulator / array.length;
    }

    public static int[] arrayOfArrays(int[][] arrays){
        int average[] = new int[arrays.length];
        int total[] = new int[arrays[0].length];
        int sum = 0;
        int determinant = 0;
        for (int i = 0; i < arrays.length; i++){
            for (int j = 0; j < arrays[0].length; j++){
                total[i] = sum + arrays[i][j];
            }
            average[i] = total[i] / arrays.length;
        }
        for (int x = 0; x < average.length; x++){
            for (int y = x + 1; y < average.length; y++){
                if (average[x] > average[y]){
                    determinant = x;
                }
            }
        }
        return arrays[determinant];
    }

        }
