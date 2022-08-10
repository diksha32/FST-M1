lst = []

# number of elements as input
n = int(input("Enter number of elements : "))

# iterating till the range
for i in range(0, n):
    ele = int(input())

    lst.append(ele)

for num in lst:
    if(num[0]==num[-1]):
        print(True)
    else:
        print(False)