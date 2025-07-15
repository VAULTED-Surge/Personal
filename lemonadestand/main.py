import math
from lemonade import*

#lemonade_stand_start()
#buy_menu()
#weather_and_temp()
#sell_lemonade()
#customers()
#lemonade_sold()
#day_select = int(input('how many days would you like to run your buisness'))



def game():
  for i in range (30):    
    lemonade_stand_start()
    fundstracking()
    buy_menu()
    fundstracking()
    create_lemonade()
    fundstracking()
    weather_and_temp()
    fundstracking()
    lemonade_sold()
    fundstracking()
game()