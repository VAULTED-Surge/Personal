def collatz():
    global num
    num = int(input("insert a number: "))
    iseven = False
    while (num > 1):

        if (num % 2):
            #print("this number is odd")
            iseven = False 
        else:
            #print("this number is even")
            iseven = True 
        if (iseven == True):
            num = num//2
            print(num)
        else:
            num = num*3+1
            print(num)
        if (num== 1):
            print("sequence complete")

collatz()