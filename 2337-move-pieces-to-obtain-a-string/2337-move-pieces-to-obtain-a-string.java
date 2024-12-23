class Solution {
    public boolean canChange(String start, String target) {
        if (!start.replace("_", "").equals(target.replace("_", ""))) {
            return false;
        }
        
        int n = start.length();
        int startLIndex = 0, targetLIndex = 0;
        while (startLIndex < n && targetLIndex < n) {
            while (startLIndex < n && start.charAt(startLIndex) != 'L') {
                startLIndex++;
            }
            while (targetLIndex < n && target.charAt(targetLIndex) != 'L') {
                targetLIndex++;
            }
            if (startLIndex < n && targetLIndex < n) {
                if (startLIndex < targetLIndex) {
                    return false;
                }
                startLIndex++;
                targetLIndex++;
            }
        }

        startLIndex = n - 1;
        targetLIndex = n - 1;
        while (startLIndex >= 0 && targetLIndex >= 0) {
            while (startLIndex >= 0 && start.charAt(startLIndex) != 'R') {
                startLIndex--;
            }
            while (targetLIndex >= 0 && target.charAt(targetLIndex) != 'R') {
                targetLIndex--;
            }
            if (startLIndex >= 0 && targetLIndex >= 0) {
                if (startLIndex > targetLIndex) {
                    return false;
                }
                startLIndex--;
                targetLIndex--;
            }
        }

        return true;
    }
}
