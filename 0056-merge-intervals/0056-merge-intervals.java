class Solution {
    public int[][] merge(int[][] arr) {

        Arrays.sort(arr, (a, b) -> a[0] - b[0]);

        List<List<Integer>> list = new ArrayList<>();

        int n = arr.length;
        int i = 0;

        while (i < n) {

            int start = arr[i][0];
            int end = arr[i][1];

            int j = i + 1;

            while (j < n && arr[j][0] <= end) {
                end = Math.max(end, arr[j][1]);
                j++;
            }

            list.add(Arrays.asList(start, end));

            i = j;
        }

        return list.stream()
                .map(row -> row.stream()
                        .mapToInt(Integer::intValue)
                        .toArray())
                .toArray(int[][]::new);
    }
}