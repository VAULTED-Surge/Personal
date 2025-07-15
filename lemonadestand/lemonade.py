#########################################################################################
#imprts needed packages 
import math
import random 
#########################################################################################
# sets all variables 
global income 
income = 10
global funds
funds = 0
funds = funds + 20
global lemon
lemon = 0
global cups
cups = 0
global sugar
sugar = 0
global lemon_supplies
lemon_supplies = 0
global sugar_supplies
sugar_supplies = 0
global ice_supplies
ice_supplies = 0
global cups_supplies
cups_supplies = 0
weather = [1, 2, 3]
global player_start_confirmation
player_start_confirmation = 1


########################################################################################
# this prints the opening message 
def lemonade_stand_start():
  print("welcome the lemonade stand")
  print("but first you are going to need some supplies")
#########################################################################################
# buy menu 
def buy_menu():
  global funds 
  global lemon_supplies
  global sugar_supplies
  global ice_supplies
  print("how many lemons would you like to buy")
  print(" 10 lemons for $0.88 30 lemons for $2.28 and 75 lemons for 4.41" + " please select one of these 3 amounts ")
  lemon_purchase = int(input("please select an amount of lemons to buy"))
  
  ############################################################################################
  if lemon_purchase == 10:
    funds = funds - 0.88
    lemon_supplies = lemon_supplies + 10 
    print(funds)
    print(lemon_supplies)
  
    
  if lemon_purchase == 30:
    funds = funds - 2.28
    lemon_supplies = lemon_supplies + 10 
    print(funds)
    print(lemon_supplies)

  if lemon_purchase == 75:
    funds = funds - 4.41
    lemon_supplies = lemon_supplies + 10 
    print(funds)
    print(lemon_supplies)
  #############################################################################################
  sugar_purchase = int(input("please select an amount of sugar to buy, 8 cups of sugar for $0.63 20 cups of sugar for $1.57 and 48 cups of sugar for 3.25" + " please select one of these 3 amounts"))
  if sugar_purchase == 8:
    funds = funds - 0.63
    sugar_supplies = sugar_supplies + 8 
    print(funds)
    print(sugar_supplies)

    
  if sugar_purchase == 20:
    funds = funds - 1.57
    sugar_supplies = sugar_supplies + 20 
    print(funds)
    print(sugar_supplies)

  if sugar_purchase == 48:
    funds = funds - 3.25
    sugar_supplies = sugar_supplies + 20 
    print(funds)
    print(sugar_supplies)
  ###############################################################################################
  ice_purchase = int(input("please select an amount of ice to buy, 500 ice cubes for $3.75 100 ice cubes for $0.99 and 250 ice cubes for 2.18" + " please select one of these 3 amounts"))
  if ice_purchase == 500:
    funds = funds - 3.73
    ice_supplies = ice_supplies + 500
    print(funds)
    print(ice_supplies)

    
  if ice_purchase == 100:
    funds = funds - 0.99
    ice_supplies = ice_supplies + 100
    print(funds)
    print(ice_supplies)

  if ice_purchase == 250:
    funds = funds - 2.18
    ice_supplies = ice_supplies + 250
    print(funds)
    print(ice_supplies)
  ##############################################################################################
  global cups_supplies
  
  cups_purchase = int(input("please select an amount of cups to buy,  25 cups for $0.89 50 cups for $1.53 and 100 ice cubes for 2.97" + " please select one of these 3 amounts"))
  if cups_purchase == 25:
    funds = funds - 0.89
    cups_supplies = cups_supplies + 25
    print(funds)
    print(cups_supplies)

    
  if cups_purchase == 50:
    funds = funds - 1.53
    cups_supplies = cups_supplies + 50
    print(funds)
    print(cups_supplies)

  if cups_purchase == 100:
    funds = funds - 2.97
    cups_supplies = cups_supplies + 100
    print(funds)
    print(cups_supplies)

    #make it so that this affects the amount of ice used 
  #######################################################################################
  # old funds tracker broken will be deleted soon 
  

def fundstracking():
  global funds
  if funds <= 0.69:
    print("you have gone bankrupt")
    

    
  print(lemon_supplies)
#all below is functioning as intended 
########################################################################################
  #this creates a random amount of customers 
def customers():
  global customer_amount
  customer_amount = random.randint(80, 100)
  print("there are this many customers", customer_amount)
  #this works now have to hook it in with the weather system
#########################################################################################
def weather_and_temp():
  customers()
  global set_price
  if player_start_confirmation == 1:
    print("day started")
    global weather
    # this creates the weather and affects current amount of people 
    weather = [1, 2, 3]
    weather = random.choice(weather)
  # these if statements check if it is a certain type of weather and vary the amount of people
    global temp
    global customer_amount
    if weather == 1:
      print("it is dry outide")
      customer_amount = customer_amount + 50
    if weather == 2:
      print("it is cloudy")
      customer_amount = customer_amount - 20
    if weather ==3:
      print("it is raining")
      customer_amount = customer_amount - 50 
    temp = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100,]
    temp = random.choice(temp)
    print("and the temperature is around ",temp,"°")
    return customer_amount
    if set_price > 60:
      customer_amount = customer_amount -  random.randint(20,50)
#########################################################################################
# this mess determins a raNDOM AMOUNT WHO ACTUALLY BUY LEMONADE
def lemonade_sold():
  global income
  global lemon_usage
  global ice_usage
  global sugar_usage
  global set_price
  global lemon_supplies
  global sugar_supplies
  global ice_supplies
  global cups_supplies
  global customer_amount
  lemonade_sold = random.randint(1, 100)
  final_sales = lemonade_sold
  cups_supplies = cups_supplies -  final_sales
  
  print("you sold this much lemonade",final_sales/100)
  if final_sales <= 0:
    print("you sold no lemonade")
    income = income-10
    print(income)
  if temp < 40 and ice_usage >= 5:
      income = income - random.randint(5,7)
  if temp > 60 and ice_usage >= 7:
      income = income + random.randint(5,7)
  if lemon_usage >= 5 and sugar_usage < 3:
      income = income - random.randint(6,8)
  if lemon_usage <= 3 and sugar_usage > 5:
      income = income - random.randint(6,8)
  if lemonade_sold > customer_amount:
      print("you have sold out")
  income = income + final_sales*set_price
  print("you have made this much money",income)
  ########################################################################
  #this allows you to make the recipe for your lemonade
      
def create_lemonade():
  global lemon_supplies
  global sugar_supplies
  global ice_supplies
  global cups_supplies
  
  global lemon_usage
  lemon_usage = int(input("how many lemons would you like to use "))
  if lemon_usage < 1:
    lemon_supplies = lemon_supplies - lemon_usage
    
  global ice_usage
  ice_usage = int(input("how many ice would you like to use "))
  if ice_usage  < 1:
    ice_supplies = ice_supplies - ice_usage

  global sugar_usage
  sugar_usage = int(input("how many sugar would you like to use "))
  if sugar_usage  < 1:
    sugar_supplies = sugar_supplies - sugar_usage

  global set_price
  set_price = int(input("how mauch would you like to charge for a cup"))

  
    