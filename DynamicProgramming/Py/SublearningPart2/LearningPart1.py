# Longest Common Subsequence
# given two sequences of numbers, A and B, what's their logest common subsequence?


# -> Sequence is an array of integers. A = [1,2,3,4,5]
# -> Subsequence of A is a sequence obtained by deleting some (possibly zero) elements from A.
# -> Common Subsequence is a subsequence of both A and B

A = [1,2,3,4]
B = [2,3,4,5]

# [2 3]
# [2]
# [3]
# []


# case 2 
# -> Greedy Approach 

A = [1,4,5,6,9,10,11]
B = [6,4,5,9,11]

# == DP Approach ==
A = [1,4,5,6,9,10,11]

B = [6,4,5,9,11]

# Option 1 : Consider any subsquence. 2 pankat 2N subproblems
# Option 2 : Consider only continuous parts. N pankat 4 subproblems
# Option 3 : Consider only prefixes. N pangkat 2 subproblems

# Exam -- Option 3 : Consider only prefixes. N pangkat 2 subproblems
A = [1,4,5,6,9,10,11]
B = [6,4,5,9,11]

# L(5,3) = LCS([1 4 5 6 9], [6 4 5])

# L(n,m) = ?

