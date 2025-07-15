num = 1
for i in range(100):
    print(num)
    num = num+1
    if(num % 3 == 0):
        print("fizz")
    if(num % 5 == 0):
        print("buzz")
    if(num % 3 == 0 and num % 5 == 0):
        print("fizzbuzz")
    