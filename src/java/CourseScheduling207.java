import java.util.Arrays;

class CourseScheduling207 {
    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] dc = new int[numCourses];
        
        // Count the number of dependencies for each course
        for (int[] pre : prerequisites) {
            dc[pre[1]]++;
        }
        
        boolean[] v = new boolean[prerequisites.length];
        boolean p = true;
        
        // Perform the topological sorting
        while (p) {
            p = false;
            for (int i = 0; i < prerequisites.length; i++) {
                if (!v[i] && dc[prerequisites[i][0]] == 0) {
                    v[i] = true;
                    p = true;
                    dc[prerequisites[i][1]]--;
                }
            }
        }
        
        // Check if all courses have been completed
        for (int c : dc) {
            if (c != 0) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {

        int numCourses = 4;
        int[][] prerequisites = {{1, 0}, {2, 1}, {3, 2}};
        System.out.println("numCourses: " + numCourses);
        System.out.println("prerequisites: " + Arrays.deepToString(prerequisites));
        System.out.println("Output: " + canFinish(numCourses,prerequisites));
    }
}