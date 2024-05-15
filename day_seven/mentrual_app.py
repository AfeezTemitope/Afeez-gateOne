from menstrual_function import welcome_message,calculate_next_period
import datetime
current_date = datetime.date.today()



   


#safe period
welcome_message()
name = input("what`s your name bby girl ? ")
print(f'hello sweet {name} ❤.\nlet assume you have been tracking your cycle for the past 6 month\nNow let get your cycle lenght ')

short_cycle = int(input("what`s your shortest cycle length: "))
longest_cycle = int(input("what`s your longest cycle length: "))
cycle_length = int(input("whats your normal cycle length: "))

#next period date
next_period = calculate_next_period(cycle_length)
print(f"Next expected period date: {next_period}")



#💔  
 

