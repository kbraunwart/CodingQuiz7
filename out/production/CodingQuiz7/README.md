# CodingQuiz7

Time Complexity for Q1: a double for loop is used to compare indices and see if they need to be swapped, and each loop may perform constant time processes, such as incrementing the variable for number of insertions for each swap that occurs. Because of this, time complexity is O(n^2)

Space Complexity for Q2: Space compexity is O(c) because only variables of type int are initalized and used to hold values during the execution of the code.

Question 2:
recursive def:
- Create a 2D array of size [index + 2][m+1]
- Start at the top left corner and move right to left across the indices and then down the table. If a combination of 2 flavors is equal to the target
