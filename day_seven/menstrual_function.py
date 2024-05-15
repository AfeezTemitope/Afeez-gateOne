import datetime

def welcome_message():
	print('====================\nWELCOME TO BAD AFEEZ\n   CLINIC\n==================== ')


def calculate_safe_period(last_menstrual_period_date, cycle_length, menstruation_duration):
	safe_start = last_menstrual_period_date + datetime.timedelta(days=menstruation_duration + 1)
	safe_end = last_menstrual_period_date + datetime.timedelta(days=cycle_length - 11)
	next_flow_date = last_menstrual_period_date + datetime.timedelta(days=cycle_length)
	ovulation_date = next_flow_date - datetime.timedelta(days=14)

	return (f"Your safe period starts on {safe_start} and ends on {safe_end}.\n"
	f"Your nex flow date is {next_flow_date},\nYour next ovulation date is {ovulation_date}")


