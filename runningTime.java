import java.io.*;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'runningTime' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int runningTime(List<Integer> arr) {
        // Write your code here
        int n = arr.size() - 1;
        int numOfSwaps = 0;
        int sort = arr.get(n - 1);
        for (int i = n - 2; i > -1; i--) {
            if (sort < arr.get(i)) {
                arr.set(i + 1, arr.get(i));
                numOfSwaps++;
            } else {
                arr.set(i + 1, sort);
                break;
            }

        }
        if (sort < arr.get(0)) {
            arr.set(0, sort);
            numOfSwaps++;
        }
        return numOfSwaps;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.runningTime(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
