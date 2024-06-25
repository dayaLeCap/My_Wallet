Digital Wallet

COLLABORATORS:

*Dayana Lema

*Daniela Yumbo

DATE:

25 - 06 - 2024


REQUIREMENTS:

JDK 21: Required to compile and run the project.

PROYECT DESCRIPTION:

This project is a digital wallet application developed in Java that allows
users to register and manage income and expense transactions. 
The application starts with an initial amount of $100. Users can register transactions of type "Sale" or "Buys". 
Each transaction updates the total amount available in the wallet and is saved in a table with a unique ID, 
the transaction date and time, and the corresponding amount.
For this we will use the “Apache NetBeans IDE” application version 21, with the java language, version 21.0.2.

USAGE:

Enter Amount: Input the amount in the "Amount" field.
Select Transaction Type: Click on the "Sale" button for sales or the "Buys" button for purchases.
Register Transaction: The transaction will be recorded in the table, and the available amount will be updated automatically.

EXAMPLE OF USAGE:

Execution 1: SALE

Enter an amount in the "Amount" field.
Click on the "Sale" button.
The application verifies that the entered amount is valid and does not exceed the available amount.
If valid, the available amount is reduced and the transaction is recorded in the table.
![image](https://github.com/dayaLeCap/My_Wallet/assets/169932438/e971738c-38b5-49c3-8828-56957cebfa1c)

Execution 2: BUY

Enter an amount in the "Amount" field.
Click on the "Buys" button.
The application verifies that the entered amount is valid.
If valid, the available amount is increased and the transaction is recorded in the table.
![image](https://github.com/dayaLeCap/My_Wallet/assets/169932438/2ef16d7e-8004-4ed1-b8e7-ed10ecebe053)

Execution 3: NO AMOUNT ENTERED

If no amount is entered, the application will show an error message asking for a valid amount.
![image](https://github.com/dayaLeCap/My_Wallet/assets/169932438/74f3f34c-eff8-45c5-8c9d-674183c147fa)

Execution 4: INVALID NUMBER

If a non-numeric or negative value is entered, the application will show an error message indicating that the amount must be a positive number.
![image](https://github.com/dayaLeCap/My_Wallet/assets/169932438/c5cf87f1-233d-4853-811f-e6af1402428f)

CODE STRUCTURE:

CLASS FRMWALLET
Local Variables: Defines the table headers, the table model, and the initial amount.
Method validateAmount: Validates that the entered amount is positive and not empty.
Method registerExpense: Registers a sale or purchase transaction, updates the available amount, and adds the transaction to the table.
Method randomid: Generates a random ID for each transaction.
Method getDate: Gets the current date and time formatted.
Method hideColumns: Hides the ID column in the table.

CLASS EXPENSE

Attributes: Defines the attributes id, type, date, and amount.
Constructor: Initializes the transaction attributes.
Getters: Methods to get the attribute values.
Method addOperation: Adds a transaction to the table model.

TO ENTER THE FOLDER WHERE THE EXECUTABLE PROGRAM IS LOCATED, CLICK ON "MY WALLET" AND IT IS THERE.

![image](https://github.com/dayaLeCap/My_Wallet/assets/169932438/b04c8c3c-9031-414f-9144-a8e93036dbfe)

Then click on the "Src" folder and inside this other folder "executable program" click on those folders, and there is the executable program.exe
![image](https://github.com/dayaLeCap/My_Wallet/assets/169932438/753535db-04ea-4e3f-91cb-f0f1f24883e5)

![image](https://github.com/dayaLeCap/My_Wallet/assets/169932438/321b5c26-e94a-42f1-8884-e10012d77663)

![image](https://github.com/dayaLeCap/My_Wallet/assets/169932438/c85a7f9e-3206-452c-b3f8-c8ef083256de)


CONTACT:

If you have any questions, you can contact me at the following number [0998786649].

I hope you like our project "THANK YOU VERY MUCH"






