import datetime
def welcome_message():
	print('====================\nWELCOME TO BAD AFEEZ\n	CLINIC\n==================== ') 

def calculate_next_period(cycle_length):
    current_date = datetime.date.today()
    next_period_date = current_date + datetime.timedelta(days=cycle_length)
    return next_period_date