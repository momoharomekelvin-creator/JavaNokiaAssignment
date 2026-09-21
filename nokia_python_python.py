print("main menu")
print("select option")

main_Menu = """
		1  Phone book
		2  Messages
		3  Chat 
		4  Call register
		5  Tones 
		6  Settings
		7  Call divert
		8  Games
		9  Calculator
		10 Reminder
		11 Clock
		12 Profiles
		13 SIM services
"""

print(main_Menu)
print("select option")

main_menu_choice = int(input("Enter a number"))
match main_menu_choice:
	case 1:
		print("Phonebook")
		phonebook_menu = """
				1 Search
				2 Service Nos
				3 Add Name
				4 Erase
				5 Edit
				6 Assign tone
				7 Send b'card
				8 Options
				9 Speed dials
				10 Voice tags
"""

		print(phonebook_menu)

		phonebook_menu_choice = int(input("Enter a number"))

		match phonebook_menu_choice:
			case 1:	print("Search")
			case 2:	print("Service Nos")
			case 3:	print("Add Name")
			case 4:	print("Erase")
			case 5:	print("Edit")
			case 6:	print("Assign tone")
			case 7:	print("Send b'card")
			case 8:	print("Options")
			case 9:	print("Speed dial")
			case 10:	print("Voice tags")

	case 2:
		print("Message")
		Message_menu = """
			1 Set1 
			2 Common
			3 Chat 
			4 Call register
			5 Show call duration 
			6 Show call cost 
			7 Call cost setting 
			8 Prepaid credit
		"""

		print(Message_menu)
		print("select option")
		Message_choice = int(input("Enter a number"))

		match Message_choice:

			case 1:
				print("Set1")
				set1_main_menu = """
				1 Message centre number
				2 Message sent as
				3 Message validity
				"""
				print(set1_main_menu)
				print("Enter a number")

				set1_Choice = int(input("Enter a number"))

				match set1_Choice:
					case 1:	print("Message centre number")
					case 2:	print("Message sent as")
					case 3:	print("Message validity")

			case 2:
				print("Common")

				common_main_menu = """
				1 Delivery report
				2 Reply via same centre
				3 Character support  
				"""

				print(common_main_menu)
				print("Choose your choice from the option above")

				common_choice = int(input("Enter a number"))

				match common_choice:
					case 1:	print("Delivery report")
					case 2:	print("Reply via same centre")
					case 3:	print("Character support")

			case 3:	print("Chat")

			case 4:
				print("call register")

				call_register_main_menu = """
				1 Missed call
				2 Received call
				3 Dialled number
				4 Erase recent call list
				5 Show call duration
"""
				print(call_register_main_menu)
				print("Enter a number")

				call_register_choice = int(input("Enter a number"))

				match call_register_choice:
					case 1:	print("Missed call")
					case 2:	print("Received call")
					case 3:	print("Dialled number")
					case 4:	print("Erase recent call")
					case 5:
						print("Show call duration")

						show_call_duration_main_menu = """
						1 Last call duration
						2 All call duration 
						3 Received call duration
						4 Dialled call duration
						5 Clear timer
						"""

						print(show_call_duration_main_menu)
						print("Enter a number")

						show_call_duration_choice = int(input("Enter a number"))

						match show_call_duration_choice:
							case 1:	print("Last call duration")
							case 2:	print("All call duration")
							case 3:	print("Received call duration")
							case 4:	print("Dialled call duration")
							case 5:	print("Clear timer")

			case 6:
				print("Show call cost")

				show_call_cost_main_menu = """
				1 Last call cost
				2 All call cost  
				3 Clear counter
				"""

				print(show_call_cost_main_menu)
				print("Enter a number")

				show_call_cost_choice = int(input("Enter a number"))

				match show_call_cost_choice:
					case 1:	print("last call cost")
					case 2:	print("All call cost")
					case 3:	print("Clear counter")

			case 7:
				print("Call cost setting")

				call_cost_setting = """
				1 Call cost limit
				2 Show cost in
				3 Clear counter
				"""

				print(call_cost_setting)
				print("Enter a number")

				call_cost_setting_choice = int(input("Enter a number"))

				match call_cost_setting_choice:
					case 1:	print("Call cost limit")
					case 2:	print("Show call in")
					case 3:	print("Clear counter")

			case 8:	print("Prepaid credit")

	case 3:	print("Chat")

	case 4:
		print("call register")

		call_register_menu = """
		1 Missed call
		2 Received call 
		3 Dialled number
		4 Erase recent call list 
		5 Show call duration
		6 Show call cost 
		7 Call cost setting 
		8 Prepaid credit
		"""

		print(call_register_menu)
		print("Enter a number")

		call_register_choice = int(input("Enter a number"))

		match call_register_choice:
			case 1:	print("Missed call")
			case 2:	print("Received call")
			case 3:	print("Dialled number")
			case 4:	print("Erase recent call list")
			case 5:	print("Show call duration")
			case 6:	print("Show call cost")
			case 7:	print("call cost setting")
			case 8:	print("Prepaid credit")

	case 5:
		print("Tones")

		toneMainManu = """
		1 Ringtone
		2 Ringing volume
		3 Incoming call alert
		4 Composer
		5 Message alert tone 
		6 Keypad tone
		7 Warning and game tone
		8 Vibrating alert
		9 Screen saver
		"""

		print(toneMainManu)
		print("Choose your choice from the option above")

		toneChoice = int(input("Enter a number"))

		match toneChoice:
			case 1:	print("Ringtone")
			case 2:	print("Ringing volume")
			case 3:	print("Incoming call alert")
			case 4:	print("Composer")
			case 5:	print("Message alert tone")
			case 6:	print("Keypad tone")
			case 7:	print("Warning and game tone")
			case 8:	print("Vibrating alert")
			case 9:	print("Screen saver")

	case 6:
		print("Setting")

		setting_main_menu = """
		1 Call setting 
		2 Phone setting
		3 Security setting
		4 Restore factory setting
		"""

		print(setting_main_menu)
		print("Enter a number")

		settingChoice = int(input("Enter a number"))

		match settingChoice:

			case 1:
				print("Call setting")

				call_setting_menu = """
				1 Automatic redial
				2 Speed dialing
				3 Call waiting Option
				4 Own number sending
				5 Phone line in use  
				6 Automatic answer
				"""

				print(call_setting_menu)
				print("Choose your choice from the option above")

				callsettingChoice = int(input("Enter a number"))

				match callsettingChoice:
					case 1:	print("Automatic redial")
					case 2:	print("Speed dialing")
					case 3:	print("Call waiting option")
					case 4:	print("Own number sending")
					case 5:	print("Phone line in use")
					case 6:	print("Automatic answer")

			case 2:
				print("Phone setting")

				phone_setting_menu = """
					1 Language
					2 Cell info display
					3 Wecome note  
					4 Network selection  
					5 Light
					"""

				print(phone_setting_menu)
				print("Choose your choice from the option above")

				phone_setting_choice = int(input("Enter a number"))

				match phone_setting_choice:
					case 1:	print("Language")
					case 2:	print("Cell info display")
					case 3:	print("Wecome note")
					case 4:	print("Network selection")
					case 5:	print("Light")

			case 3:
				print("Security setting")

				security_setting_menu = """
				1 PIN code request
				2 Call barring service
				3 Fixed dialling
				4 Losed user group  
				5 Phone security  
				6 Change access code  
				"""

				print(security_setting_menu)
				print("Choose your choice from the option above")

				security_setting_choice = int(input("Enter a number"))

				match security_setting_choice:
					case 1:	print("PIN code request")
					case 2:	print("Call barring service")
					case 3:	print("Fixed dialling")
					case 4:	print("Losed user group")
					case 5:	print("Phone security")
					case 6:	print("Change access code")

			case 4:	print("Restore factory setting")

	case 7:	print("Call divert")
	case 8:	print("Game")
	case 9:	print("Calculator")
	case 10:	print("Reminder")

	case 11:
		print("Clock")

		clock_menu = """
		1 Alarm clock 
		2 Clock setting
		3 Date setting
		4 Stopwatch
		5 Countdown timer 
		6 Auto update of date and time 
		"""

		print(clock_menu)
		print("Enter a number")

		clockChoice = int(input("Enter a number"))

		match clockChoice:
			case 1:	print("Alerm clock")
			case 2:	print("Clock setting")
			case 3:	print("Date setting")
			case 4:	print("Stopwatch")
			case 5:	print("Countdown timer")
			case 6:	print("Auto update of date and time")

	case 12:	print("Profile")
	case 13:	print("SIM services")
