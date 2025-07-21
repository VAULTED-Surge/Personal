import random
global code_found
code_found = False


def setup():
  #creates a input for user to create a pin
  global code
  code = int(input("enter a four digit code: "))
setup()
while (code_found == False):
  def guesspin():
    global code
    global code_found
    #converts to a list 
    rec = [int(x) for x in str(code)]

    # printing result
    print("reconstructed pin matching..." + str(rec))

 
  
    digit1 = random.randint(0,9)
    digit2 = random.randint(0,9)
    digit3 = random.randint(0,9)
    digit4 = random.randint(0,9)
    guess = [digit1,digit2,digit3,digit4]
    print(guess)
    if (guess == rec):
      code_found = True
      print("code found")
  guesspin()
  


