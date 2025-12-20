int minDeletionSize(char** strs, int strsSize) {
    int rows = strsSize;
    int cols = strlen(strs[0]);
    int count = 0;
    for (int j = 0; j < cols; j++) {
        for (int i = 1; i < rows; i++) {
            if (strs[i][j] < strs[i - 1][j]) {
                count++; 
                break;
            }
        }
    }
    return count;
}