import java.util.Scanner;
import java.util.ArrayDeque;

public class Nokiasecond {
	public static void main(String[] args) {

		Scanner inputCollector = new Scanner(System.in);
		ArrayDeque<String> menuStack = new ArrayDeque<>();
		menuStack.push("main");

		do {
			String currentMenu = menuStack.peek();

			switch (currentMenu) {

				case "main": {
					System.out.println("main menu");
					String menu = """
							1.  Phonebook
							2.  Messages
							3.  Chat 
							4.  Call register
							5.  Tones 
							6.  Settings 
							7.  Call divert
							8.  Music 
							9.  Games 
							10. Calculator 
							11. Reminders 
							12. Clock 
							13. Profiles 
							14. Services 
							15. SIM services 
							0.  Exit
							""";
					System.out.println(menu);
					int choice = inputCollector.nextInt();

					switch (choice) {
						case 1:	menuStack.push("phonebook"); break;
						case 2:	menuStack.push("messages"); break;
						case 3:	System.out.println("Chat"); break;
						case 4:	menuStack.push("callRegister"); break;
						case 5:	menuStack.push("tones"); break;
						case 6:	menuStack.push("settings"); break;
						case 7:	System.out.println("Call divert"); break;
						case 8:	menuStack.push("music"); break;
						case 9:	System.out.println("Games"); break;
						case 10:	System.out.println("Calculator"); break;
						case 11:	System.out.println("Reminders"); break;
						case 12:	menuStack.push("clock"); break;
						case 13:	System.out.println("Profiles"); break;
						case 14:	System.out.println("Services"); break;
						case 15:	System.out.println("SIM services"); break;
						case 0:	System.exit(0);
						default:	System.out.println("Invalid command");
					}
					break;
				}

				case "phonebook": {
					System.out.println("Phonebook");
					String phonebookMenu = """
							1. 	Search
							2. 	Service Nos.
							3. 	Add name
							4. 	Erase 
							5. 	Edit 
							6. 	Copy 
							7. 	Assign tone 
							8. 	Send b'card
							9. 	Options 
							10. Speed dials
							11. Voice tags 
							99. Back
							0.  Exit
							""";
					System.out.println(phonebookMenu);
					int choice = inputCollector.nextInt();

					switch (choice) {
						case 1:	System.out.println("Search"); break;
						case 2:	System.out.println("Service Nos"); break;
						case 3:	System.out.println("Add name"); break;
						case 4:	System.out.println("Erase"); break;
						case 5:	System.out.println("Edit"); break;
						case 6:	System.out.println("Copy"); break;
						case 7:	System.out.println("Assign tone"); break;
						case 8:	System.out.println("Send b'card"); break;
						case 9:	menuStack.push("phonebookOptions"); break;
						case 10:	System.out.println("Speed dials"); break;
						case 11:	System.out.println("Voice tags"); break;
						case 99:	menuStack.pop(); break;
						case 0:	System.exit(0);
						default:	System.out.println("Invalid command");
					}
					break;
				}

				case "phonebookOptions": {
					System.out.println("Options");
					String optionMenu = """
							1.	Memory in use 
							2.	Type of view
							3.	Memory status
							99.	Back
							0.	Exit
							""";
					System.out.println(optionMenu);
					int choice = inputCollector.nextInt();

					switch (choice) {
						case 1:	System.out.println("Memory in use"); break;
						case 2:	System.out.println("Type of view"); break;
						case 3:	System.out.println("Memory status"); break;
						case 99:	menuStack.pop(); break;
						case 0:	System.exit(0);
						default:	System.out.println("Invalid command");
					}
					break;
				}

				case "messages": {
					System.out.println("Messages");
					String messageMenu = """
							1.	Write messages 
							2.	Inbox 
							3.	Outbox 
							4. 	Picture messages 
							5. 	Templates
							6. 	Smileys
							7. 	Message settings 
							8. 	Info service 
							9.	Voice mailbox number
							10.	Service command editor
							99.	Back
							0.	Exit
							""";
					System.out.println(messageMenu);
					int choice = inputCollector.nextInt();

					switch (choice) {
						case 1:	System.out.println("Write messages"); break;
						case 2:	System.out.println("Inbox"); break;
						case 3:	System.out.println("Outbox"); break;
						case 4:	System.out.println("Picture messages"); break;
						case 5:	System.out.println("Templates"); break;
						case 6:	System.out.println("Smileys"); break;
						case 7:	menuStack.push("messageSettings"); break;
						case 8:	System.out.println("Info service"); break;
						case 9:	System.out.println("Voice mailbox number"); break;
						case 10:	System.out.println("Service command editor"); break;
						case 99:	menuStack.pop(); break;
						case 0:	System.exit(0);
						default:	System.out.println("Invalid command");
					}
					break;
				}

				case "messageSettings": {
					System.out.println("Message settings");
					String messageSettings = """
							1. Set 1
							2. Common
							99. Back
							0.  Exit
							""";
					System.out.println(messageSettings);
					int choice = inputCollector.nextInt();

					switch (choice) {
						case 1:	menuStack.push("set1"); break;
						case 2:	menuStack.push("common"); break;
						case 99:	menuStack.pop(); break;
						case 0:	System.exit(0);
						default:	System.out.println("Invalid command");
					}
					break;
				}

				case "set1": {
					System.out.println("Set 1");
					String setMenu = """
							1. Message centre number 
							2. Message sent as
							3. Message validity
							99. Back
							0.  Exit
							""";
					System.out.println(setMenu);
					int choice = inputCollector.nextInt();

					switch (choice) {
						case 1:	System.out.println("Message centre number"); break;
						case 2:	System.out.println("Message sent as"); break;
						case 3:	System.out.println("Message validity"); break;
						case 99:	menuStack.pop(); break;
						case 0:	System.exit(0);
						default:	System.out.println("Invalid command");
					}
					break;
				}

				case "common": {
					System.out.println("Common");
					String commonMenu = """
							1. Delivery reports
							2. Reply via same centre number
							3. Character support
							99. Back
							0.  Exit
							""";
					System.out.println(commonMenu);
					int choice = inputCollector.nextInt();

					switch (choice) {
						case 1:	System.out.println("Delivery report"); break;
						case 2:	System.out.println("Reply via same centre"); break;
						case 3:	System.out.println("Character support"); break;
						case 99:	menuStack.pop(); break;
						case 0:	System.exit(0);
						default:	System.out.println("Invalid command");
					}
					break;
				}

				case "callRegister": {
					System.out.println("Call register");
					String callRegister = """
							1. Missed calls 
							2. Received calls 
							3. Dialled numbers
							4. Erase recent call lists 
							5. Show call duration
							6. Show call costs 
							7. Call cost settings 
							8. Prepaid credit
							99. Back
							0.  Exit
							""";
					System.out.println(callRegister);
					int choice = inputCollector.nextInt();

					switch (choice) {
						case 1:	System.out.println("Missed calls"); break;
						case 2:	System.out.println("Received calls"); break;
						case 3:	System.out.println("Dialled numbers"); break;
						case 4:	System.out.println("Erase recent call lists"); break;
						case 5:	menuStack.push("callDuration"); break;
						case 6:	menuStack.push("callCost"); break;
						case 7:	menuStack.push("callCostSetting"); break;
						case 8:	System.out.println("Prepaid credit"); break;
						case 99:	menuStack.pop(); break;
						case 0:	System.exit(0);
						default:	System.out.println("Invalid command");
					}
					break;
				}

				case "callDuration": {
					System.out.println("Show call duration");
					String callDurationMenu = """
							1. Last call duration 
							2. All call duration 
							3. Received call duration 
							4. Dialled call duration
							5. Clear timers
							99. Back
							0.  Exit
							""";
					System.out.println(callDurationMenu);
					int choice = inputCollector.nextInt();

					switch (choice) {
						case 1:	System.out.println("Last call duration"); break;
						case 2:	System.out.println("All call duration"); break;
						case 3:	System.out.println("Received call duration"); break;
						case 4:	System.out.println("Dialled call duration"); break;
						case 5:	System.out.println("Clear timers"); break;
						case 99:	menuStack.pop(); break;
						case 0:	System.exit(0);
						default:	System.out.println("Invalid command");
					}
					break;
				}

				case "callCost": {
					System.out.println("Show call cost");
					String callcostMenu = """
							1. Last call cost 
							2. All call cost 
							3. Clear counter 
							99. Back
							0.  Exit
							""";
					System.out.println(callcostMenu);
					int choice = inputCollector.nextInt();

					switch (choice) {
						case 1:	System.out.println("Last call cost"); break;
						case 2:	System.out.println("All call cost"); break;
						case 3:	System.out.println("Clear counter"); break;
						case 99:	menuStack.pop(); break;
						case 0:	System.exit(0);
						default:	System.out.println("Invalid command");
					}
					break;
				}

				case "callCostSetting": {
					System.out.println("Call cost settings");
					String callCostSetting = """
							1. Cost call limit
							2. Show cost in
							99. Back
							0.  Exit
							""";
					System.out.println(callCostSetting);
					int choice = inputCollector.nextInt();

					switch (choice) {
						case 1:	System.out.println("Cost call limit"); break;
						case 2:	System.out.println("Show cost in"); break;
						case 99:	menuStack.pop(); break;
						case 0:	System.exit(0);
						default:	System.out.println("Invalid command");
					}
					break;
				}

				case "tones": {
					System.out.println("Tones");
					String tonesMenu = """
							1. Ringing tone 
							2. Ringing volume
							3. Incoming call alert
							4. Message alert tones
							5. Keypad tones 
							6. Warning tones 
							7. Vibrating alert 
							8. Screen saver 
							99. Back
							0.  Exit
							""";
					System.out.println(tonesMenu);
					int choice = inputCollector.nextInt();

					switch (choice) {
						case 1:	System.out.println("Ringing tone"); break;
						case 2:	System.out.println("Ringing volume"); break;
						case 3:	System.out.println("Incoming call alert"); break;
						case 4:	System.out.println("Message alert tones"); break;
						case 5:	System.out.println("Keypad tones"); break;
						case 6:	System.out.println("Warning tones"); break;
						case 7:	System.out.println("Vibrating alert"); break;
						case 8:	System.out.println("Screen saver"); break;
						case 99:	menuStack.pop(); break;
						case 0:	System.exit(0);
						default:	System.out.println("Invalid command");
					}
					break;
				}

				case "settings": {
					System.out.println("Settings");
					String settings = """
							1. Call settings 
							2. Phone settings 
							3. Security setting  
							4. Restore factory settings
							99. Back
							0.  Exit
							""";
					System.out.println(settings);
					int choice = inputCollector.nextInt();

					switch (choice) {
						case 1:	menuStack.push("callSetting"); break;
						case 2:	menuStack.push("phoneSetting"); break;
						case 3:	menuStack.push("securitySetting"); break;
						case 4:	System.out.println("Restore factory settings"); break;
						case 99:	menuStack.pop(); break;
						case 0:	System.exit(0);
						default:	System.out.println("Invalid command");
					}
					break;
				}

				case "callSetting": {
					System.out.println("Call settings");
					String callSettingMenu = """
							1. Automatic redial
							2. Speed dialling
							3. Call waiting options
							4. Own number sending
							5. Phone line in use
							6. Automatic answer
							99. Back
							0.  Exit
							""";
					System.out.println(callSettingMenu);
					int choice = inputCollector.nextInt();

					switch (choice) {
						case 1:	System.out.println("Automatic redial"); break;
						case 2:	System.out.println("Speed dialling"); break;
						case 3:	System.out.println("Call waiting options"); break;
						case 4:	System.out.println("Own number sending"); break;
						case 5:	System.out.println("Phone line in use"); break;
						case 6:	System.out.println("Automatic answer"); break;
						case 99:	menuStack.pop(); break;
						case 0:	System.exit(0);
						default:	System.out.println("Invalid command");
					}
					break;
				}

				case "phoneSetting": {
					System.out.println("Phone settings");
					String phoneSettingMenu = """
							1. Language 
							2. Cell info display
							3. Welcome note 
							4. Network selection 
							5. Confirm sim service action
							99. Back
							0.  Exit
							""";
					System.out.println(phoneSettingMenu);
					int choice = inputCollector.nextInt();

					switch (choice) {
						case 1:	System.out.println("Language"); break;
						case 2:	System.out.println("Cell info display"); break;
						case 3:	System.out.println("Welcome note"); break;
						case 4:	System.out.println("Network selection"); break;
						case 5:	System.out.println("Confirm sim service action"); break;
						case 99:	menuStack.pop(); break;
						case 0:	System.exit(0);
						default:	System.out.println("Invalid command");
					}
					break;
				}

				case "securitySetting": {
					System.out.println("Security settings");
					String securitySetting = """
							1. Pin code request
							2. Call barring service 
							3. Fixed dialling
							4. Closed user group 
							5. Change access codes 
							99. Back
							0.  Exit
							""";
					System.out.println(securitySetting);
					int choice = inputCollector.nextInt();

					switch (choice) {
						case 1:	System.out.println("Pin code request"); break;
						case 2:	System.out.println("Call barring service"); break;
						case 3:	System.out.println("Fixed dialling"); break;
						case 4:	System.out.println("Closed user group"); break;
						case 5:	System.out.println("Change access code"); break;
						case 99:	menuStack.pop(); break;
						case 0:	System.exit(0);
						default:	System.out.println("Invalid command");
					}
					break;
				}

				case "music": {
					System.out.println("Music");
					String musicMenu = """
							1. Music player
							2. Radio 
							3. Recorder
							4. Track list
							99. Back
							0.  Exit
							""";
					System.out.println(musicMenu);
					int choice = inputCollector.nextInt();

					switch (choice) {
						case 1:	System.out.println("Music player"); break;
						case 2:	System.out.println("Radio"); break;
						case 3:	System.out.println("Record"); break;
						case 4:	System.out.println("Track list"); break;
						case 99:	menuStack.pop(); break;
						case 0:	System.exit(0);
						default:	System.out.println("Invalid command");
					}
					break;
				}

				case "clock": {
					System.out.println("Clock");
					String clockMenu = """
							1. Alarm clock
							2. Clock setting 
							3. Date setting 
							4. Stopwatch 
							5. Countdown timer
							6. Auto update of date and time 
							99. Back
							0.  Exit
							""";
					System.out.println(clockMenu);
					int choice = inputCollector.nextInt();

					switch (choice) {
						case 1:	System.out.println("Alarm clock"); break;
						case 2:	System.out.println("Clock setting"); break;
						case 3:	System.out.println("Date setting"); break;
						case 4:	System.out.println("Stopwatch"); break;
						case 5:	System.out.println("Countdown timer"); break;
						case 6:	System.out.println("Auto update of date and time"); break;
						case 99:	menuStack.pop(); break;
						case 0:	System.exit(0);
						default:	System.out.println("Invalid command");
					}
					break;
				}
			}

		} while (true);
	}
}
