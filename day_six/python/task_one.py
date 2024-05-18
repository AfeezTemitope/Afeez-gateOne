from datetime import datetime 
def age_calculator(date_of_birth,current_date = None):
	date_of_birth = date_of_birth.replace('-', ':').replace('/', ':').replace(' ', ':')
    
	if current_date is None:
		current_date = datetime.today()
	birth_date = datetime.strptime(date_of_birth, "%d:%m:%Y")
	full_year_passed = (current_date.month, current_date.day) >= (birth_date.month, birth_date.day)
	age = current_date.year - birth_date.year
	if not full_year_passed:
		age -= 1
	return age

