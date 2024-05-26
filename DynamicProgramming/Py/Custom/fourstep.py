# 1. Recurcive Backtracking

def f(n):
    if n == 0: return 0
    if n == 1: return 1

    return f(n-1)+ f(n-2)

print(f(5))

# ====== Time : O(2^n) =========

# 2. Top-Down DP (Memoization)
def fib(n):
    memo = {0:0,1:1}

    def f(n):
        if n in memo:
            return memo[n]
        memo[n] = f(n-1) + f(n-2)
        return memo[n]
    
    return f(n)

# 3. Bottom-up DP(tabulation)
def fib(n):
    dp = [0,1]

    for i in range(2, n+1):
        new = dp[i-2]+ dp[i-1]
        dp.append(new)

    return dp[n]

# 4. Bottom-Up No-Memory DP
def fib(n):
    if n < 2: return n

    prev, cur = 0,1
    for i in range(2,n+1):
        prev , cur = cur, cur + prev
    return cur