import datetime

def welcome_message():
	print('====================\nWELCOME TO BAD AFEEZ\n CLINIC\n==================== ')

def calculate_next_period(cycle_length):
	current_date = datetime.date.today()
	next_period_date = current_date + datetime.timedelta(days=cycle_length)
	return next_period_date

def calculate_safe_period(last_menstrual_period_date, cycle_length, menstruation_duration):
	safe_start = last_menstrual_period_date + datetime.timedelta(days=cycle_length - menstruation_duration)
	safe_end = last_menstrual_period_date + datetime.timedelta(days=cycle_length - 11)
	return f"Your safe period starts on {safe_start} and ends on {safe_end}."
