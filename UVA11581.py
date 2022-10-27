# https://onlinejudge.org/external/115/11581.pdf
from sys import stdin
def main():
    num_cases = int(input())

    for t in range(num_cases):
        input()
        stop = [0] * 9
        next_numbers = [0] * 9
        numbers = list(map(int, list(stdin.readline().strip())))
        numbers += list(map(int, list(stdin.readline().strip())))
        numbers += list(map(int, list(stdin.readline().strip())))
        steps = 0
        while numbers!=stop:
            next_numbers = [
                (numbers[1] + numbers[3]) % 2,
                (numbers[0] + numbers[2] + numbers[4]) % 2,
                (numbers[1] + numbers[5]) % 2,
                (numbers[0] + numbers[4] + numbers[6]) % 2,
                (numbers[1] + numbers[3] + numbers[5] ^ numbers[7]) % 2,
                (numbers[2] + numbers[4] + numbers[8]) % 2,
                (numbers[3] + numbers[7]) % 2,
                (numbers[4] + numbers[6] + numbers[8]) % 2,
                (numbers[5] + numbers[7]) % 2
            ]
            numbers = next_numbers
            steps += 1

        print(steps-1)

main()