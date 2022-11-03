class Solution:
    def rotate(self, matrix: List[List[int]]) -> None:
        z = len(matrix)
        for col in range(z):
            tem_row = []
            for row in range(z-1,-1,-1):
                tem_row.append(matrix[row][col])
            matrix.append(tem_row)
        while z>0:
            matrix.pop(0)
            z-=1
        