from menstrual_function import welcome_message,calculate_safe_period
import datetime

welcome_message()
name = input("what`s your name bby girl ? ")
print(f'hello sweet {name} ❤.\nlet assume you have been tracking your cycle for the past 6 month\nNow let get your cycle lenght ')

last_menstrual_period = input("Enter the first day of your last menstrual period (YYYY-MM-DD): ")
last_menstrual_period_date = datetime.datetime.strptime(last_menstrual_period, "%Y-%m-%d").date()
cycle_length = int(input("Enter your cycle length (in days): "))
menstruation_duration = int(input("Enter your menstruation duration (in days): "))

safe_period = calculate_safe_period(last_menstrual_period_date, cycle_length, menstruation_duration )
print(safe_period)





#💔  


 

