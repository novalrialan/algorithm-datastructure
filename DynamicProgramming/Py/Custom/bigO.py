# Get every triplet of elements in array
nums = [1,2,3]
# O(n^3)
for i in range(len(nums)):  # O(n)
    for j in range(i+1,len(nums)): # O(n)
        for k in range(j+1, len(nums)): # O(n)
            print(nums[i],nums[j],nums[k])


# O(nlogn) , marge
#HeapSort
import heapq
nums = [1,2,3,4,5]
heapq.heapify(nums) # O(n)
while nums:
    heapq.heappop(nums) # O(logn)

# MergeSort
# (and most built in sorting functions)


# O(2^n)
# Recursion, tree height n, two branches
def recursion(i, nums):
    if i == len(nums):
        return 0
    branch1 = recursion(i+1,nums)
    branch2 = recursion(i+2,nums)

# c branches , where c is sometimes n
def recursion(i, nums,c):
    if i == len(nums):
        return 0
    for j in range(i, i +c):
        branch = recursion(j+1, nums)


# O(root n)
# Get all factors of n
import math
n=12 
factors = set()
for i in range(1, int(math.sqrt(n))+1):
    if n % i == 0:
        factors.add(i)
        factors.add(n // i)
print(factors)


# O(n!) --> O(root n), O(logn)``
# permutation
# travelling salesman problem