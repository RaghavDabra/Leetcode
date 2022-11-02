class Solution {

    boolean[] visited;
    List<List<Integer>> allRooms;

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        allRooms = rooms;
        visited = new boolean[rooms.size()];
        goInRecursively(0, rooms.get(0));
        return allVisited();
    }

    private void goInRecursively(int room, List<Integer> keys) {
        if (visited[room]) return;

        visited[room] = true;
        for (int i = 0; i < keys.size(); i++) {
            int key = keys.get(i);
            goInRecursively(key, allRooms.get(key));
        }
    }

    private boolean allVisited() {
        for (int i = 0; i < visited.length / 2; i++) {
            if (!visited[i] || !visited[visited.length - 1 - i])
                return false;
        }
        return visited[visited.length / 2];
    }
}