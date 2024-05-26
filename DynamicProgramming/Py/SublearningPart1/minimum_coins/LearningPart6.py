from collections import defaultdict


def how_many_ways(m, coins):
    memo = defaultdict(lambda _: 0)

    memo[0] = 1
    for i in range(1, m + 1):
        memo[i] = 0

        for coin in coins:
            subprolem = i - coin
            if subprolem < 0:
                continue

            memo[i] = memo[i] + memo[subprolem]

    return memo[m]

print(how_many_ways(5,[1,4,5]))  # Output = 4

print(how_many_ways(87,[1,4,5,8])) # Output = 3306149332861088