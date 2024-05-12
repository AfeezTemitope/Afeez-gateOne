from task_one import age_calculator
from datetime import datetime

def test_age_calculator():
	current_date = datetime.today()
	assert age_calculator("04-01-1998", current_date) == 26