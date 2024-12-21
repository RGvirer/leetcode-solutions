class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        // PriorityQueue to store classes with their improvement ratio in descending order
        PriorityQueue<ClassData> pq = new PriorityQueue<>((a, b) -> Double.compare(b.improvement, a.improvement));

        // Initialize the priority queue with the initial ratios and improvement potential
        for (int[] c : classes) {
            int passi = c[0];
            int totali = c[1];
            double initialRatio = (double) passi / totali;
            double improvement = ((double) (passi + 1) / (totali + 1)) - initialRatio;  // Improvement calculation
            pq.offer(new ClassData(passi, totali, improvement));
        }

        // Assign the extra students to the classes with the highest improvement
        for (int i = 0; i < extraStudents; i++) {
            // Get the class with the highest improvement
            ClassData classData = pq.poll();
            
            // Update the class by adding one extra student
            classData.passi++;
            classData.totali++;
            
            // Recompute the improvement and push it back into the priority queue
            double newImprovement = ((double) (classData.passi + 1) / (classData.totali + 1)) - (double) classData.passi / classData.totali;
            classData.improvement = newImprovement;
            pq.offer(classData);
        }

        // Compute the total sum of pass ratios after all extra students have been assigned
        double totalRatio = 0;
        for (ClassData classData : pq) {
            totalRatio += (double) classData.passi / classData.totali;
        }

        // Return the average pass ratio
        return totalRatio / classes.length;
    }

    // Class to represent each class with its pass count, total count, and improvement potential
    static class ClassData {
        int passi, totali;
        double improvement;

        ClassData(int passi, int totali, double improvement) {
            this.passi = passi;
            this.totali = totali;
            this.improvement = improvement;
        }
    }
}